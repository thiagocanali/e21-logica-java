package lista9exerc�cio3;

import java.util.Scanner;

public class exerc�cio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iniIntervalo;
		int fimIntervalo;
		
		System.out.println("Informe o in�cio do intervalo:");
		iniIntervalo = sc.nextInt();
		
		System.out.println("Informe o fim do intervalo:");
		fimIntervalo = sc.nextInt();
		
		for ( int numTeste = iniIntervalo; numTeste < fimIntervalo; numTeste++) {
			
			boolean naoehPrimo = false;
			for (int j = 2; j < numTeste; j++) {
				int resto;
				resto = numTeste%j;
				if (resto==0) {
					naoehPrimo = true;
				}
			}
				if (naoehPrimo = false) {
					System.out.println("� primo"+numTeste);
				}
			
		}
	}


	}

