import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Crie um programa para armazenar informa��es meteorol�gicas.
		- Crie um vetor para armazenar 30 temperaturas.
		- Calcular a m�dia das temperaturas.
		- O usu�rio pode informar um dia qualquer e o programa deve dizer se a temperatura
		desse dia estava acima ou abaixo da m�dia.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double soma =0;
		double media =0;
		double[] temperaturas = new double[31];
		int dia =0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Informe a temperatura:" + (i+1));
			temperaturas[i] = sc.nextDouble();
			 soma = soma + temperaturas[i];
		}
		
		media = soma/temperaturas.length;
		System.out.println("A m�dia �:" + media);
		
		while (dia != -1) {
		
			System.out.println("Informe o dia:");
			dia = sc.nextInt();
			
			if (temperaturas[dia - 1] < media) {
				System.out.println("A temperatura desse dia estava abaixo da m�dia");
			}
			else if (temperaturas[dia - 1] > media) {
				System.out.println("A temperatura desse dia estava acima da m�dia");
			}
			else {
				System.out.println("A temperatura desse dia estava na m�dia");
			}
			
		}
		
		
	}

}
