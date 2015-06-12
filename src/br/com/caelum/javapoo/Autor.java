package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class Autor {
	String nome;
	String email;
	String cpf;
	
	void mostraDetalhes(){
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("CPF: " + this.cpf);
		System.out.println("--");
	}
}
