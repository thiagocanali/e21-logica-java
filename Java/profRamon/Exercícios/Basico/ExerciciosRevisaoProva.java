import java.util.Random;
import java.util.Scanner;

public class ExerciciosRevisaoProva {

	public static void main(String[] args) {

//		Random geraNumRd = new Random();
//		Scanner leia = new Scanner(System.in);
//		int opcao;

//		Ex3Switch();
		Ex5While();

	}

	public static void Ex1IF() {

	}

	public static void Ex2IF() {

		/*
		 * Fa�a um algoritmo que encontre qual o maior n�mero par digitado pelo usu�rio.
		 * O usu�rio deve digitar 50 n�meros (ou gerar) e ao final o algoritmo deve
		 * imprimir o resultado.
		 */

		Random geraNum = new Random();

		int numeroInformado = 0;
		int numMaior = 0;
		int cont = 0;

		System.out.println("N�mero gerado: ");
		while (cont <= 50) {
			numeroInformado = geraNum.nextInt(1000);
			if (numeroInformado % 2 == 0 && numeroInformado > numMaior) {
				System.out.print(numeroInformado + ", ");
				numMaior = numeroInformado;

			}

		}

	}

	public static void Ex3Switch() {

		/*
		 * 3 - Crie um algoritmo que leia quatro valores digitados pelo usu�rio: n, a,
		 * b, c. a) Se n = 1 imprimir os tr�s valores a, b, c em ordem crescente. b) Se
		 * n = 2 escrever os tr�s valores a, b, c em ordem decrescente. c) Se n = 3
		 * escrever os tr�s valores a, b, c de forma que o maior fique no meio
		 */

		Scanner leia = new Scanner(System.in);
		int n, a, b, c;
		int maior = 0, menor = 0, medio = 0;

		System.out.println("Digite um valor.");
		System.out.println("1 - ordem crescente.");
		System.out.println("2 - ordem decrescente.");
		System.out.println("3 - num maior no meio.");
		System.out.println("");
		n = leia.nextInt();
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = leia.nextInt();

		if (a > b && a > c && b > c) {
			maior = a;
			medio = b;
			menor = c;
		} else if (a > b && a > c && c > b) {
			maior = a;
			medio = c;
			menor = b;
		} else if (b > a && b > c && a > c) {
			maior = b;
			medio = a;
			menor = c;
		} else if (b > a && b > c && c > a) {
			maior = b;
			medio = c;
			menor = a;
		} else if (c > b && c > a && b > a) {
			maior = c;
			medio = b;
			menor = a;
		} else if (c > b && c > a && a > b) {
			maior = c;
			medio = a;
			menor = b;
		} else {
			System.out.println("numero inv�lido");
		}

		switch (n) {
		case 1:
			System.out.println("N�meros em ordem crescente: " + menor + ", " + medio + ", " + maior);
			break;

		case 2:
			System.out.println("N�meros em ordem decrescente: " + maior + ", " + medio + ", " + menor);
			break;

		case 3:
			System.out.println("N�meros com maior no meio: " + medio + ", " + maior + ", " + menor);
			break;

		default:
			System.out.println("caso nao identificado");
			break;
		}

	}

	public static void Ex4While() {

		/*
		 * 4 - Construir um algoritmo que calcule a m�dia aritm�tica de v�rios valores
		 * inteiros positivos, lidos externamente. O final da leitura acontecer� quando
		 * for lido um valor negativo.
		 */

		Scanner leia = new Scanner(System.in);

		int nota = 0, notas = 0;
		int cont = 0, media = 0;

		do {

			System.out.println("digite uma nota:");
			nota = leia.nextInt();

			notas = nota + notas;

			cont++;

			if (nota < 0) {
				System.out.println("identificado numero negativo");
			}

		} while (nota >= 0);
		media = notas / cont;

		System.out.println("a media �: " + media);
	}
	
	public static void Ex5While() {

		/*
		 	Escreva um algoritmo que calcule a m�dia aritm�tica das 3 notas dos alunos de uma classe. O
			algoritmo dever� ler, al�m das notas, o c�digo do aluno e dever� ser encerrado quando o c�digo
			for igual a zero.
		 */

		Scanner leia = new Scanner(System.in);

		int nota1 = 0, nota2 = 0, nota3 = 0, codigo;
		int cont = 0, media = 0;

		do {

			System.out.println("digite a primeira nota: ");
			nota1 = leia.nextInt();
			
			System.out.println("digite a segunda nota: ");
			nota2 = leia.nextInt();
			
			System.out.println("digite a terceira nota: ");
			nota3 = leia.nextInt();
			
			System.out.println("digite o c�digo: ");
			codigo = leia.nextInt();

			cont++;

			if (codigo == 0) {
				System.out.println("identificado c�digo zero");
			}

		} while (codigo != 0);
		media = (nota1+nota2+nota3)/cont;
		System.out.println("a media �: " + media);
	}
	
	
	
	
	
	
	
	
	

}
