package br.edu.fatecpg.tecprog.abstracao.model;

public class Carro {
    private String marca;
    private double consumoKmPorLitro;
    private double combustivelAtual;
	
	public Carro(String marca, double consumoKmPorLitro, double combustivelAtual) {
		this.marca = marca;
		this.consumoKmPorLitro = consumoKmPorLitro;
		this.combustivelAtual = combustivelAtual;
	}
	
	public double CalcAutonomia() {
		return combustivelAtual * consumoKmPorLitro;
	}
	
	public void simularViagem(double distanciaKm) {
		double litrosNecessarios = distanciaKm / combustivelAtual;
		
		if (litrosNecessarios > combustivelAtual) {
			double kmPossiveis = CalcAutonomia();
			
			System.out.println("Combustível insuficiente para percorrer " + distanciaKm + " km.");
            System.out.printf("O carro consegue percorrer apenas %.2f km com o combustível atual.%n", kmPossiveis);
		} else {
			combustivelAtual -= litrosNecessarios;
			
			System.out.printf("Viagem de %.2f km realizada com sucesso!%n", distanciaKm);
            System.out.printf("Combustível consumido: %.2f L%n", litrosNecessarios);
            System.out.printf("Combustível restante:  %.2f L%n", combustivelAtual);
		}
	}
	
	public void Abastecer(double litros) {
		if (litros <= 0) {
			System.out.println("Quantidade inválida para abastecimento.");
            return;
            
		}
		
		combustivelAtual += litros;
        System.out.printf("Abastecido com %.2f L. Combustível atual: %.2f L%n", litros, combustivelAtual);
	}
	
	public void MostrarDados() {
		System.out.println("===== Status do Veículo =====");
        System.out.println("Marca:             " + marca);
        System.out.printf("Consumo:           %.2f km/L%n", consumoKmPorLitro);
        System.out.printf("Combustível atual: %.2f L%n", combustivelAtual);
        System.out.printf("Autonomia restante:%.2f km%n", CalcAutonomia());
        System.out.println("=============================");
	}
}
