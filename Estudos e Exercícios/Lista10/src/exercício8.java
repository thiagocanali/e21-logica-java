import java.util.Scanner;

public class exerc�cio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("                                     CASA DE C�MBIO                                                   ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Informe R para real");
		System.out.println("Informe D para d�lar americano");
		System.out.println("Informe E para euro");
		System.out.println("Informe L para libra");
		System.out.println("Informe DC para d�lar canadense");
		System.out.println("Informe o tipo de moeda de entrada: 'R'eal, 'D'�lar americano, 'E'uro, 'L'ibra Esterlina ou 'D'�lar 'C'anadense:");
		String entrada = sc.next();
		System.out.println("Informe o tipo de moeda de sa�da: 'R'eal, 'D'�lar americano, 'E'uro, 'L'ibra Esterlina ou 'D'�lar 'C'anadense:");
		String saida = sc.next();
		System.out.println("Informe o valor a ser convertido:");
		double valor = sc.nextDouble();
		
		if (entrada.equals("R") && saida.equals("D")) {
			double valorSaida = valor*0.18;
			System.out.println("O valor de real convertido para d�lar americano � igual a: " + valorSaida);
		} else if (entrada.equals("R") && saida.equals("E")) {
			double valorSaida = valor*0.16;
			System.out.println("O valor de real convertido para euro � igual a: " + valorSaida);
		} else if (entrada.equals("R") && saida.equals("L")) {
			double valorSaida = valor*0.14;
			System.out.println("O valor de real convertido para libra � igual a: " + valorSaida);
		} else if (entrada.equals("R") && saida.equals("DC")) {
			double valorSaida = valor*0.25;
			System.out.println("O valor de real convertido para d�lar canadense � igual a: " + valorSaida);
		}
		
		
		
		else if (entrada.equals("D") && saida.equals("R")) {
			double valorSaida = valor*5.41;
			System.out.println("O valor de d�lar americano convertido para real � igual a: " + valorSaida);
		} else if (entrada.equals("D") && saida.equals("E")) {
			double valorSaida = valor*0.85;
			System.out.println("O valor de d�lar americano convertido para euro � igual a: " + valorSaida);
		} else if (entrada.equals("D") && saida.equals("L")) {
			double valorSaida = valor*0.78;
			System.out.println("O valor de d�lar americano convertido para libra � igual a: " + valorSaida);
		} else if (entrada.equals("D") && saida.equals("DC")) {
			double valorSaida = valor*1.33;
			System.out.println("O valor de d�lar americano convertido para d�lar canadense � igual a: " + valorSaida);
		}
		
		
		
		else if (entrada.equals("E") && saida.equals("R")) {
			double valorSaida = valor*6.37;
			System.out.println("O valor de euro convertido para real � igual a: " + valorSaida);
		} else if (entrada.equals("E") && saida.equals("D")) {
			double valorSaida = valor*1.18;
			System.out.println("O valor de euro convertido para d�lar americano � igual a: " + valorSaida);
		} else if (entrada.equals("E") && saida.equals("L")) {
			double valorSaida = valor*0.92;
			System.out.println("O valor de euro convertido para libra � igual a: " + valorSaida);
		} else if (entrada.equals("E") && saida.equals("DC")) {
			double valorSaida = valor*1.57;
			System.out.println("O valor de euro convertido para d�lar americano � igual a: " + valorSaida);
		}
		
		
		
		else if (entrada.equals("L") && saida.equals("R")) {
			double valorSaida = valor*6.94;
			System.out.println("O valor de libra convertido para real � igual a: " + valorSaida);
		} else if (entrada.equals("L") && saida.equals("D")) {
			double valorSaida = valor*1.28;
			System.out.println("O valor de libra convertido para d�lar americano � igual a: " + valorSaida);
		} else if (entrada.equals("L") && saida.equals("E")) {
			double valorSaida = valor*1.09;
			System.out.println("O valor de libra convertido para euro � igual a: " + valorSaida);
		} else if (entrada.equals("L") && saida.equals("DC")) {
			double valorSaida = valor*1.70;
			System.out.println("O valor de libra convertido para d�lar canadense � igual a: " + valorSaida);
		}
		
		
		
		else if (entrada.equals("DC") && saida.equals("R")) {
			double valorSaida = valor*4.70;
			System.out.println("O valor de d�lar canadense convertido para real � igual a: " + valorSaida);
		} else if (entrada.equals("DC") && saida.equals("D")) {
			double valorSaida = valor*0.75;
			System.out.println("O valor de d�lar canadense convertido para d�lar americano � igual a: " + valorSaida);			
		} else if (entrada.equals("DC") && saida.equals("E")) {
			double valorSaida = valor*0.64;
			System.out.println("O valor de d�lar canadense convertido para euro � igual a: " + valorSaida);						
		} else if (entrada.equals("DC") && saida.equals("L")) {
			double valorSaida = valor*0.59;
			System.out.println("O valor de d�lar canadense convertido para libra � igual a: " + valorSaida);							
		} else {
		System.out.println("Unidades inv�lidas!");	
		}
	}
}