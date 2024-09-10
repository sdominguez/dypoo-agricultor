package com.agricultor;

import com.dypoo.Lienzo;

public class Agricultor {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(100,100);
        //System.out.println("Area efectiva: "+terreno.areaEfectiva(5000));
        System.out.println(terreno.toString());
        terreno.paint();

    }
}
