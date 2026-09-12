package com.formasgeometricas;

public abstract class FormaGeometrica {

    public void desenhar() {
        // Usa o getSimpleName() para imprimir o nome da classe filha que está sendo desenhada
        System.out.println("Desenhando a forma: " + this.getClass().getSimpleName());
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}