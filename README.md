# 📘 Lista de Exercícios — ABSTRAÇÃO E LÓGICA
## 👩‍💻 Estudantes

- **Rubia Turci**
- **Danilo Marques**

---

## 📋 Exercícios

---

### 🔹 1. Marcenaria — `Retangulo`

Uma marcenaria precisa calcular a quantidade de madeira utilizada na fabricação de tampos de mesa retangulares.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `largura` | `double` | Largura do tampo em metros |
| `altura` | `double` | Altura do tampo em metros |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularArea()` | `double` | Calcula a área do tampo |
| `calcularPerimetro()` | `double` | Calcula o perímetro para acabamento com fita de borda |
| `getLargura()` | `double` | Retorna a largura |
| `getAltura()` | `double` | Retorna a altura |

---

### 🔹 2. RH de Empresa — `Funcionario`

Uma empresa deseja automatizar o cálculo de salários de seus funcionários.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do funcionário |
| `salario` | `double` | Salário atual |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `aplicarAumento(double percentual)` | `void` | Aplica aumento percentual no salário |
| `calcularSalarioAnual()` | `double` | Calcula o salário anual (salário x 12) |
| `getNome()` | `String` | Retorna o nome |
| `getSalario()` | `double` | Retorna o salário atual |

---

### 🔹 3. Banco Digital — `ContaBancaria`

Um banco digital precisa de um sistema simples para gerenciar contas de clientes.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `titular` | `String` | Nome do titular da conta |
| `saldo` | `double` | Saldo atual da conta |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `depositar(double valor)` | `void` | Realiza um depósito na conta |
| `sacar(double valor)` | `void` | Realiza um saque, validando saldo suficiente |
| `getSaldo()` | `double` | Retorna o saldo atual |
| `getTitular()` | `String` | Retorna o nome do titular |

---

### 🔹 4. Controle de Estoque — `Produto`

Uma loja precisa controlar seu estoque de produtos.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do produto |
| `preco` | `double` | Preço unitário |
| `quantidade` | `int` | Quantidade em estoque |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularValorTotalEstoque()` | `double` | Calcula o valor total do estoque |
| `entradaEstoque(int qtd)` | `void` | Adiciona unidades ao estoque |
| `saidaEstoque(int qtd)` | `void` | Remove unidades do estoque, validando disponibilidade |
| `getNome()` | `String` | Retorna o nome do produto |
| `getPreco()` | `double` | Retorna o preço |
| `getQuantidade()` | `int` | Retorna a quantidade em estoque |

---

### 🔹 5. Sistema Escolar — `Aluno`

Uma escola deseja automatizar o cálculo de notas dos alunos.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do aluno |
| `nota1` | `double` | Primeira nota |
| `nota2` | `double` | Segunda nota |
| `nota3` | `double` | Terceira nota |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularMedia()` | `double` | Calcula a média das três notas |
| `foiAprovado()` | `boolean` | Retorna `true` se média ≥ 7.0 |
| `getSituacao()` | `String` | Retorna `"Aprovado"` ou `"Reprovado"` |
| `getNome()` | `String` | Retorna o nome do aluno |

---

### 🔹 6. Aplicativo de Veículos — `Carro`

Um aplicativo de controle de veículos precisa calcular autonomia de carros.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `marca` | `String` | Marca do carro |
| `consumoKmPorLitro` | `double` | Consumo em km por litro |
| `combustivelAtual` | `double` | Quantidade de combustível disponível em litros |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularAutonomia()` | `double` | Calcula quantos km ainda pode percorrer |
| `simularViagem(double distanciaKm)` | `void` | Simula uma viagem, reduzindo o combustível |
| `abastecer(double litros)` | `void` | Adiciona litros ao tanque |
| `MostrarDados()` | `void` | Exibe o status completo do veículo |

---

### 🔹 7. Conversor de Temperatura — `Temperatura`

Um aplicativo meteorológico precisa converter temperaturas.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `celsius` | `double` | Temperatura em graus Celsius |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `converterParaFahrenheit()` | `double` | Converte para Fahrenheit |
| `converterParaKelvin()` | `double` | Converte para Kelvin |
| `getCelsius()` | `double` | Retorna a temperatura em Celsius |

---

### 🔹 8. Indústria de Bolas — `Esfera`

Uma fábrica produz bolas e precisa calcular propriedades físicas.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `raio` | `double` | Raio da esfera em cm |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularVolume()` | `double` | Calcula o volume da esfera |
| `calcularAreaSuperficie()` | `double` | Calcula a área da superfície |
| `getRaio()` | `double` | Retorna o raio |

---

### 🔹 9. Sistema de Vendas — `Vendedor`

Uma empresa de vendas comissionadas quer calcular os ganhos dos vendedores.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do vendedor |
| `totalVendas` | `double` | Total de vendas realizadas |
| `percentualComissao` | `double` | Percentual de comissão |
| `SALARIO_BASE` | `static final double` | Salário base fixo da empresa (R$ 2000,00) |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularComissao()` | `double` | Calcula o valor da comissão |
| `calcularSalarioFinal()` | `double` | Calcula salário base + comissão |
| `MostrarDados()` | `void` | Exibe o resumo completo do vendedor |

---

### 🔹 10. Conta de Energia — `ContaEnergia`

Uma concessionária de energia precisa calcular contas de luz.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `titular` | `String` | Nome do titular |
| `consumoKwh` | `double` | Consumo em kWh |
| `valorPorKwh` | `double` | Valor por kWh em reais |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularValorBruto()` | `double` | Calcula o valor sem desconto |
| `calcularDesconto()` | `double` | Aplica desconto por faixa de consumo |
| `calcularValorFinal()` | `double` | Calcula o valor final com desconto |
| `MostrarDados()` | `void` | Exibe a conta completa |

> **Faixas de desconto:** até 100 kWh → 20% | até 200 kWh → 10% | acima de 200 kWh → sem desconto

---

### 🔹 11. Planejamento de Viagem — `Viagem`

Um motorista quer calcular o custo de uma viagem.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `destino` | `String` | Destino da viagem |
| `distanciaKm` | `double` | Distância em quilômetros |
| `consumoKmPorLitro` | `double` | Consumo do carro em km/L |
| `precoCombustivel` | `double` | Preço do combustível por litro |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularLitrosNecessarios()` | `double` | Calcula quantos litros serão necessários |
| `calcularCustoTotal()` | `double` | Calcula o custo total da viagem |
| `MostrarDados()` | `void` | Exibe o planejamento completo |

---

### 🔹 12. Sistema de Saúde (IMC) — `Pessoa`

Uma clínica deseja calcular o Índice de Massa Corporal dos pacientes.

**Atributos**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do paciente |
| `peso` | `double` | Peso em kg |
| `altura` | `double` | Altura em metros |

**Métodos**
| Método | Retorno | Descrição |
|---|---|---|
| `calcularIMC()` | `double` | Calcula o IMC (peso / altura²) |
| `classificarIMC()` | `String` | Classifica o resultado do IMC |
| `MostrarDados()` | `void` | Exibe o resultado completo |

> **Classificações:** Abaixo do peso | Peso normal | Sobrepeso | Obesidade Grau I | Obesidade Grau II | Obesidade Grau III

---

## 🗂️ Arquivos do Projeto

| Arquivo | Descrição |
|---|---|
| `Retangulo.java` | Classe do exercício 1 |
| `Funcionario.java` | Classe do exercício 2 |
| `ContaBancaria.java` | Classe do exercício 3 |
| `Produto.java` | Classe do exercício 4 |
| `Aluno.java` | Classe do exercício 5 |
| `Carro.java` | Classe do exercício 6 |
| `Temperatura.java` | Classe do exercício 7 |
| `Esfera.java` | Classe do exercício 8 |
| `Vendedor.java` | Classe do exercício 9 |
| `ContaEnergia.java` | Classe do exercício 10 |
| `Viagem.java` | Classe do exercício 11 |
| `Pessoa.java` | Classe do exercício 12 |
| `Main.java` | Menu principal com todos os exercícios |
