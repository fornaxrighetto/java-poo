package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new Livro();
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
