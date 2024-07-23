package com.example;

public class CalculadoraDescontos {
    private DescontoStrategy descontoStrategy;

    public CalculadoraDescontos(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularDesconto(double consumo) {
        return descontoStrategy.calcularDesconto(consumo);
    }
}
