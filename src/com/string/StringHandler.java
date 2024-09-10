package com.string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringHandler {

    public static void main(String[] args) {
        String libro = "Harry Potter y el Caliz de Fuego, 321654987, J. Rowling, 2004";
        String[] datos = libro.split(",");

        System.out.println("Numero de datos: "+datos.length);
        System.out.println(datos[3]);
        Libro l1 = new Libro(datos[0].trim().toUpperCase(),
                datos[2].trim().toUpperCase(),
                datos[1].trim().toUpperCase(),
                Integer.valueOf(datos[3].trim()));
        System.out.println(l1.toString());

        /*Arreglo de String*/
        ArrayList<String> librosStr = new ArrayList();
        librosStr.add("Harry Potter y el Caliz de Fuego, 321654987, J. Rowling, 2004");
        librosStr.add("Harry Potter y la piedra filosofal, 6589955654, J. Rowling, 2001");
        librosStr.add("Harry Potter y la cámara secreta, 9876514645, J. Rowling, 2002");
        librosStr.add("Harry Potter y prisionaro de azkaban, 987524685, J. Rowling, 2003");
        librosStr.add("El señor de los anillos, 6549875975, J.R. R. Tolkien, 2000");

        ArrayList<Libro> libros = new ArrayList();
        for(String l : librosStr){
            String[] data = l.split(",");
            libros.add(
            new Libro(data[0].trim().toUpperCase(),
                    data[2].trim().toUpperCase(),
                    data[1].trim().toUpperCase(),
                    Integer.valueOf(data[3].trim())));
        }

        System.out.println("Total libros agregados: "+libros.size());
        for(int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).toString());
        }


    }

}
