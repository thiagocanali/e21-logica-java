package lista9exerc�cio3;

import java.util.Scanner;

public class exerc�cio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String senha = "lalala";
		
		for (int i=0; i<3; i++) {
			System.out.println("Insira a senha");
			String senhaUsuario = sc.next();
			
			if(senhaUsuario.equals(senha)) {
				System.out.println("A senha �:"+senha);
				break;
			}
		}
	}
}
