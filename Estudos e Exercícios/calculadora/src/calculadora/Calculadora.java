package calculadora;

import java.util.Scanner;

import calculos.*; // o * chama todas as classes desse pacote

public class Calculadora {
	
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			String continua = "";
			
			CalculadoraSimples calcSimples = new CalculadoraSimples();
			
			/*
			imc calcImc = new imc();
				
			System.out.println("Altura:");
			double altura = sc.nextDouble(); //pedi altura
			
			System.out.println("Peso:");
			double peso = sc.nextDouble(); //pedi peso
			
			double imcc = calcImc.calculaImc(altura, peso); //chamei o m�todo dentro da calculadora
			
			System.out.println("IMC: " + imcc);
			*/
			
			while (continua.equals("S")) {
				
				System.out.println("Informe a opera��o: ");
				System.out.println("+ para somar");
				System.out.println("- para subtrair");
				System.out.println("* para multiplica��o");
				System.out.println("/ para divis�o");
				String operacao = sc.next();
				
				System.out.println("Informe o primeiro valor:");
				double valor1 = sc.nextDouble();
				
				System.out.println("Informe o segundo valor:");
				double valor2 = sc.nextDouble();
				
				
				if (operacao.equals("+")) {
					double resultado = calcSimples.somar(valor1, valor2);
					System.out.println("Resultado:" + resultado);
				}
				else if (operacao.equals("-")) {
					double resultado = calcSimples.subtrair(valor1, valor2);
					System.out.println("Resultado:" + resultado);
				}
				else if (operacao.equals("*")) {
					double resultado = calcSimples.multiplicacao(valor1, valor2);
					System.out.println("Resultado: " + resultado);
				}
				else if (operacao.equals("/")) {
					double resultado = calcSimples.divisao(valor1, valor2);
					System.out.println("Resultado: " + resultado);
				}
				else {
					System.out.println("Op��o inv�lida!");
				}
				System.out.println("Deseja fazer mais uma opera��o? 'S'im ou 'N'�o");
				continua = sc.next();
			}
		}
	}

