package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class CarrinhoDeCompras {
	private double total;
	
	/*public void adiciona(Livro livro){
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	}*/
	
	public void adiciona(Produto produto){
		// aumentando o polimorfismo
		System.out.println("Adicionando: " + produto);
		total += produto.getValor();
	}

	public void adiciona(Revista revista){
		System.out.println("Adicionando: " + revista);
		revista.aplicaDescontoDe(0.05);
		total += revista.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
	
}
