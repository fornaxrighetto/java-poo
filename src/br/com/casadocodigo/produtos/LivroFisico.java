package br.com.casadocodigo.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class LivroFisico extends Livro implements Promocional{
	public LivroFisico(Autor autor){
		super(autor);
	}
	
	public double getTaxaImpressao(){
		return this.getValor() * 0.05;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
