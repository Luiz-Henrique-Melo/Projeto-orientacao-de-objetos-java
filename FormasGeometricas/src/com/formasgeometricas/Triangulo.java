package com.formasgeometricas;

public class Triangulo extends FormaGeometrica {
    private final double base;
    private final double altura;
    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        if (base <= 0 || altura <= 0 || ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("As medidas do triangulo devem ser maiores que zero.");
        }
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new IllegalArgumentException("Os lados nao formam um triangulo valido.");
        }
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Triângulo [Base: " + this.base + ", Altura: " + this.altura + "]");
    }
}
