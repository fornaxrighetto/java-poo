package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class Livro {
	/*- Vamos trabalhar com Orientacao a Objetos -*/
	String nome;
	String descricao;
	double valor;
	String isbn; /* - International Standard Book Number- */
	Autor autor; /* - Usando Composição - */
	
	void mostraDetalhes(){
		System.out.println("Mostrando detalhes do seu Livro: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("--");
	}
}
