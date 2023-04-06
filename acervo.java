package app;

import java.util.ArrayList;

public class acervo {

	private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	//Método GET
	public static ArrayList<LivroLivraria> getListaLivros() {
		return listaLivros;
	}
	static public void adicionar(LivroLivraria l) {
		listaLivros.add(l);
	}
	//Listando todos os livros
	static public String listar() {
		String saida = "";
		int i = 1;
		for (LivroLivraria l : listaLivros) {
			saida += "Livro número: " + (i++);
			saida += l.imprimir() + "\n";
		}
		return saida;				
	}
	static public int pesquisar(String genero) {
		int quant = 0;
		for (LivroLivraria l : listaLivros) {
			if(l.getGenero().equalsIgnoreCase(genero)) {
				quant++;
			}
	}	
		return quant;	
	}
	static public int pesquisar(double vInicial, double vFinal) {
		int quant = 0;
		for (LivroLivraria l : listaLivros) {
			if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
				quant++;
			}
		}
		return quant;
	}
	static public boolean remover(String titulo) {
		for (LivroLivraria l : listaLivros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;
	}
	static public double valorTotal() {
		double quant = 0;
		for (LivroLivraria l : listaLivros) {
			quant += l.getPreco();			
		}
	
		return quant;
	}
}
	
	
	


	
	
		
		
	
	
	
	

		
	


