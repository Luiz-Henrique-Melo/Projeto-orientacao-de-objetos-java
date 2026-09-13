package com.formasgeometricas;

public class Circulo extends FormaGeometrica {
    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo com raio: " + this.raio);
    }
}
