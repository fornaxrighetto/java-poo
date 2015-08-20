package br.com.casadocodigo.livraria;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void mostraDetalhes(){
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("CPF: " + this.cpf);
		System.out.println("--");
	}
}
