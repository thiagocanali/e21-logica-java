package lista9exerc�cio3;

import java.util.Scanner;

public class exerc�cio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menor= 999999;
		int maior=-999999;
		int soma =0;
		double media =0;
		
		for (int i =0; i<5; i++) {
			System.out.println("Informe um n�mero:");
			int num = sc.nextInt();
			soma = soma + num;
			if (num<menor) {
				menor = num;
			} else if (num>maior) {
				maior = num;
			} 
			soma = soma - menor - maior;
			
			media = soma/3;
			System.out.println("M�dia:"+media);
		}
		
	}

}

