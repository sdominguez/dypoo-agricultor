package com.string;

public class Libro {
    private String titulo;
    private String autor;
    private String insb;
    private int año;

    public Libro(String titulo, String autor, String insb, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.insb = insb;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInsb() {
        return insb;
    }

    public void setInsb(String insb) {
        this.insb = insb;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", insb='" + insb + '\'' +
                ", año=" + año +
                '}';
    }
}
