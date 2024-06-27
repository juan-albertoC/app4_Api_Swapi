/*
Juan Alberto Cuevas Juarez
27/06/2024
Poo con API Star-Wars Movies
 */

//record clase, que se utiliza con similitud de los atributos de la API  que toma tambien como parametros
public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {

}
