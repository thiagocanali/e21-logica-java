package lista9exerc�cio3;

import java.util.Scanner;

public class exerc�cio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = sc.next();
		System.out.println("Informe seu sexo");
		String sexo = sc.next();
		System.out.println("Informe sua idade");
		int idade = sc.nextInt();
		System.out.println("Informe se sua sa�de est�:BOA ou RUIM");
		String saude = sc.next();
		
		if (sexo.equals("masculino") && idade==18 && saude.equals("BOA")) {
			System.out.println("Voc� est� apto a cumprir o servi�o militar!" + nome + sexo + idade + saude);
		}else {
			System.out.println("Voc� n�o est� apto!");
		}
	}
}

