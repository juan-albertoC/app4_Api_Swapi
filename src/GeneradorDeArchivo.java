/*
Juan Alberto Cuevas Juarez
27/06/2024
Poo con API Star-Wars Movies
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula) throws IOException {  //No retorna nada por eso es void

        Gson gson = new GsonBuilder().setPrettyPrinting().create();  //builder transforma el objeto en Json
        FileWriter escritura = new FileWriter(pelicula.title()+".json");//Guardar el archivo cuyo nombre es el nombre de la pelicula
        escritura.write(gson.toJson(pelicula));  //conversion e gson a Json de dicha pelicula
        escritura.close();


    }
}
