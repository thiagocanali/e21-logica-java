import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
//		PN1();
//		ladosTriangulo();
//		menor();
		num3();

	}

	public static void PN1() {

		Scanner leia = new Scanner(System.in);
		int cont = 0;

		do {

			System.out.println("informe um numero:");
			int respota = leia.nextInt();

			if (respota > 0) {
				System.out.println("n� POSITIVO");
			} else if (respota == 0) {
				System.out.println("n� IGUAL A ZERO");
			} else {
				System.out.println("n� NEGATIVO");
			}
			cont++;
			System.out.println("");
		} while (cont < 3);
	}

	public static void ladosTriangulo() {

		Scanner leia = new Scanner(System.in);
		int cont = 0;

		System.out.println("informe o lado 1 :");
		int respota1 = leia.nextInt();

		System.out.println("informe o lado 2 :");
		int respota2 = leia.nextInt();

		System.out.println("informe o lado 3 :");
		int respota3 = leia.nextInt();

		if (respota1 + respota2 > respota3 || respota2 + respota3 > respota1 || respota3 + respota1 > respota2) {

			System.out.println(" � v�lido");
			if (respota1 == respota2 && respota1 == respota3) {
				System.out.println("Equilatero - TRES LADOS IGUAIS");
			} else if (respota1 == respota2 || respota1 == respota3 || respota2 == respota3) {
				System.out.println("Is�celes - DOIS LADOS IGUAIS");
			} else if (respota1 != respota2 && respota1 != respota3 || respota2 != respota1 && respota2 != respota3
					|| respota3 != respota1 && respota3 != respota2) {
				System.out.println("Escaleno - 3 LADOS DIFERENTES");
			}
		} else {
			System.out.println("n�o � v�lido");
		}

	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner entradaDados = new Scanner(System.in); int lado1, lado2, lado3;
	 * 
	 * System.out.println("INforme o lado 1"); lado1 = entradaDados.nextInt();
	 * System.out.println("INforme o lado 2"); lado2 = entradaDados.nextInt();
	 * System.out.println("INforme o lado 3"); lado3 = entradaDados.nextInt();
	 * 
	 * if((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <=
	 * lado1) { System.out.println("INv�lido"); } else { if((lado1 == lado2) &&
	 * (lado2 == lado3)) { System.out.println("Equil�tero"); } else if((lado1 ==
	 * lado2) || (lado2 == lado3) || (lado1 == lado3)) {
	 * System.out.println("Is�sceles"); } else { System.out.println("Escaleno"); } }
	 * 
	 * entradaDados.close(); }
	 */

	public static void maior() {

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

	}

	public static void menor() {

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
	}

	public static void num3() {

		// fa�a um programa que verifique se o numero � impar (n - n/2*2)

		Scanner leia = new Scanner(System.in);
		int cont = 0;

		do {

			System.out.println("informe um numero :");
			int respota = leia.nextInt();

			if (respota % 2 != 0) {
				System.out.println(respota+" � impar.");
			} else {
				System.out.println(respota+" � par.");
			}
			cont++;
		} while (cont < 3);
	}
	
	
	public static void num4() {

		// fa�a um programa que verifique se o numero � impar (n - n/2*2=0)

		Scanner leia = new Scanner(System.in);
		int cont = 0;

		do {

			System.out.println("informe um numero :");
			int respota = leia.nextInt();

			if (respota % 2 != 0) {
				System.out.println(respota+" � impar.");
			} else {
				System.out.println(respota+" � par.");
			}
			cont++;
		} while (cont < 3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
