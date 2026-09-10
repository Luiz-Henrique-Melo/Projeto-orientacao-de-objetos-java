package com.formasgeometricas;

public class Retangulo implements FormaGeometrica {
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("A largura e a altura devem ser maiores que zero.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
