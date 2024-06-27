/*
Juan Alberto Cuevas Juarez
27/06/2024
Poo con API Star-Wars Movies
 */

public class Main {
    public static void main(String[] args) {

        //hacer consulta siguiendo una estructura como: clase ConsultaPelicula, objeto, palabra reservada new,constructor
        ConsultaPelicula consulta  = new  ConsultaPelicula();

        Pelicula pelicula = consulta.buscaPelicula(1); //objeto consulta tiene su metodo buscaPelicula con parametro de prueba 1, ese metodo devueleve una instancia de tipo Pelicula

        //imprime pelicula
        System.out.println(pelicula);





    }
}
