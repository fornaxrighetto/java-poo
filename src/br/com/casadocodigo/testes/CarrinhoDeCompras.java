package br.com.casadocodigo.testes;

import br.com.casadocodigo.produtos.Produto;
import br.com.casadocodigo.produtos.Revista;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class CarrinhoDeCompras {
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	/*public void adiciona(Livro livro){
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	}*/
	
	public void adiciona(Produto produto){
		// aumentando o polimorfismo
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();
	}

	public void adiciona(Revista revista){
		System.out.println("Adicionando: " + revista);
		revista.aplicaDescontoDe(0.05);
		total += revista.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
	public void getProdutos(){
		for (int i = 0; i < produtos.length; i++) {
			Produto produto = produtos[i];
			if (produto != null) {
				System.out.println(produto.getValor());
			}
		}
	}
}
