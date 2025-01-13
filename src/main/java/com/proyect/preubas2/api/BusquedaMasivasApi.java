
package com.proyect.preubas2.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;



public class BusquedaMasivasApi {
    public List<String> obtenerPokemonesPorTipo(String tipo) {
        List<String> pokemones = new ArrayList<>();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/type/" + tipo.toLowerCase());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            if (conn.getResponseCode() != 200) {
                JOptionPane.showMessageDialog(null, "Tipo no encontrado. Verifique el nombre del tipo ingresado.");
                return pokemones;
            }
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray pokemonArray = jsonObject.getJSONArray("pokemon");
            
            for (int i = 0; i < pokemonArray.length(); i++) {
                JSONObject pokemon = pokemonArray.getJSONObject(i).getJSONObject("pokemon");
                pokemones.add(pokemon.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Pokemones: " + e.getMessage());
        }
        return pokemones;
    }
        public List<String> obtenerPokemonesPorGeneracion(int generacion) {
        List<String> pokemones = new ArrayList<>();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/generation/" + generacion);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            if (conn.getResponseCode() != 200) {
                JOptionPane.showMessageDialog(null, "Generación no encontrada. Verifique el número de generación.");
                return pokemones;
            }
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray pokemonArray = jsonObject.getJSONArray("pokemon_species");
            
            for (int i = 0; i < pokemonArray.length(); i++) {
                JSONObject pokemon = pokemonArray.getJSONObject(i);
                pokemones.add(pokemon.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Pokemones: " + e.getMessage());
        }
        return pokemones;
    }
}
