import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prova1 {
	
	//Author : Thiago Canali Schwartz - E21 Java/Ang NOT 
	//Data : 01/10/2020

	public static void main(String[] args) {

//		questao1prova();
//		questao2prova();
//		questao3prova();
//		questao4prova();

	}

	public static void questao1prova() {

		/*
		 * Fa�a um algoritmo que receba dois n�meros, calcule e mostre a divis�o do
		 * primeiro n�mero pelo segundo. Sabe-se que o segundo n�mero n�o pode ser zero,
		 * portanto n�o � necess�rio se preocupar com valida��es.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numero1 = leia.nextInt();

		System.out.println("Digite outro n�mero: ");
		int numero2 = leia.nextInt();

		if (numero2 == 0) {
			System.out.println("n�o pode ser zero");
		}

		int resultado = numero1 / numero2;

		System.out.println("O resultado da divisao do 1� numero pelo 2� �: " + resultado);
	}

	public static void questao2prova() {

		/*
			Fa�a um algoritmo que receba um n�mero aleat�rio maior que 25, e calcule a soma dos
			n�meros anteriores at� ele. (ex: 10 = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 2 + 1)
		 */	
		
		int numero = ThreadLocalRandom.current().nextInt(25,50);
		
		System.out.println("O n�mero sorteado foi: "+numero);
		
		int numerosAnteriores = numero;
		
		for (int i = 0; i < numero; i++) {
			
			numerosAnteriores = (numerosAnteriores + i);

		}
		
		System.out.println("a soma dos numeros anteriores a ele �: " +numerosAnteriores);
		
	}

	public static void questao3prova() {
		
		/*
		 		Escreva um algoritmo que gere 500 valores inteiros e positivos e:
				a. encontre o maior valor;
				b. encontre o menor valor;
				c. calcule a m�dia dos n�meros lidos.
		 */
		
		int valorMaior = 0, valorMenor = 100, mediaValores;
		
		Random geraNum = new Random();

		int numeroGerado = 0, totalNumGerados = 0;
		int contador = 0, quantidadeGerados = 500;

		System.out.println("N�meros gerados: ");
		while (contador < quantidadeGerados) {
			numeroGerado = geraNum.nextInt(1000);
			System.out.print(numeroGerado + ", ");
			if (numeroGerado > valorMaior) {
				valorMaior = numeroGerado;
			}else if (numeroGerado < valorMenor){
				valorMenor = numeroGerado;
			}
			
			totalNumGerados = numeroGerado + totalNumGerados;
			contador++;
		}
			System.out.println("");
			System.out.println("O maior numero gerado foi: "+valorMaior);
			System.out.println("O menor numero gerado foi: "+valorMenor);
			System.out.println("A m�dia dos "+quantidadeGerados+" numeros gerados �: "+totalNumGerados/quantidadeGerados);
			
	}

	public static void questao4prova() {

		/*	Fa�a um algoritmo que:
			a. Gere um n�mero aleat�rio entre 1 e 15;
			b. Pe�a para o usu�rio escolher um n�mero entre 1 e 15;
			c. Caso o usu�rio acerte o n�mero gerado, o programa mostra a seguinte
			mensagem: �Usu�rio acertou o n�mero gerado, Parab�ns!�;
			d. Caso o usu�rio erre, o programa mostrar� a mensagem: �Usu�rio n�o acertou,
			gostaria de tentar de novo?�;
			e. Mostre a Op��o: �1 � Tentar novamente�, �0 � Sair�;
		*/
		
		int continuar = 1;
		
		do {
			
			int numeroGerado = ThreadLocalRandom.current().nextInt(1,15);
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite um numero (de 1 a 15): ");
			
			int respUsuario = leia.nextInt();
			
			if (respUsuario == numeroGerado) {
				System.out.println("Usu�rio acertou o n�mero gerado, Parab�ns!");
			}else {
				System.out.println("Usu�rio n�o acertou, gostaria de tentar de novo?");
			}
			System.out.println("�1 � Tentar novamente�, �0 � Sair�");
			continuar = leia.nextInt();

		} while (continuar == 1);
		System.out.println("Voc� escolheu sair.");
	}
	

}
