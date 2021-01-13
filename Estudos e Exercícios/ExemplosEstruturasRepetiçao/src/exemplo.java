import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);   
		
		//usado para aplica��es onde sabemos exatamente a qtd de vezes que o c�digo � executado 
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
        //Esta estrutura tem o mesmo efeito da estrutura FOR acima
		int l = 0; 
		while (l < 10) {
			System.out.println("l: " + l);
            l++; 
		}
		
		
		//usado quando n�o sabemos quantas vezes o c�digo dever� ser executado
		int j = 0; 
		while (j != -1) {
			System.out.println("j: " + j);
			System.out.println("Informe -1 para parar");
			j = ler.nextInt(); 
		}
		
		
		/*Estrutura de sele��o semelhante ao WHILE, com a �nica diferen�a que no DO-WHILE o teste da condi��o de parada 
		 *� executado ap�s executar o bloco de c�digo contido na estrutura de repeti��o. No WHILE, por outro lado, o teste 
		 *� executado antes de executar o bl�co l�gico contido na estrutura. 
		 */
		do {
			System.out.println("j: " + j);
			System.out.println("Informe -1 para parar");
			j = ler.nextInt(); 
		} while (j != -1);
		

	}

}
