/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
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
        Album a = new Album();
        Artista black = new Artista();
        black.setNombre("black pink");
        
        
        a.setNombre("Born Pink");
       a.setLanzamiento(2022);
       a.setGenero(Genero.POP);
     
       
       
       List<Cancion> canciones = new ArrayList<>();
        a.setCanciones(canciones);
    }
}
