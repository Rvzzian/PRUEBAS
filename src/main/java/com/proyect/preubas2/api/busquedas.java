
package com.proyect.preubas2.api;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;


public class busquedas {
    public List<String> obtenerPokemonesPorTipo(String tipo) {
        List<String> pokemones = new ArrayList<>();
         try {
            // Crear un cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            
            // URL de la API con el tipo de Pokémon
            String url = "https://pokeapi.co/api/v2/type/" + tipo.toLowerCase();
            
            // Crear la solicitud HTTP GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            
            // Enviar la solicitud y recibir la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            // Verificar si la respuesta fue exitosa
            if (response.statusCode() != 200) {
                System.out.println("Tipo no encontrado: " + tipo);
                return pokemones;
            }

            // Procesar la respuesta JSON
            JSONObject jsonObject = new JSONObject(response.body());
            JSONArray pokemonArray = jsonObject.getJSONArray("pokemon");

            // Extraer los nombres de los Pokémon y agregarlos a la lista
            for (int i = 0; i < pokemonArray.length(); i++) {
                JSONObject pokemon = pokemonArray.getJSONObject(i).getJSONObject("pokemon");
                pokemones.add(pokemon.getString("name"));
            }

        } catch (Exception e) {
            System.out.println("Error al obtener Pokemones: " + e.getMessage());
        }
        
        return pokemones;
    }
    
}
