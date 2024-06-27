/*
Juan Alberto Cuevas Juarez
27/06/2024
Poo con API Star-Wars Movies
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in); //declarar lectura de tipo Scanner con un new para construir entrada de datos

        //hacer consulta siguiendo una estructura como: clase ConsultaPelicula, objeto, palabra reservada new,constructor
        ConsultaPelicula consulta  = new  ConsultaPelicula();

        //pide al usuario el numero de la pelicula a consultar
        System.out.println("Escribe el numero de la pelicula de Star Wars que quiere consultar: ");

        try{ //se ha agregado un try

            //leer el numero de pelicula que el usuario ha ingresado
            var numeroDePelicula = Integer.valueOf(lectura.nextLine()); //valor que el usuario ha ingresado en una variable

            //Pelicula pelicula = consulta.buscaPelicula(1); //objeto consulta tiene su metodo buscaPelicula con parametro de prueba 1, ese metodo devueleve una instancia de tipo Pelicula
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);  //eliminar el 1, existe problema de ya que es un int se cambio a un string por ello hacer parse
            //imprime pelicula
            System.out.println(pelicula);

            //llamar generador de archivo
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        }catch(NumberFormatException e){

            System.out.println("Numero no encontrado "+e.getMessage());

        }catch(RuntimeException | IOException e){   //se ha agregado un catch para que si se recibe RuntimeException("No encontre esa pelicula") asi capturar exception

            System.out.println(e.getMessage()); //obtener ese mensaje de RuntimeException
            System.out.println("Finalizando la aplicacion"); //nuevo mensaje


        }






    }
}
