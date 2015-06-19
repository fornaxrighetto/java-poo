package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class Livro {
	/*- Vamos trabalhar com Orientacao a Objetos -*/
	private String nome;
	private String descricao;
	private double valor;
	private String isbn; /* - International Standard Book Number- */
	private Autor autor; /* - Usando Composição - */
	private boolean impresso;
	
	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	void mostraDetalhes(){
		System.out.println("Mostrando detalhes do seu Livro: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("--");
		
		if(this.temAutor()){
			autor.mostraDetalhes();
		}
	}
	
	public boolean aplicaDescontoDe(double porcentagem){
		if(porcentagem > 0.3){
			return false;
		}
		
		/*else if(!this.impresso && porcentagem > 0.15){
			return false;
		}*/
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	boolean temAutor(){
		return this.autor != null;
	}
	
	/* public Livro(){
		// - Criando o construtor da Classe Livro - 
		System.out.println("Mais um objeto livro instanciado!");
	}*/
	
	public Livro(Autor autor){
		/* - Criando o construtor da Classe Livro - Com Sobrecarga- */
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	public Livro(){
		this.isbn = "000-00-00000-00-0";
	}
}
