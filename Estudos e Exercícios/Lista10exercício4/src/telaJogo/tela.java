package telaJogo;
import java.util.Scanner;

import sistema.Fun��es;

public class tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Fun��es fun�oes = new Fun��es();
		String continua = "";
		
		//double resultado = calcSimples.somar(valor1, valor2);
			
			while (continua.equals("S")) {
				int oculto = fun�oes.sortear();
				for (int i = 0; i < 3; i++) {
					System.out.println("Insira um n�mero de 1 a 10:");
					int palpite = sc.nextInt();
					int status = fun�oes.testarPalpite(palpite, oculto);
					
					if (status==0) {
						System.out.println("Acertou");
						break;
					}
					else if (status==-1) {
						System.out.println("O palpite � menor");
					}
					else if (status==1){
						System.out.println("O palpite � maior");
					}
				}
				
				System.out.println("Deseja continuar? 'S'im ou 'N'�o?");
			}
			
		}
}

