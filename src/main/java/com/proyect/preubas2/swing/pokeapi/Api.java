
package com.proyect.preubas2.swing.pokeapi;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Api {
    private static final String Fire = "https://pokeapi.co/api/v2/type/fire";
    
    public static class Pokemon{
        public final String name;
        public final String imageUrl;
        public final double weight;
        public final double height;

        public Pokemon(String name, String imageUrl, double weight, double height) {
            this.name = name;
            this.imageUrl = imageUrl;
            this.weight = weight;
            this.height = height;
        }
                @Override
        public String toString() {
            return "Nombre: " + name + "\n" +
                   "Imagen: " + imageUrl + "\n" +
                   "Peso: " + weight + " kg\n" +
                   "Altura: " + height + " m\n";
        }
        
    }
    
    public static List<Pokemon>getFirePokemon()throws Exception{
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(Fire))
        .GET()
        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if(response.statusCode()==200){
            JSONObject json =new JSONObject(response.body());
            JSONArray pokemonArray = json.getJSONArray("pokemon");
            
            List<Pokemon> firePokemon = new ArrayList<>();
             for (int i = 0; i < pokemonArray.length(); i++) {
                JSONObject pokemonEntry = pokemonArray.getJSONObject(i).getJSONObject("pokemon");
                String name = pokemonEntry.getString("name");
                String detailsUrl = pokemonEntry.getString("url");          
                
                Pokemon pokemonDetails = getPokemonDetails(detailsUrl, client);
                firePokemon.add(pokemonDetails);
             }
            return firePokemon;

        } else {
            throw new Exception("Error al obtener Pokémon de tipo fuego: " + response.statusCode());
        
        }
    }
    private static Pokemon getPokemonDetails(String url, HttpClient client) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            JSONObject json = new JSONObject(response.body());
            String name = json.getString("name");
            double weight = json.getDouble("weight") / 10.0; // Convertir a kilogramos
            double height = json.getDouble("height") / 10.0; // Convertir a metros
            JSONObject sprites = json.getJSONObject("sprites");

            String imageUrl = null;
            if (sprites.has("front_default") && !sprites.isNull("front_default")) {
                imageUrl = sprites.getString("front_default");
            } else {
                imageUrl = "URL_DEFAULT_IMAGE"; // Aquí puedes poner una URL de imagen por defecto
            }
            return new Pokemon(name, imageUrl, weight, height);
        } else {
            throw new Exception("Error al obtener detalles del Pokémon: " + response.statusCode());
        }
    }
    
}
