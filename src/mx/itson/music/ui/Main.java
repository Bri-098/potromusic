/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.enums.Género;

/**
 *
 * @author icesp
 */
public class Main {
    public static void main(String[] args) {
        //datos del artista
        Artista artista = new Artista();
        artista.setNombre("The Midnight");
        artista.setSitioWeb("www.themidnight.com");
        
        //datos del album
        Album a = new Album();
        a.setNombre("Endless Summer");
        a.setLanzamiento(2016);
        a.setArtista(artista);
        a.setGénero(Género.OTRO);
        
        List<Canción> canciones = new ArrayList<>();
    }
}
