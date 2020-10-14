import java.util.Scanner;

public class Exercicios3108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void questao6Thiago() {
		/*
		 * Escreva um programa que verifique a validade de uma senha fornecida pelo
		 * usu�rio. A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes
		 * mensagens: ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a
		 * senha seja inv�lida.
		 */

		int senha;
		Scanner entradaSenha = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		senha = entradaSenha.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO!");
		} else {
			System.out.println("ACESSO NEGADO!");
		}
		entradaSenha.close();
	}

	public static void questao7Thiago() {
		/*
		 * As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$
		 * 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
		 * n�mero de ma��s compradas, calcule e escreva o valor total da compra.
		 */

		int qtdMacas;
		double valorCompra;
		Scanner entradaMacas = new Scanner(System.in);

		System.out.print("Digite a quantidade de ma�as que voc� deseja comprar: ");
		qtdMacas = entradaMacas.nextInt();

		if (qtdMacas >= 12) {
			System.out.println("uma duzia ou mais = R$0.25");
			valorCompra = qtdMacas * 0.25;
		} else {
			System.out.println("menos que uma duzia = R$0.30");
			valorCompra = qtdMacas * 0.30;
		}
		System.out.println("O valor total da compra � de: " + valorCompra + " reais");
		entradaMacas.close();
	}

	public static void questao8Thiago() {
		/*
		 * Escreva um programa para ler 3 valores inteiros (considere que n�o ser�o
		 * lidos valores iguais) e escrev�-los em ordem crescente.
		 */

		int n1, n2, n3;

		Scanner entradaNum = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		n1 = entradaNum.nextInt();

		n2 = 0;
		do {
			System.out.print("Digite o segundo valor (diferente do valor digitado anteriormente): ");
			n2 = entradaNum.nextInt();
		} while (n1 == n2);

		n3 = 0;
		do {
			System.out.print("Digite o terceiro valor (diferente dos valores digitados anteriormente): ");
			n3 = entradaNum.nextInt();
		} while (n3 == n1 || n3 == n2);

		if (n3 < n2 && n3 < n1 && n2 < n1) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n3 + "," + n2 + "," + n1);
		} else if (n3 < n2 && n3 < n1 && n2 > n1) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n3 + "," + n1 + "," + n2);
		} else if (n2 < n1 && n2 < n3 && n1 > n3) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n2 + "," + n3 + "," + n1);
		} else if (n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n2 + "," + n1 + "," + n3);
		} else if (n1 < n2 && n1 < n3 && n2 > n3) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n1 + "," + n3 + "," + n2);
		} else if (n1 < n2 && n1 < n3 && n2 < n3) {
			System.out.println("os numeros digitados em ordem crescente sao: " + n1 + "," + n2 + "," + n3);
		}
		entradaNum.close();
	}
}