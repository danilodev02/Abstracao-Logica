package br.edu.fatecpg.tecprog.abstracao.model;

public class Vendedor {
	private String nome;
	private double totalVendas;
	private double percentualComissao;
	private double SALARIO_BASE = 2000.00;

	public Vendedor(String nome, double totalVendas, double percentualComissao) {
		this.nome = nome;
		this.totalVendas = totalVendas;
		this.percentualComissao = percentualComissao;
	}
	
	public double CalcComissao() {
		return totalVendas * (percentualComissao / 100);
	}
	
	public double CalcSalarioFinal() {
		return SALARIO_BASE + CalcComissao();
	}
	
	public void MostrarDados() {
        System.out.println("===== Resumo do Vendedor =====");
        System.out.println("Nome:              " + nome);
        System.out.printf("Total de Vendas:   R$ %.2f%n", totalVendas);
        System.out.printf("Comissão (%.0f%%):   R$ %.2f%n", percentualComissao, CalcComissao());
        System.out.printf("Salário Base:      R$ %.2f%n", SALARIO_BASE);
        System.out.printf("Salário Final:     R$ %.2f%n", CalcSalarioFinal());
        System.out.println("==============================");
	}
}
