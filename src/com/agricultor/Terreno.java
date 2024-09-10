package com.agricultor;

import com.dypoo.Lienzo;

public class Terreno extends Lienzo {

    private double ancho;
    private double alto;

    public Terreno(double ancho, double alto) {
        super((int) ancho);
        this.ancho = ancho;
        this.alto = alto;
        paintTerreno();
    }

    private void paintTerreno(){
        for(int x = 0; x < ancho; x++){
            setPen(x, (int) rioBordeSuperior(x), '*');
            setPen(x, (int) rioBordeInferior(x), '*');
        }
    }

    public double rioBordeSuperior(double x){
        return 70.0 + 8.0 * Math.sin(x / 35.0) * Math.cos(x / 20.0);
    }

    public double rioBordeInferior(double x){

        return 50.0 + 5.0 * Math.sin(x / 10.0) * Math.cos(x / 15.0);
    }

    public double desperdicio(double x){
        return rioBordeSuperior(x) - rioBordeInferior(x);
    }

    public double areaEfectiva(int precision)
    {
        return (ancho * alto) - Reimman.area(0, ancho, precision,this);
    }

    @Override
    public String toString() {
        return "Este terreno es de "+ancho+" x "+alto+" \n"+
                "su área efectiva es: "+areaEfectiva(5000);
    }
}
