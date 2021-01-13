import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome do arquivo:\n");
		String nome = sc.next();
		System.out.printf("\nConte�do do arquivo texto:\n");
		
		FileReader arq = new FileReader(nome);
		BufferedReader lerArq = new BufferedReader(arq);
		
		String linha = lerArq.readLine(); //l� a primeira linha
		//a vari�vel linha recebe o valor null quando o processo de repeti��o atingir o final do 
		// arquivo texto
		
		while (linha != null) {
			System.out.printf("%s\n", linha);
			
			linha = lerArq.readLine();
			
		}
		arq.close();
		
		//System.out.printf();
		
	}


}
