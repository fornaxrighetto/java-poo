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
	Autor autor; /* - Usando Composi��o - */
	
	void mostraDetalhes(){
		System.out.println("Mostrando detalhes do seu Livro: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descri��o: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("--");
		
		if(this.temAutor()){
			autor.mostraDetalhes();
		}
	}
	
	public void aplicaDescontoDe(double porcentagem){
		this.valor -= this.valor * porcentagem;
	}
	
	boolean temAutor(){
		return this.autor != null;
	}
	
	public Livro(){
		/* - Criando o construtor da Classe Livro - */
		System.out.println("Mais um objeto livro instanciado!");
	}
}
