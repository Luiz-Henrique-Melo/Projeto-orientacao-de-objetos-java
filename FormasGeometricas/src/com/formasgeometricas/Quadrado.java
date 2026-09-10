package com.formasgeometricas;

public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getLargura();
    }
}
