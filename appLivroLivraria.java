package app;

import java.util.Locale;
import java.util.Scanner;

public class appLivroLivraria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		int menu;
		double vInicial, vFinal;
		LivroLivraria objLivro;
		String titulo, autor, genero;
		float preco;
		int isbn;
		
		do {
			exibirMenu();
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				System.out.println("Digite o título do livro");
				titulo = entradaString.nextLine();
				System.out.println("Digite o autor do livro");
				autor = entradaString.nextLine();
				System.out.println("Digite o gênero");
				genero = entradaString.nextLine();
				System.out.println("Digite o ISBN");
				isbn = entrada.nextInt();
				System.out.println("Digite o preço");
				preco = entrada.nextFloat();
				//Criar objeto da classe
				objLivro = new LivroLivraria(titulo, autor, isbn, genero, preco);
				//Guardando no ArrayList
				acervo.adicionar(objLivro);
				break;
			case 2:
				System.out.println("LISTAGEM DOS LIVROS");
				System.out.println(acervo.listar());
				break;
			case 3:
				System.out.println("EXCLUSÃO DOS LIVROS");
				System.out.println("Digite o título do livro");
				titulo = entradaString.nextLine();
				
				if ( ! (acervo.getListaLivros().isEmpty())) {
					if (acervo.remover(titulo)) {
						System.out.println("O livro foi removido com sucesso");
					}
					else {
						System.out.println("Título não encontrado");
					}
				}
				else {
					System.out.println("Não existem livros no acervo");
				}
				break;
			case 4:
				System.out.println("PESQUISAR POR GÊNERO");
				System.out.println("Digite o gênero do livro");
				genero = entradaString.nextLine();
				System.out.println("Existem " + acervo.pesquisar(genero) + " livro(s) do gênero " + genero);
				break;
			case 5:
				System.out.println("PESQUISAR POR FAIXA DE PREÇO");
				System.out.println("Digite a faixa inicial e faixa final");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				System.out.println("Existem " + acervo.pesquisar(vInicial, vFinal) + " livro(s) com preço entre " 
				+ String.format("R$ %.2f e R$ %.2f", vInicial, vFinal));
				break;
			case 6:
				System.out.println("VALOR TOTAL DOS LIVROS NO ACERVO");
				System.out.println("O valor total é: " + String.format(" R$", acervo.valorTotal()));
				break;
			case 7:
				System.out.println("SAINDO...");
				break;
			default:
				System.out.println("OPÇAO DE MENU INVALIDA");
			} 
			
			
		}while(menu != 7);
		entrada.close();
		entradaString.close();

	}
	static void exibirMenu() {
		System.out.println("-------- LIVRO LIVRARIA --------");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXCLUIR LIVRO");
		System.out.println("4 - PESQUISAR GÊNERO");
		System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
		System.out.println("6 - CALCULAR O VALOR TOTAL DO ACERVO");
		System.out.println("7 - SAIR");
		System.out.println("--- ESCOLHA UMA OPÇÃO ---");
	}

}
