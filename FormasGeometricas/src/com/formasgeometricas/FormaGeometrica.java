package com.formasgeometricas;

public abstract class FormaGeometrica {

    // 1. Método genérico estruturado (Sua tarefa)
    public void desenhar() {
        // Usa o getSimpleName() para imprimir o nome da classe filha que está sendo desenhada
        System.out.println("Desenhando a forma: " + this.getClass().getSimpleName());
    }

    // 2. Método abstrato de área (Sua tarefa)
    public abstract double calcularArea();

    // 3. Método abstrato de perímetro (Adicionado para não quebrar o código da Pessoa 2 e 3)
    public abstract double calcularPerimetro();
}