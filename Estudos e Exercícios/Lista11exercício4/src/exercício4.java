import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] estados = new String[27];
		String[] capitais = new String[27];
		String[] jogadores = new String[4];
		int[] pontosDoJog = new int[4];
		boolean jogar = true;
		
		estados[0] = "Acre";
		estados[1] = "Alagoas";
		estados[2] = "Amap�";
		estados[3] = "Amazonas";
		estados[4] = "Bahia";
		estados[5] = "Cear�";
		estados[6] = "Esp�rito Santo";
		estados[7] = "Goi�s";
		estados[8] = "Maranh�o";
		estados[9] = "Mato Grosso";
		estados[10] = "Mato Grosso do Sul";
		estados[11] = "Minas Gerais";
		estados[12] = "Par�";
		estados[13] = "Para�ba";
		estados[14] = "Paran�";
		estados[15] = "Pernambuco";
		estados[16] = "Piau�";
		estados[17] = "Rio de Janeiro";
		estados[18] = "Rio Grande do Norte";
		estados[19] = "Rio Grande do Sul";
		estados[20] = "Rond�nia";
		estados[21] = "Roraima";
		estados[22] = "Santa Catarina";
		estados[23] = "S�o Paulo";
		estados[24] = "Sergipe";
		estados[25] = "Tocantins";
		estados[26] = "Distrito Federal";
				
		
		capitais[0] = "Rio Branco";
		capitais[1] = "Macei�";
		capitais[2] = "Macap�";
		capitais[3] = "Manaus";
		capitais[4] = "Salvador";
		capitais[5] = "Fortaleza";
		capitais[6] = "Vit�ria";
		capitais[7] = "Goi�nia";
		capitais[8] = "S�o Lu�s";
		capitais[9] = "Cuiab�";
		capitais[10] = "Campo Grande";
		capitais[11] = "Belo Horizonte";
		capitais[12] = "Bel�m";
		capitais[13] = "Jo�o Pessoa";
		capitais[14] = "Curitiba";
		capitais[15] = "Recife";
		capitais[16] = "Teresina";
		capitais[17] = "Rio de Janeiro";
		capitais[18] = "Natal";
		capitais[19] = "Porto Alegre";
		capitais[20] = "Porto Velho";
		capitais[21] = "Boa Vista";
		capitais[22] = "Florian�polis";
		capitais[23] = "S�o Paulo";
		capitais[24] = "Aracaju";
		capitais[25] = "Palmas";
		capitais[26] = "Bras�lia";
		
		for (int i = 0; i < jogadores.length; i++) {
			System.out.println("Jogador " + i + ":");
			jogadores[i] = sc.next();
		}
		
		while (jogar) {
			
			for (int i = 0; i < jogadores.length; i++) {
				int inds = (int)(Math.random() * estados.length );
				System.out.println("Jogador:" + jogadores[i]);
				System.out.println("Estado: " + estados[inds]);
				System.out.println("Capital:");
				String capital = sc.next();
				
				if (capital.equals(capitais[inds])) {
					pontosDoJog[i]++;
				}
			}
			
			System.out.println("Jogar novamente? 'S'im ou 'N'�o");
			String continuar = sc.next();
			if (continuar.equals("N")) {
				jogar = false;
			}
		}
		
		boolean trocou = true;
		while (trocou) {
			trocou = false;
			for (int i = 0; i < pontosDoJog.length - 1; i++) {
				if (pontosDoJog[i] < pontosDoJog[i+1]) {
					trocou = true;
					int pontosTemp = pontosDoJog[i];
					pontosDoJog[i] = pontosDoJog[i+1];
					pontosDoJog[i+1] = pontosTemp;
					
					String jogTemp = jogadores[i];
					jogadores[i] = jogadores[i+1];
					jogadores[i+1] = jogTemp;
				}
			}
		}
		
		for (int i = 0; i < jogadores.length; i++) {
			System.out.println("Jogador:" + jogadores[i]);
			System.out.println("Pontos:" + pontosDoJog[i]);
		}
	}

}
