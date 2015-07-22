package br.com.caelum.javapoo;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */
public class LivroFisico extends Livro{
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
