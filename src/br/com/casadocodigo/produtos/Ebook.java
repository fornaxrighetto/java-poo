package br.com.casadocodigo.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class Ebook  extends Livro implements Promocional{
	private String waterMark;
	
	public Ebook(Autor autor){
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem){
		if(porcentagem > 0.15){
			return false;
		}
		/*
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		*/
		return aplicaDescontoDe(porcentagem);
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
}
