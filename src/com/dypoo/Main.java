package com.dypoo;

public class Main {

    public static void main(String[] args) {
        Lienzo lienzo = new Lienzo(100);
        for(int i = 0; i < 5; i++){
            lienzo.setPen(i, i, '*');
        }
        lienzo.paint();
        lienzo.clean();
        for (double x = 0; x <= 10; x += 0.5) {
            double y = sphere(x);
            System.out.println(x+", "+y);
            lienzo.setPen((int) Math.round(x), (int) Math.round(y), '*');
        }
        lienzo.paint();
    }

    public static double sphere(double x){
        return x*x;
    }

}
