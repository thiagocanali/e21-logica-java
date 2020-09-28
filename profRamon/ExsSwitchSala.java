import java.util.Scanner;

public class ExsSwitchSala {

	public static void main(String[] args) {

//		exSwitch1();
//		exSwitch2();
//		exSwitch3();
//		exSwitch4();

	}

	public static void exSwitch1() {

		/*
		 * 1. Crie uma vari�vel chamada �fruta�. Esta vari�vel deve receber uma string
		 * com o nome de uma fruta. Ap�s, crie uma estrutura condicional switch que
		 * receba esta vari�vel e que possua tr�s casos: caso ma��, retorne no console:
		 * �N�o vendemos esta fruta aqui�. Caso kiwi, retorne: �Estamos com escassez de
		 * kiwis� e caso melancia, retorne: �Aqui est�, s�o 3 reais o quilo�.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Frutas: Maca, Kiwi e Melancia.");

		System.out.print("Digite uma fruta: ");

		String fruta = leia.next();

		switch (fruta.toLowerCase()) {
		case "maca":
			System.out.println("N�o vendemos esta fruta aqui.");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis.");
			break;
		case "melancia":
			System.out.println("Aqui est�, s�o 3 reais o quilo.");
			break;
		default:
			System.out.println("Fruta n�o reconhecida...");
			break;
		}
		leia.close();
	}

	public static void exSwitch2() {

		/*
		 * 2. Um homem decidiu ir � uma revenda comprar um carro. Ele deseja comprar um
		 * carro hatch, e a revenda possui, al�m de carros hatch, sedans, motocicletas e
		 * caminhonetes. Utilizando uma estrutura switch/case, caso o comprador queira o
		 * hatch, retorne: �Compra efetuada com sucesso�. Nas outras op��es, retorne:
		 * �Tem certeza que n�o prefere este modelo?�. Caso seja especificado um modelo
		 * que n�o est� dispon�vel, retorne no console: �N�o trabalhamos com este tipo
		 * de autom�vel aqui�.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um modelo de autom�vel.");
		System.out.println("Informe o c�digo de ve�culo desejado: ");
		System.out.println("CH - Carros Hatch");
		System.out.println("CS - Carros Sedan");
		System.out.println("M - Motocicletas");
		System.out.println("CNT - Caminhonetes");

		String codigoVeiculo = leia.next();

		switch (codigoVeiculo.toLowerCase()) {
		case "ch":
			System.out.println("Compra de um Hatch efetuada com sucesso.");
			break;
		case "cs":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoSedan = leia.next();

			String compraSedan = confirmacaoSedan.equalsIgnoreCase("S") ? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoSedan.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Op��o inv�lida. '" + confirmacaoSedan + "'";

			System.out.println(compraSedan);
			break;
		case "m":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoMotocicleta = leia.next();

			String compraMotocicleta = confirmacaoMotocicleta.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoMotocicleta.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Op��o inv�lida. '" + confirmacaoMotocicleta + "'";

			System.out.println(compraMotocicleta);
			break;
		case "cnt":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoCaminhonete = leia.next();

			String compraCaminhonete = confirmacaoCaminhonete.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoCaminhonete.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Op��o inv�lida. '" + confirmacaoCaminhonete + "'";

			System.out.println(compraCaminhonete);
			break;
		default:
			System.out.println("C�digo inv�lido. '" + codigoVeiculo + "'");
			break;
		}
		leia.close();
	}

	public static void exSwitch3() {

		/*
		 * 3. Fa�a um programa que simule uma calculadora, onde informa as op��es pro
		 * usu�rio escolher qual opera��o deseja realizar, e em seguida informe dois
		 * n�meros para realizar a opera��o. Use o case para programar as opera��es
		 * espec�ficas. (soma, subtra��o, multiplica��o e divis�o)
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha uma opera��o: +, -, x, /");
		String operacao = leia.next();
		int numero1 = 0, numero2 = 0;
		Integer resultado = null;

		if (operacao.equals("+") || operacao.equals("-") || operacao.equals("x") || operacao.equals("/")) {
			System.out.print("Digite o primeiro n�mero: ");
			numero1 = leia.nextInt();
			System.out.print("Digite o segundo n�mero: ");
			numero2 = leia.nextInt();
		} else {
			System.out.println("Opera��o n�o reconhecida. '" + operacao + "'");
		}
		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "x":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			break;
		}
		leia.close();
		if (resultado != null) {
			System.out.println(
					"O resultado da opera��o " + numero1 + " " + operacao + " " + numero2 + " �: " + resultado);
		}

	}

	public static void exSwitch4() {

		/*
		 * 4. Fa�a um programa que mostre op��o de Tipos de produtos para o usu�rio, e
		 * ap�s o usu�rio escolhe o tipo de produto, apresente v�rias op��es. Exemplo:
		 * Produtos N�o-perec�veis: arroz, feij�o, caf�; Frutas: manga, banana, ma��;
		 * Bebidas: leite, sucos, refrigerantes
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha uma categoria: ");
		System.out.println("1 - Produtos n�o-perec�veis");
		System.out.println("2 - Frutas");
		System.out.println("3 - Bebidas");

		int escolhaCategoria = leia.nextInt();

		switch (escolhaCategoria) {
		case 1:
			System.out.println("Arroz, feij�o, caf�");
			break;
		case 2:
			System.out.println("Ma��, banana, manga, melancia");
			break;
		case 3:
			System.out.println("Energ�tico, suco, leite, refrigerante");
			break;
		default:
			System.out.println("Produto n�o reconhecido!");
			break;
		}
		leia.close();
	}

}
