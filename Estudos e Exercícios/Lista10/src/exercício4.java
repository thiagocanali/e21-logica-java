import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean acertou = false;
		for (int i = 1; i<=3; i++) {
			System.out.println("Insira um n�mero de 1 a 10:");
			int num = sc.nextInt();
			if (num==5) {
				System.out.println("Voc� achou o n�mero");
				acertou = true;
				break;
			}else if (num<5){
				System.out.println("Ele � maior que este valor");
			}
			else if (num>5) {
				System.out.println("Ele � menor que este valor");
			}
		}
		
		if (acertou==false) {
			System.out.println("Perdeu!!");
		}
	}

}
