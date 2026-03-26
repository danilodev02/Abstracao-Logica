package br.edu.fatecpg.tecprog.abstracao.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    


public void entradaEstoque(int qtd) {
        quantidade += qtd;
        System.out.println("Entrada: " + qtd + " un. Estoque atual: " + quantidade);
    }

    public void saidaEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Saída: " + qtd + " un. Estoque atual: " + quantidade);
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
}
