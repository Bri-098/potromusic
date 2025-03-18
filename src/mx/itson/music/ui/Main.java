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
import mx.itson.music.entidades.Canción;
import mx.itson.music.enums.Género;

/**
 *
 * @author icesp
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Artista artista = new Artista();
        Album a = new Album();
        
        try{
            // inicio y insertado de datos
            System.out.println("------------------------\nBienvenido a PotroMusic!");
            System.out.println("------------------------");
            
            
            //datos album
            System.out.println("Inserta el nombre de un Album: ");
            String nombreAlbum = sc.nextLine();
            a.setNombre(nombreAlbum);
            
            System.out.println("Inserta el anio de lanzamiento del album: ");
            int lanzamientoAlbum = sc.nextInt();
            
            a.setLanzamiento(lanzamientoAlbum);
            System.out.println("Elige el genero del album: ");
            //.values() = pone todos los valores del enum en un array
            Género[] tipos = Género.values();
            // for para que imprima todos los valores de genero
            for (int i = 0; i < tipos.length; i++) {
                Género tipo = tipos[i];
                System.out.println(tipo);
                
            }
            System.out.println("Escribe que genero es: ");
            String generoAlbum = sc.next().toUpperCase(); //next para que lea el primer dato, respuesta convertida a mayusculas
            Género tipoSeleccionado = Género.valueOf(generoAlbum); // le da nombre al genero y lo selecciona conforme a la respuesta del usuario
            a.setGénero(tipoSeleccionado);
            sc.nextLine(); // si no ponia esto el nombre del artista no existia xd
            
            //datos artista
            a.setArtista(artista);
            System.out.println("Inserta el nombre del artista del album: ");
            String nombreArtista = sc.nextLine();
            artista.setNombre(nombreArtista);
            
            System.out.println("Inserta el sitio web del artista: ");
            String sitioWebArtista = sc.nextLine();
            artista.setSitioWeb(sitioWebArtista);
            
            System.out.println("Inserta la descripcion del artista: ");
            String descripcionArtista = sc.nextLine();
            artista.setDescripcion(descripcionArtista);
            
            // creacion de lista de canciones de un arreglo
            List<Canción> canciones = new ArrayList<>();
            
            System.out.println("Deseas agregar una cancion al album?");
            System.out.println("1 - si ; 2 - no ");
            int decision = sc.nextInt();
            sc.nextLine(); // el salto de linea despues del numero
            
            while (decision == 1) {
                Canción cancion = new Canción();
                
                System.out.println("Dame el nombre de la cancion: ");
                String nombre = sc.nextLine();
                cancion.setNombre(nombre);
                
                System.out.println("Dame la duracion de la cancion: ");
                int duracion = sc.nextInt();
                cancion.setDuracion(duracion);
                
                System.out.println("Dame el numero de el orden de la cancion: ");
                int orden = sc.nextInt();
                cancion.setOrden(orden);
                
                canciones.add(cancion); //agrega la cancion a la lista
                
                System.out.println("Desea agregar otra cancion?\n 1 - si ; 2 - no ");
                decision = sc.nextInt();
                sc.nextLine(); //quien codifico el nextint??!??
            }
            
            //listado de datos
            System.out.println("-------------------");
            System.out.println("Datos del album: \n-------------------");
            System.out.println("nombre: " + a.getNombre());
            System.out.println("lanzamiento: " + a.getLanzamiento());
            System.out.println("genero: " + a.getGénero());
            System.out.println("-------------------");
            System.out.println("Datos del artista \n-------------------");
            System.out.println("nombre: " + artista.getNombre());
            System.out.println("sitio web: " + artista.getSitioWeb());
            System.out.println("descripcion: " + artista.getDescripcion());
            System.out.println("-------------------");
            System.out.println("Lista de canciones\n-------------------");
            for (Canción cancion : canciones) {
                System.out.println("Nombre: " + cancion.getNombre());
                System.out.println("Duracion: " + cancion.getDuracion());
                System.out.println("Orden: " + cancion.getOrden());
                System.out.println("-------------------");
            }
            
            
        }catch (Exception ex) {
            System.err.println("Se ha identificado un error, intentalo de nuevo mas tarde.");
        }
        /**
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
        **/
    }
}
