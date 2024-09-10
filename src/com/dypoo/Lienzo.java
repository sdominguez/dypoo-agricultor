package com.dypoo;

public class Lienzo {
    private int size;
    private char[][] lienzo;

    public Lienzo(){
        size = 10;
        lienzo = new char[size][size];
        clean();
    }

    public Lienzo(int size){
        this.size = size;
        lienzo = new char[size][size];
        clean();
    }

    public  void resize(int size){
        this.size = size;
        lienzo = new char[size][size];
        clean();
    }

    public void clean(){
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                lienzo[i][j]=' ';
            }
        }
    }

    // Coloca el caracter c en la posición x,y
    public  void setPen(int x, int y, char c) {
        if(x < 0 || y >= size) return;
        int pos = size-1;
        lienzo[pos-y][x] = c;
    }


    public void paint() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(lienzo[i][j]);
            }
            System.out.println("");
        }
    }


}
