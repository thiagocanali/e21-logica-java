import java.util.Scanner;

public class exerc�cio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa para gerenciar as notas dos alunos de uma escola.
		- Crie um vetor para armazenar o nome dos alunos.
		- Crie um vetor para armazenar o endere�o dos alunos.
		- Crie um vetor para armazenar o nome da m�e dos alunos.
		- Crie um vetor para armazenar o nome do pai dos alunos.
		- Crie um vetor para armazenar o telefone dos pais dos alunos.
		- Crie 4 vetores para armazenar 4 notas por aluno.
		- As informa��es nos vetores se relacionar�o atrav�s dos indexadores dos vetores.
		- Crie uma tela para cadastrar os alunos (nome, endere�o, nome dos pais, telefone).
		- Crie uma tela para cadastrar as notas dos alunos.
		- Crie uma tela para consultar o cadastro e situa��o dos alunos.*/
			
				Scanner sc = new Scanner(System.in);
				
				String[] nomes = new String[1000];
				String[] endere�os = new String[1000];
				String[] maes = new String [1000];
				String[] pais = new String [1000];
				String[] telefones = new String [1000];
				double[] notas1 = new double [1000];
				double[] notas2 = new double [1000];
				double[] notas3 = new double [1000];
				double[] notas4 = new double [1000];
				double somaNotas =0;
				double media =0;
				String op�ao= "";
				String situa�ao = "";
				int ind =0;
				
				while (!op�ao.equals("S")) {
					System.out.println("1-Cadastrar alunos");
					System.out.println("2-Cadastrar notas");
					System.out.println("3-Para consultar o cadastro/situa��o");
					System.out.println("4- Alterar nota");
					System.out.println("S para sair");
					System.out.println("Digite uma op��o:");
					op�ao = sc.next();
					
					switch (op�ao) {
					case "1":
						for (int i = 0; i < nomes.length; i++) {  //descobrindo a primeira posi��o vazia
							if (nomes[i] == null) {
								ind = i;
								break;
							}
						}
						System.out.println("---Cadastro de alunos---");
						System.out.println("Nome:");
						nomes[ind] = sc.next();
						
						System.out.println("Endere�o:");
						endere�os[ind] = sc.next();
						
						System.out.println("Pai:");
						pais[ind] = sc.next();
						
						System.out.println("M�e:");
						maes[ind] = sc.next();
						
						System.out.println("Telefone:");
						telefones[ind] = sc.next();	
						
						break;
						
					case "2":
						System.out.println("---Cadastro de notas---");
						System.out.println("C�digo do aluno:");
						ind = sc.nextInt();
						 if (nomes[ind] == null) {
							System.out.println("C�digo inv�lido");
						}
						 else {
							System.out.println("Informe a nota:");
							float notaTemp = sc.nextFloat();
							
							if (notas1[ind] == 0) {
								notas1[ind] = notaTemp;
								
							} else if (notas2[ind] == 0) {
								notas2[ind] = notaTemp;
								
							} 
							else if (notas3[ind] == 0) {
								notas3[ind] = notaTemp;
								
							} 
							else if (notas4[ind] == 0) {
								notas4[ind] = notaTemp;
								
							} 
						}
						break;
						
					case "3":
						System.out.println("---Consulta de cadastro---");
						System.out.println("C�digo do aluno:");
						ind = sc.nextInt();
						 if (nomes[ind] == null) {
							System.out.println("C�digo inv�lido");
						}
						 else {
						 System.out.println("Nome: " + nomes[ind]);
						 System.out.println("Enere�o: " + endere�os[ind]);
						 System.out.println("Pai: " + pais[ind]);
						 System.out.println("M�e: " + maes[ind]);
						 System.out.println("Telefone: " + telefones[ind]);
						 System.out.println("----NOTAS----");
						 System.out.println("Nota 1: " + notas1[ind]);
						 System.out.println("Nota 2: " + notas2[ind]);
						 System.out.println("Nota 3: " + notas3[ind]);
						 System.out.println("Nota 4: " + notas4[ind]);
						 
						 if (notas1[ind] != 0 && notas2[ind] != 0 && notas3[ind] != 0 && notas4[ind] != 0) {
							 media = (notas1[ind] + notas2[ind] + notas3[ind] + notas4[ind])/4;
							 System.out.println("M�dia: " + media);	
							 if (media>=7) {
								System.out.println("Aprovado!");
							} else {
								System.out.println("Reprovado!");
							}
						}
						 else {
							System.out.println("Semestre em andamento...");
						}
						 
						 }
						
						break;
						
					case "4":
						System.out.println("--Alterar nota--");
						System.out.println("C�digo do aluno: ");
						ind = sc.nextInt();
						
						if (nomes[ind] == null) {
							System.out.println("C�digo inv�lido");
						} else {
							System.out.println("N�mero da nota (1 a 4)");
							int numNota = sc.nextInt();
							if (numNota >= 1 && numNota <= 4) {
								System.out.println("Nova nota:");
								switch (numNota) {
								case 1:
									notas1[ind] = sc.nextDouble();
									break;
								case 2:
									notas2[ind] = sc.nextDouble();
									break;
								case 3:
									notas3[ind] = sc.nextDouble();
									break;
								case 4:
									notas4[ind] = sc.nextDouble();
									break;

								default:
									break;
								}
							}
						}
						break;
					
					case "S":
						System.out.println("Saindo...");
						break;
					
					default:
						System.out.println("Op��o inv�lida!");
						break;
					}
				}
				
				/*
				if (op�ao == 1) {
					System.out.println("Nome:");
					nomes[0] = sc.next();
					System.out.println("Endere�o:");
					endere�os[0] = sc.next();
					System.out.println("Pai:");
					pais[0] = sc.next();
					System.out.println("M�e:");
					maes[0] = sc.next();
					System.out.println("Telefone:");
					telefones[0] = sc.next();	
				}
				
				else if (op�ao == 2) {
					System.out.println("Informe a primeira nota:");
					notas1[0] = sc.nextDouble();
					System.out.println("Informe a segunda nota:");
					notas2[0] = sc.nextDouble();
					System.out.println("Informe a terceira nota:");
					notas3[0] = sc.nextDouble();
					System.out.println("Informe a quarta nota:");
					notas4[0] = sc.nextDouble();
					
						for (int j = 0; j < notas4.length; j++) {
							somaNotas = somaNotas + notas1[j] + notas2[j] + notas3[j] + notas4[j]; 
						}
						media = somaNotas/notas1.length;
						if(media>=7) {
							System.out.println("Situa��o: acima da m�dia");
						} else if (media==7) {
							System.out.println("Situa��o: na m�dia");
						} else {
							System.out.println("Situa��o: abaixo da m�dia");
						}
						
				}
				
				
				else if (op�ao == 3) {
					System.out.println("Nome:" + nomes);
					System.out.println("Endere�o:" + endere�os);
					System.out.println("Pai:" + pais);
					System.out.println("M�e:" + maes);
					System.out.println("Telefone:" + telefones);
					System.out.println("Situa��o:" + situa�ao);
				}
			
					/*
					for (int l = 0; l < notas4.length; l++) {
						System.out.println("Qual aluno deseja consultar?");
						nomes[i] = sc.next();
						System.out.println(nomes[i]);
					}
				*/
				
	}

}
