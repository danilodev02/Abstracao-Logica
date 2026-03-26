package br.edu.fatecpg.tecprog.abstracao.model;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double converterParaFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double converterParaKelvin() {
        return celsius + 273.15;
    }

    public double getCelsius() { return celsius; }
}

