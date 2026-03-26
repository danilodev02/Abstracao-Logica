package br.edu.fatecpg.tecprog.abstracao.model;

public class Viagem {
	 private String destino;
     private double distanciaKm;
     private double consumoKmPorLitro; 
     private double precoCombustivel;  
   
     public Viagem(String destino, double distanciaKm, double consumoKmPorLitro, double precoCombustivel) {
    	 this.destino = destino;
    	 this.distanciaKm = distanciaKm;
    	 this.consumoKmPorLitro = consumoKmPorLitro;
    	 this.precoCombustivel = precoCombustivel;
     }
     
     public double CalcLitrosQnt() {
    	 return distanciaKm / consumoKmPorLitro;
     }
     
     public double CalcCustoTotal() {
    	 return CalcLitrosQnt() * precoCombustivel;
     }
     
     public void MostrarDados() {
         System.out.println("===== Planejamento de Viagem =====");
         System.out.println("Destino:            " + destino);
         System.out.printf("Distância:          %.2f km%n", distanciaKm);
         System.out.printf("Consumo do carro:   %.2f km/L%n", consumoKmPorLitro);
         System.out.printf("Preço combustível:  R$ %.2f/L%n", precoCombustivel);
         System.out.printf("Litros necessários: %.2f L%n", CalcLitrosQnt());
         System.out.printf("Custo total:        R$ %.2f%n", CalcCustoTotal());
         System.out.println("==================================");
     }
}
