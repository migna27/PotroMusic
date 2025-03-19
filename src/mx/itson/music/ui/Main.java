/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Cancion;
import mx.itson.music.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Album album = new Album();
        
        /*
        Artista black = new Artista();
        black.setNombre("black pink");
        a.setNombre("Born Pink");
        a.setLanzamiento(2022);
        a.setGenero(Genero.POP);
        */
        System.out.println("Ingrese el nombre del album");
       String nombreAlbum = scan.nextLine();
       album.setNombre(nombreAlbum);
      try{ 
       Artista artis = new Artista();
       System.out.println("Ingrese el nombre del artista");
       String artista = scan.nextLine();
       artis.setNombre(artista);
       album.setArtista(artis);
       
       //definimos valores de atributo por defecto para artista
       artis.setDescripcion("Cantante de musica");
       artis.setSitio("www.artis.com");
       album.setGenero(Genero.OTRO);
       
       List<Cancion> canciones = new ArrayList<>();
        album.setCanciones(canciones);
        Cancion cancion = new Cancion();
            OUTER:
            while (true) {
                System.out.println("agregar una nueva cancion 1(si) o 2(no)");
                String opcion = scan.nextLine();
                switch (opcion) {
                    case "1" -> {
                        System.out.println("Ingrese el nombre de la canción: ");
                        String nombreCancion = scan.nextLine();
                        cancion.setNombre(nombreCancion);
                        System.out.println("Ingrese el orden de la canción: ");
                        int ordenCancion = scan.nextInt();
                        scan.nextLine(); 
                        cancion.setOrden(ordenCancion);
                        System.out.println("ingrese la duracion de la cancion");
                        int duracion = scan.nextInt();
                        cancion.setDuracion(duracion);
                        canciones.add(cancion); 
                        System.out.println("¡Canción registrada exitosamente!");
               }
                    case "2" -> {
                        System.out.println("Registro de canciones finalizado.");
                        break OUTER;
               }
                    default -> System.out.println("elija una opcion valida");
                }
            }
        for(Cancion c : album.getCanciones()){
           System.out.println(c.getOrden());
           System.out.println(c.getNombre());
           System.out.println(c.getDuracion());
           System.out.println("-------------------------------------------");
        }
    }catch(Exception e) {
    System.err.println("ocurrio un error en la ejecucion");
    }
    }
}
