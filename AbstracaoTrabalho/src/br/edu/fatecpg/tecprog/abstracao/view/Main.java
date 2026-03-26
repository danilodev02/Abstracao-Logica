package br.edu.fatecpg.tecprog.abstracao.view;
import br.edu.fatecpg.tecprog.abstracao.model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1.  Marcenaria (Retangulo)");
            System.out.println("2.  RH de Empresa (Funcionario)");
            System.out.println("3.  Banco Digital (Conta Bancaria)");
            System.out.println("4.  Controle de Estoque (Produto)");
            System.out.println("5.  Sistema Escolar (Aluno)");
            System.out.println("6.  Veiculos (Carro)");
            System.out.println("7.  Conversor de Temperatura");
            System.out.println("8.  Industria de Bolas (Esfera)");
            System.out.println("9.  Sistema de Vendas (Vendedor)");
            System.out.println("10. Conta de Energia");
            System.out.println("11. Planejamento de Viagem");
            System.out.println("12. Saude (IMC)");
            System.out.println("0.  Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    System.out.print("Largura (m): ");
                    double largura = Double.parseDouble(sc.nextLine());
                    System.out.print("Altura (m): ");
                    double alturaRet = Double.parseDouble(sc.nextLine());

                    Retangulo retangulo = new Retangulo(largura, alturaRet);
                    System.out.printf("Area: %.2f m²%n", retangulo.calcularArea());
                    System.out.printf("Perimetro: %.2f m%n", retangulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Nome do funcionario: ");
                    String nomeFuncionario = sc.nextLine();
                    System.out.print("Salario inicial (R$): ");
                    double salario = Double.parseDouble(sc.nextLine());

                    Funcionario funcionario = new Funcionario(nomeFuncionario, salario);

                    int opFunc;
                    do {
                        System.out.println("\n--- Menu Funcionario ---");
                        System.out.println("1. Ver salario atual");
                        System.out.println("2. Aplicar aumento");
                        System.out.println("3. Ver salario anual");
                        System.out.println("0. Voltar");
                        System.out.print("Opcao: ");
                        opFunc = Integer.parseInt(sc.nextLine());

                        switch (opFunc) {
                            case 1:
                                System.out.printf("Salario de %s: R$ %.2f%n", funcionario.getNome(), funcionario.getSalario());
                                break;
                            case 2:
                                System.out.print("Percentual de aumento (%): ");
                                double percentual = Double.parseDouble(sc.nextLine());
                                funcionario.aplicarAumento(percentual);
                                System.out.printf("Novo salario: R$ %.2f%n", funcionario.getSalario());
                                break;
                            case 3:
                                System.out.printf("Salario anual: R$ %.2f%n", funcionario.calcularSalarioAnual());
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opFunc != 0);
                    break;

                case 3:
                    System.out.print("Nome do titular: ");
                    String titular = sc.nextLine();
                    System.out.print("Saldo inicial (R$): ");
                    double saldoInicial = Double.parseDouble(sc.nextLine());

                    ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

                    int opConta;
                    do {
                        System.out.println("\n--- Menu Conta Bancaria ---");
                        System.out.println("1. Ver saldo");
                        System.out.println("2. Depositar");
                        System.out.println("3. Sacar");
                        System.out.println("0. Voltar");
                        System.out.print("Opcao: ");
                        opConta = Integer.parseInt(sc.nextLine());

                        switch (opConta) {
                            case 1:
                                System.out.printf("Saldo de %s: R$ %.2f%n", conta.getTitular(), conta.getSaldo());
                                break;
                            case 2:
                                System.out.print("Valor do deposito (R$): ");
                                double deposito = Double.parseDouble(sc.nextLine());
                                conta.depositar(deposito);
                                break;
                            case 3:
                                System.out.print("Valor do saque (R$): ");
                                double saque = Double.parseDouble(sc.nextLine());
                                conta.sacar(saque);
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opConta != 0);
                    break;

                case 4:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.print("Preco (R$): ");
                    double preco = Double.parseDouble(sc.nextLine());
                    System.out.print("Quantidade inicial: ");
                    int quantidade = Integer.parseInt(sc.nextLine());

                    Produto produto = new Produto(nomeProduto, preco, quantidade);

                    int opProduto;
                    do {
                        System.out.println("\n--- Menu Produto ---");
                        System.out.println("1. Ver estoque");
                        System.out.println("2. Entrada de estoque");
                        System.out.println("3. Saida de estoque");
                        System.out.println("0. Voltar");
                        System.out.print("Opcao: ");
                        opProduto = Integer.parseInt(sc.nextLine());

                        switch (opProduto) {
                            case 1:
                                System.out.printf("Produto: %s | Qtd: %d | Valor total: R$ %.2f%n",
                                        produto.getNome(), produto.getQuantidade(), produto.calcularValorTotalEstoque());
                                break;
                            case 2:
                                System.out.print("Quantidade de entrada: ");
                                int entrada = Integer.parseInt(sc.nextLine());
                                produto.entradaEstoque(entrada);
                                break;
                            case 3:
                                System.out.print("Quantidade de saida: ");
                                int saida = Integer.parseInt(sc.nextLine());
                                produto.saidaEstoque(saida);
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opProduto != 0);
                    break;

                case 5:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.print("Nota 1: ");
                    double nota1 = Double.parseDouble(sc.nextLine());
                    System.out.print("Nota 2: ");
                    double nota2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Nota 3: ");
                    double nota3 = Double.parseDouble(sc.nextLine());

                    Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);
                    System.out.printf("Media de %s: %.2f - %s%n", aluno.getNome(), aluno.calcularMedia(), aluno.getSituacao());
                    break;

                case 6:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Consumo (km/L): ");
                    double consumo = Double.parseDouble(sc.nextLine());
                    System.out.print("Combustivel atual (L): ");
                    double combustivel = Double.parseDouble(sc.nextLine());

                    Carro carro = new Carro(marca, consumo, combustivel);

                    int opCarro;
                    do {
                        System.out.println("\n--- Menu Carro ---");
                        System.out.println("1. Ver status");
                        System.out.println("2. Simular viagem");
                        System.out.println("3. Abastecer");
                        System.out.println("0. Voltar");
                        System.out.print("Opcao: ");
                        opCarro = Integer.parseInt(sc.nextLine());

                        switch (opCarro) {
                            case 1:
                                carro.MostrarDados();
                                break;
                            case 2:
                                System.out.print("Distancia da viagem (km): ");
                                double dist = Double.parseDouble(sc.nextLine());
                                carro.simularViagem(dist);
                                break;
                            case 3:
                                System.out.print("Litros para abastecer: ");
                                double litros = Double.parseDouble(sc.nextLine());
                                carro.Abastecer(litros);
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opCarro != 0);
                    break;

                case 7:
                    System.out.print("Temperatura em Celsius: ");
                    double celsius = Double.parseDouble(sc.nextLine());

                    Temperatura temperatura = new Temperatura(celsius);
                    System.out.printf("Fahrenheit: %.2f°F%n", temperatura.converterParaFahrenheit());
                    System.out.printf("Kelvin:     %.2fK%n", temperatura.converterParaKelvin());
                    break;

                case 8:
                    System.out.print("Raio da esfera (cm): ");
                    double raio = Double.parseDouble(sc.nextLine());

                    Esfera esfera = new Esfera(raio);
                    System.out.printf("Volume:         %.2f cm³%n", esfera.calcularVolume());
                    System.out.printf("Area superficie:%.2f cm²%n", esfera.calcularAreaSuperficie());
                    break;

                case 9:
                    System.out.print("Nome do vendedor: ");
                    String nomeVendedor = sc.nextLine();
                    System.out.print("Total de vendas (R$): ");
                    double vendas = Double.parseDouble(sc.nextLine());
                    System.out.print("Percentual de comissao (%): ");
                    double comissao = Double.parseDouble(sc.nextLine());

                    Vendedor vendedor = new Vendedor(nomeVendedor, vendas, comissao);
                    vendedor.MostrarDados();
                    break;

                case 10:
                    System.out.print("Nome do titular: ");
                    String titularEnergia = sc.nextLine();
                    System.out.print("Consumo (kWh): ");
                    double consumoKwh = Double.parseDouble(sc.nextLine());
                    System.out.print("Valor por kWh (R$): ");
                    double valorKwh = Double.parseDouble(sc.nextLine());

                    ContaEnergia contaEnergia = new ContaEnergia(titularEnergia, consumoKwh, valorKwh);
                    contaEnergia.MostrarDados();
                    break;

                case 11:
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Distancia (km): ");
                    double distancia = Double.parseDouble(sc.nextLine());
                    System.out.print("Consumo do carro (km/L): ");
                    double consumoViagem = Double.parseDouble(sc.nextLine());
                    System.out.print("Preco do combustivel (R$/L): ");
                    double precoViagem = Double.parseDouble(sc.nextLine());

                    Viagem viagem = new Viagem(destino, distancia, consumoViagem, precoViagem);
                    viagem.MostrarDados();
                    break;

                case 12:
                    System.out.print("Nome: ");
                    String nomePessoa = sc.nextLine();
                    System.out.print("Peso (kg): ");
                    double peso = Double.parseDouble(sc.nextLine());
                    System.out.print("Altura (m): ");
                    double altura = Double.parseDouble(sc.nextLine());

                    Pessoa pessoa = new Pessoa(nomePessoa, peso, altura);
                    pessoa.MostrarDados();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}