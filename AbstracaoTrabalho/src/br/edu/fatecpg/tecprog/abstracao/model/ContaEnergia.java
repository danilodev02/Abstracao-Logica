package br.edu.fatecpg.tecprog.abstracao.model;

public class ContaEnergia {
	private String titular;
	private double consumoKwh;
	private double valorPorKwh;
	
	public ContaEnergia(String titular, double consumoKwh, double valorPorKwh) {
		this.titular = titular;
		this.consumoKwh = consumoKwh;
		this.valorPorKwh = valorPorKwh;
	}
	
	public double CalcValorBruto() {
		return consumoKwh * valorPorKwh;
	}
	
	public double CalcDesconto() {
		double bruto = CalcValorBruto();
		if (consumoKwh <= 100) {
			return bruto * 0.20;
		} else if (consumoKwh <= 200) { 
			return bruto * 0.10;
		} else {
			return 0.0;
		}
	}
	
	public double CalcValorFinal() {
		return CalcValorBruto() - CalcDesconto();
	}
	
	public void MostrarDados() {
        System.out.println("===== Conta de Energia =====");
        System.out.println("Titular:         " + titular);
        System.out.printf("Consumo:         %.2f kWh%n", consumoKwh);
        System.out.printf("Valor por kWh:   R$ %.2f%n", valorPorKwh);
        System.out.printf("Valor Bruto:     R$ %.2f%n", CalcValorBruto());
        System.out.printf("Desconto:        R$ %.2f%n", CalcDesconto());
        System.out.printf("Valor Final:     R$ %.2f%n", CalcValorFinal());
        System.out.println("============================");
	}
}
