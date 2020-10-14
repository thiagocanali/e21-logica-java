import java.util.Scanner;

public class Exercicios {

	Exercicios() {
		
	}
	
	public void exibeExercicio() {
		String codigoQuestao;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Q01 -  Quest�o 1 - Valor Maior");
		System.out.println("Q02 -  Quest�o 2 - Qual o menor valor");
		System.out.println("Q03 -  Quest�o 3 - Valor par ou �mpar");
		System.out.println("Q04 -  Quest�o 4 - C�digo dos produtos");
		System.out.println("Q05 -  Quest�o 5 - Apto a votar");
		System.out.println("Informe o c�digo da quest�o desejada:");

		codigoQuestao = entradaGeral.nextLine();

		switch (codigoQuestao) {
		case "Q01":
			questao1();
			System.out.println("Obrigado por escolher a quest�o 1!");
			break;
		case "Q02":
			System.out.println("Algoritmo Bugado feito pelo ramon:");
			questao2();
			System.out.println("Algoritmo feito pelo Felipe:");
			felipeAnzini();
			break;
		case "Q03":
			questao3();
			System.out.println("Lembrem-se de aprender como calcular o n�mero par.");
			break;
		case "Q04":
			questao4();
			break;
		case "Q05":
			questao5();
			break;

		default:
			System.out.println("C�digo inv�lido!!!");
			System.out.println("Olha esse c�digo de tri�ngulos (=^_^=)");
			triangulo();
			break;
		}
		entradaGeral.close();
		System.exit(0);
	}
	
	public  void felipeAnzini() {

		int valorUm, valorDois, valorTres, valorQuatro;
		Scanner entradaDeDados;

		System.out.println("Infome quatro numeros");

		entradaDeDados = new Scanner(System.in);

		System.out.println("Primeiro");
		valorUm = entradaDeDados.nextInt();
		System.out.println("Segundo");
		valorDois = entradaDeDados.nextInt();
		System.out.println("Terceiro");
		valorTres = entradaDeDados.nextInt();
		System.out.println("Quarto");
		valorQuatro = entradaDeDados.nextInt();

		if (valorUm <= valorDois && valorUm <= valorTres && valorUm <= valorQuatro) {
			System.out.println(valorUm + " foi o menor n�mero escolhido.");
		} else if (valorDois <= valorUm && valorDois <= valorTres && valorDois <= valorQuatro) {
			System.out.println(valorDois + " foi o menor n�mero escolhido.");
		} else if (valorTres <= valorUm && valorTres <= valorDois && valorTres <= valorQuatro) {
			System.out.println(valorTres + " foi o menor n�mero escolhido.");
		} else {
			System.out.println(valorQuatro + " foi o menor n�mero escolhido.");
		}
	}

	public  void questao1() {
		int primeiroValor, segundoValor;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe o primeiro valor:");
		primeiroValor = entradaValor.nextInt();

		System.out.println("Informe o segundo valor:");
		segundoValor = entradaValor.nextInt();

		if (primeiroValor > segundoValor) {
			System.out.println("O primeiro valor � o maior: " + primeiroValor);
		} else {
			System.out.println("O segundo valor � o maior: " + segundoValor);
		}

		entradaValor.close();
	}

	public  void questao2() {
		int primeiroValor, segundoValor, terceiroValor, quartoValor;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe o primeiro valor:");
		primeiroValor = entradaValor.nextInt();

		System.out.println("Informe o segundo valor:");
		segundoValor = entradaValor.nextInt();

		System.out.println("Informe o terceiro valor:");
		terceiroValor = entradaValor.nextInt();

		System.out.println("Informe o quarto valor:");
		quartoValor = entradaValor.nextInt();

		if ((primeiroValor < segundoValor) && (primeiroValor < terceiroValor) && (primeiroValor < quartoValor)) {
			System.out.println("O primeiro valor � o menor: " + primeiroValor);
		} else if ((segundoValor < primeiroValor) && (segundoValor < terceiroValor) && (segundoValor < quartoValor)) {
			System.out.println("O segundo valor � o menor: " + segundoValor);
		} else if ((terceiroValor < primeiroValor) && (terceiroValor < segundoValor) && (terceiroValor < quartoValor)) {
			System.out.println("O terceiro valor � o menor: " + terceiroValor);
		} else {
			System.out.println("O quarto valor � o menor: " + quartoValor);
		}

		entradaValor.close();

	}

	public  void questao3() {
		int valorInformado;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe um valor inteiro:");
		valorInformado = entradaValor.nextInt();

		if ((valorInformado - valorInformado / 2 * 2) == 0) {
			System.out.println("O valor � par: " + valorInformado);
		} else {
			System.out.println("O valor � �mpar: " + valorInformado);
		}

		entradaValor.close();

	}

	public  void questao4() {
		String codigoProduto;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe c�digo do produto:");
		codigoProduto = entradaValor.next();

		if ("001".equals(codigoProduto)) {
			System.out.println("Produto escolhido � Arroz!");
		} else if ("002".equals(codigoProduto)) {
			System.out.println("Produto escolhido � Feij�o!");
		} else if ("003".equals(codigoProduto)) {
			System.out.println("Produto escolhido � Farinha!");
		} else {
			System.out.println("Produto escolhido � Farinha!");
		}

		entradaValor.close();

	}

	public  void questao5() {
		int anoNascimentoPessoa, anoAtual;
		Scanner entradaValor = new Scanner(System.in);
		anoAtual = 2020;

		System.out.println("Informe o Ano de Nascimento:");
		anoNascimentoPessoa = entradaValor.nextInt();

		if (anoAtual - anoNascimentoPessoa >= 16) {
			System.out.println("Pode votar esse ano!");
		} else {
			System.out.println("N�o pode votar esse ano!");
		}

		entradaValor.close();

	}

	public  void questao6() {

	}

	public  void questao7() {

	}

	public  void questao8() {

	}

	public  String retornaValor() {

		return "Hello there!";
	}

	// feito em aula
	public  void exercicioUm() {
		// 1 - Primeira Quest�o - Se eh negativo ou positivo
		int numero;
		Scanner entradaValor;

		System.out.println("Informe um n�mero:");

		try {

			entradaValor = new Scanner(System.in);

			numero = entradaValor.nextInt();

			if (numero > 0) {
				System.out.println("N�mero digitado � Positivo! N�mero: " + numero);
			} else if (numero < 0) {
				System.out.println("N�mero digitado � Negativo! N�mero: " + numero);
			} else {
				System.out.println("N�mero digitado � Zero! N�mero: " + numero);
			}
		} catch (Exception e) {
			System.out.println("Entrada de dados errada. Favor informar um n�mero!");
		}

		System.out.println("Continua");
	}

	public  void triangulo() {
		int ladoUm, ladoDois, ladoTres;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe o lado 1: ");
		// Lado 1
		ladoUm = entradaValor.nextInt();

		System.out.println("Informe o lado 2: ");
		// Lado 2
		ladoDois = entradaValor.nextInt();

		System.out.println("Informe o lado 3: ");
		// Lado 3
		ladoTres = entradaValor.nextInt();

		// lado1 + lado2
		if (ladoUm + ladoDois > ladoTres) {
			// lado1 + lado3
			if (ladoUm + ladoTres > ladoDois) {
				// lado2 + lado 3
				if (ladoDois + ladoTres > ladoUm) {
					System.out.println("� um tri�ngulo v�lido!");
				} else {
					System.out.println("N�o � um tri�ngulo v�lido. Lado 2 + Lado 3 � Menor que Lado 1!");
				}
			} else {
				System.out.println("N�o � um tri�ngulo v�lido. Lado 1 + Lado 3 � Menor que Lado 2!");
			}
		} else {
			System.out.println("N�o � um tri�ngulo v�lido. Lado 1 + Lado 2 � Menor que Lado 3!");
		}
	}

	public  void triangulo2() {
		// 3- Verificar se triangulo e valido
		int ladoUm, ladoDois, ladoTres;
		Scanner entradaValor = new Scanner(System.in);
		boolean trianguloValido;

		System.out.println("Informe o lado 1: ");
		// Lado 1
		ladoUm = entradaValor.nextInt();

		System.out.println("Informe o lado 2: ");
		// Lado 2
		ladoDois = entradaValor.nextInt();

		System.out.println("Informe o lado 3: ");
		// Lado 3
		ladoTres = entradaValor.nextInt();

		// lado1 + lado2
		if ((ladoUm + ladoDois > ladoTres) || (ladoUm + ladoTres > ladoDois) || (ladoDois + ladoTres > ladoUm)) {
			System.out.println("� um tri�ngulo v�lido!");
			trianguloValido = true;
		} else {
			System.out.println("N�o � um tri�ngulo v�lido!");
			trianguloValido = false;
		}

		//
		if (trianguloValido) {
			// tipo triangulo
		}

		System.out.println("Programa finalizou!");
	}


}
