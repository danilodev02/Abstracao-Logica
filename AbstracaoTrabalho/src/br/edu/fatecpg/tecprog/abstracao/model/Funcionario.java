package br.edu.fatecpg.tecprog.abstracao.model;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aplicarAumento(double percentual) {
        salario += salario * (percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
}
