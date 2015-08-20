package br.com.casadocodigo.testes;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.Ebook;
import br.com.casadocodigo.produtos.LivroFisico;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.3)){
			System.out.println("Desconto do Livro não pode ser maior do que 30% !");
		}else{
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.3)){
			System.out.println("Desconto não pode ser maior do que 15% !");
		}else{
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
