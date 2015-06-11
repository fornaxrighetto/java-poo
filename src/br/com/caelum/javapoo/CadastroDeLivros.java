package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class CadastroDeLivros {
	public static void main(String[] args) {
		/*- Vamos trabalhar com Orientacao a Objetos -*/
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratico";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		/*
		System.out.println("O nome do livro é: " + livro.nome);
		System.out.println("A descrição do livro é: " + livro.descricao);
		System.out.println("O valor do livro é: " + livro.valor);
		System.out.println("O numero ISBN do livro " + livro.nome + " é: " + livro.isbn);
		*/
		
		livro.mostraDetalhes();
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-10";
		
		livro.autor = autor; /* - Associando o Autor ao seu Livro - */
	}
}
