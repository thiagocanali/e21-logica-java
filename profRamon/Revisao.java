import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
//		positivoNegativoZero();
//		ladosTriangulo();
//		exercicioif1sala();
//		exercicioif2sala();
//		exercicioif3sala();
//		exercicioif4sala();
//		exercicioif5sala();
//		exercicioif6sala();
//		exercicioif7sala();
//		exercicioif8sala();

	}

	/*
	 * public static void positivoNegativoZero() {
	 * 
	 * Scanner leia = new Scanner(System.in); int cont = 0;
	 * 
	 * do {
	 * 
	 * System.out.println("informe um numero:"); int respota = leia.nextInt();
	 * 
	 * if (respota > 0) { System.out.println("n� POSITIVO"); } else if (respota ==
	 * 0) { System.out.println("n� IGUAL A ZERO"); } else {
	 * System.out.println("n� NEGATIVO"); } cont++; System.out.println(""); } while
	 * (cont < 3); }
	 * 
	 * public static void ladosTriangulo() {
	 * 
	 * Scanner leia = new Scanner(System.in); int cont = 0;
	 * 
	 * System.out.println("informe o lado 1 :"); int respota1 = leia.nextInt();
	 * 
	 * System.out.println("informe o lado 2 :"); int respota2 = leia.nextInt();
	 * 
	 * System.out.println("informe o lado 3 :"); int respota3 = leia.nextInt();
	 * 
	 * if (respota1 + respota2 > respota3 || respota2 + respota3 > respota1 ||
	 * respota3 + respota1 > respota2) {
	 * 
	 * System.out.println(" � v�lido"); if (respota1 == respota2 && respota1 ==
	 * respota3) { System.out.println("Equilatero - TRES LADOS IGUAIS"); } else if
	 * (respota1 == respota2 || respota1 == respota3 || respota2 == respota3) {
	 * System.out.println("Is�celes - DOIS LADOS IGUAIS"); } else if (respota1 !=
	 * respota2 && respota1 != respota3 || respota2 != respota1 && respota2 !=
	 * respota3 || respota3 != respota1 && respota3 != respota2) {
	 * System.out.println("Escaleno - 3 LADOS DIFERENTES"); } } else {
	 * System.out.println("n�o � v�lido"); } leia.close(); }
	 * 
	 */

	public static void exercicioif1sala() {

		// fa�a um programa que receba 2 valores e retorne o maior entre eles

		Scanner leia = new Scanner(System.in);

		System.out.println("informe o n1 :");
		int respota1 = leia.nextInt();

		System.out.println("informe o n2 :");
		int respota2 = leia.nextInt();

		if (respota1 > respota2) {
			System.out.println("numero 1 � maior, valor: " + respota1);
		} else {
			System.out.println("numero 2 � maior, valor: " + respota2);
		}
		leia.close();
	}

	public static void exercicioif2sala() {

		// fa�a um programa que receba 4 valores e retorne o menor entre eles

		Scanner leia = new Scanner(System.in);

		System.out.println("informe o n1 :");
		int respota1 = leia.nextInt();

		System.out.println("informe o n2 :");
		int respota2 = leia.nextInt();

		System.out.println("informe o n3 :");
		int respota3 = leia.nextInt();

		System.out.println("informe o n4 :");
		int respota4 = leia.nextInt();

		if (respota1 < respota2 && respota1 < respota3 && respota1 < respota4) {
			System.out.println("numero 1 � menor, valor: " + respota1);
		} else if (respota2 < respota1 && respota2 < respota3 && respota2 < respota4) {
			System.out.println("numero 2 � menor, valor: " + respota2);
		} else if (respota3 < respota1 && respota3 < respota2 && respota3 < respota4) {
			System.out.println("numero 3 � menor, valor: " + respota3);
		} else if (respota4 < respota1 && respota4 < respota2 && respota4 < respota3) {
			System.out.println("numero 4 � menor, valor: " + respota4);
		} else {
			System.out
					.println("mais de um valor igual: " + respota1 + "," + respota2 + "," + respota3 + "," + respota4);
		}
		leia.close();
	}

	public static void exercicioif3sala() {

		// fa�a um programa que verifique se o numero � impar (n - n/2*2=0)

		Scanner leia = new Scanner(System.in);

		System.out.println("informe um numero :");
		int respota = leia.nextInt();

		if (respota % 2 != 0) {
			System.out.println(respota + " � impar.");
		} else {
			System.out.println(respota + " � par.");
		}
		leia.close();
	}

	public static void exercicioif4sala() {
		/*
		 * fazer um programa que retorne o nome de um produto a partir do c�digo do
		 * mesmo. Considere os seguintes c�digos: 001 - Arroz; 002 - Feij�o; 003 -
		 * Farinha; Para qualquer outro c�digo indicar: Diversos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o c�digo do produto: ");
		int numero = leia.nextInt();

		if (numero == 1) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Arroz");
		} else if (numero == 2) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Feij�o");
		} else if (numero == 3) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Farinha");
		} else {
			System.out.println("numero inv�lido");
		}
		leia.close();
	}

	public static void exercicioif5sala() {
		/*
		 * fazer um programa que retorne o nome de um produto a partir do c�digo do
		 * mesmo. Considere os seguintes c�digos: 001 - Arroz; 002 - Feij�o; 003 -
		 * Farinha; Para qualquer outro c�digo indicar: Diversos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o c�digo do produto: ");
		int numero = leia.nextInt();

		if (numero == 1) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Arroz");
		} else if (numero == 2) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Feij�o");
		} else if (numero == 3) {
			System.out.println("o c�digo do produto digitado foi: " + numero + " que � equivalente a: Farinha");
		} else {
			System.out.println("numero inv�lido");
		}
		leia.close();
	}

	public static void exercicioif6sala() {
		/*
		 * Escreva um programa que verifique a validade de uma senha fornecida pelo
		 * usu�rio. A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes
		 * mensagens: ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a
		 * senha seja inv�lida.
		 */

		Scanner leia = new Scanner(System.in);

		String senhaValida = "1234";

		System.out.println("Digite a senha para entrar no programa: ");

		String senhaUsuario = leia.nextLine();

		if (senhaUsuario == senhaValida) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		leia.close();

	}

	public static void exercicioif7sala() {

		/*
		 * As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$
		 * 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
		 * n�mero de ma��s compradas, calcule e escreva o valor total da compra.
		 */

		Scanner leia = new Scanner(System.in);
		double totalCompra = 0;

		System.out.println("digite numero ma��s: ");
		double respostaUsuario = leia.nextInt();

		if (respostaUsuario < 12) {
			System.out.println("menos q uma duzia");
			totalCompra = respostaUsuario * 0.30;
		} else if (respostaUsuario >= 12) {
			System.out.println("pelo menos uma duzia");
			totalCompra = respostaUsuario * 0.25;
		} else {
			System.out.println("valor informado invalido");
		}
		leia.close();
	}

	public static void exercicioif8sala() {

		/*
		 * Escreva um programa para ler 3 valores inteiros (considere que n�o ser�o
		 * lidos valores iguais) e escrev�-los em ordem crescente.
		 */

		Scanner leia = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int medio = 0;

		System.out.println("digite o primeiro valor: ");
		int valor1 = leia.nextInt();

		System.out.println("digite o segundo valor: ");
		int valor2 = leia.nextInt();

		System.out.println("digite o terceiro valor: ");
		int valor3 = leia.nextInt();

		if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			System.out.println("valores aceitos");

			if (valor1 < valor2 && valor1 < valor3) {
				if (valor2 < valor3) {
					System.out.println(valor1 + ", " + valor2 + ", " + valor3);
				} else {
					System.out.println(valor1 + ", " + valor3 + ", " + valor2);
				}
			} else if (valor2 < valor1 && valor2 < valor3) {
				if (valor1 < valor3) {
					System.out.println(valor2 + ", " + valor1 + ", " + valor3);
				} else {
					System.out.println(valor2 + ", " + valor3 + ", " + valor1);
				}
			} else {
				if (valor2 < valor1) {
					System.out.println(valor3 + ", " + valor2 + ", " + valor1);
				} else {
					System.out.println(valor3 + ", " + valor1 + ", " + valor2);
				}
			}
			leia.close();
		}
	}

}
