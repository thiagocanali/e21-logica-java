package lista9exerc�cio3;

import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String continua = "S";
		float chegada;
		float saida;
		
		while (continua.equals("S")) {
		System.out.println("Informe a dist�ncia:");
		float distancia = sc.nextFloat();
		
		System.out.println("Informe a hora de sa�da:");
		float horaSaida = sc.nextFloat();
		
		System.out.println("Informe os minutos de sa�da:");
		float minutosSaida = sc.nextFloat();
		
		System.out.println("Informe a hora de chegada:");
		float horaChegada = sc.nextFloat();
		
		System.out.println("Informe os minutos de chegada:");
		float minutosChegada = sc.nextFloat();
		
		 saida = horaSaida + minutosSaida;
		 chegada = horaChegada + minutosChegada;
		 float tempo = horaChegada - horaSaida;
		 
		
		float velocidadeMedia = distancia;
		System.out.println("Sua velocidade m�dia � de:"+velocidadeMedia);
		
		System.out.println("Deseja continuar? 'S'im ou 'N'�o");
		continua = sc.next();
		
		}
	}

	}
