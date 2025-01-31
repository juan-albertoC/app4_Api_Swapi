/*
Juan Alberto Cuevas Juarez
27/06/2024
Poo con API Star-Wars Movies
 */

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscaPelicula(int numeroDePelicula){   //nombre del metodo es buscaPelicula() con parametros entero para generar una URL, que va adevolver una Pelicula

        //Crear propia URI generada a partir de nueva dirección proporcionada por la API SWAPI

        URI direccion = URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula+"/");  //concatenar el número de la película que deseamos consultar al final de la URL base https://swapi.py4e.com/api/films/. y después de adicionar el número de la película es importante concatenar nuevamente con "/" para que la requisición pueda ser ejecutada correctamente

        //--------------------Request desde javadoc 17 jdk------------------------
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        //------------------------------------------------------------------------

        //-------------------Response desde javadoc 17 jdk------------------------HttpResponse<String> response = client  se cambio tras el try catch
        //HttpResponse<String> response = null;

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //colocar el return dentro del try en caso que response sea null habra problemas
            return new Gson().fromJson(response.body(), Pelicula.class);
        } catch (Exception  e) {                        //ahora solo con Exception pero anteriormente juntar excepciones con | pipe, IOException | InterruptedException
            throw new RuntimeException("No encontre esa pelicula"); //ahora hay mensaje, anteriormente solo letra e
        }
        //------------------------------------------------------------------------
        //aqui estaba el try
    }

}
