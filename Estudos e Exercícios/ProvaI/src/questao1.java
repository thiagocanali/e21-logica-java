import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String funcionario = "";
		String continua = "S";
		String cargo = "";               //declarando as vari�veis
		double salBruto;
		double impostoR = 0;
		double salLiquido = 0;
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Informe o nome do funcion�rio:");
			funcionario = sc.next();
			System.out.println("Informe seu cargo:");                 //solicitando as informa��es ao usu�rio
			cargo = sc.next();
			System.out.println("Informe seu sal�rio bruto:");
			salBruto = sc.nextDouble();
			
			
			if (salBruto <= 1903.98) {
				System.out.println("Voc� est� isento de imposto");
				impostoR =0;
			} 
			else if (salBruto >= 1903.99 && salBruto <= 2826.65) {
				impostoR = salBruto -  1903.98;
				impostoR = impostoR * 0.075;
				
			}
			else if (salBruto >= 2826.66 && salBruto <= 3751.05) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;                                //calculando o imposto de renda
			}
			else if (salBruto >= 3751.06 && salBruto <= 4664.68) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;
				impostoR = salBruto - 3751.06;
				impostoR = impostoR * 0.225;
			}
			else if (salBruto > 4664.68) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;
				impostoR = salBruto - 3751.06;
				impostoR = impostoR * 0.225;
				impostoR = salBruto - 4664.68;
				impostoR = impostoR * 0.275;
			}
			
			salLiquido = salBruto - impostoR;            //calculando o sal�rio l�quido
			
			System.out.println("Funcion�rio: " + funcionario);
			System.out.println("Cargo: " + cargo);
			System.out.println("Sal�rio Bruto: " + salBruto);
			System.out.println("IRPF: " + impostoR);                //mostrando o relat�rio na tela
			System.out.println("Sal�rio l�quido: " + salLiquido);
			
			
			System.out.println("Deseja continuar?");
			continua = sc.next();                           //pedindo se deseja calcular de mais um funcion�rio
			
		}
		
	}

}
