package br.edu.fatecpg.tecprog.abstracao.model;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double CalcIMC() {
		return peso / (altura * altura);
	}
	
	public String ClassifIMC() {
		double imc = CalcIMC();
		
		if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade Grau I";
        } else if (imc < 40.0) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (Mórbida)";
        }
	}
	
	public void MostrarDados() {
		 System.out.println("===== Resultado IMC =====");
         System.out.println("Nome:           " + nome);
         System.out.printf("Peso:           %.1f kg%n", peso);
         System.out.printf("Altura:         %.2f m%n", altura);
         System.out.printf("IMC:            %.2f%n", CalcIMC());
         System.out.println("Classificação:  " + ClassifIMC());
         System.out.println("=========================");
	}
}
