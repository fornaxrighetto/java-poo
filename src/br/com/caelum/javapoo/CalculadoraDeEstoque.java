package br.com.caelum.javapoo;

import javax.swing.JOptionPane;

/**
 * @author Danilo Righetto
 * @version 1.0
 * @book Desbravando Java e Orientacao a Objetos
 */

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		/* - Armazenando o valor dos nossos livros dentro do metodo MAIN - */
		double livroJava8;
		double livroTDD;
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
		
		JOptionPane.showMessageDialog(null, "Livro Java 8: " + livroJava8 + 
				"Livro TDD: " + livroTDD);
		
		double soma = livroJava8 + livroTDD;
		
		JOptionPane.showMessageDialog(null, "O total em estoque é: " + soma);
		
		/* - Casting de Valores;
		 * "Você pode colocar uma formiga na casa de um cavalo, o contrário não daria certo"
		 * - */
		
		int numeroInteiro = (int) livroJava8;
		System.out.println("O Cast de uma variavel DOUBLE para INT é: " + numeroInteiro);
		
		/* - Inserindo Condicionais no nosso codigo - */
		
		boolean resultado  = soma < 150;
		
		if(soma < 150){
			System.out.println("Seu estoque esta muito baixo! \n O valor do seu estoque é: " + soma);
			System.out.println(resultado);
		}else if(soma >= 2000){
			System.out.println("Seu estoque esta muito alto! \n O valor do seu estoque é: " + soma);
			System.out.println(resultado);
		}else{
			System.out.println("Seu estoque esta bom! \n O valor do seu estoque é: " + soma);
			System.out.println(resultado);
		}
		/* - Use quando puder o operador ternario - */
		
		/* - Vamos criar um contador de livros usando o WHILE- */
		
		int contador = 0;
		while(contador < 35){
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador++;
		}
		
		/* - Atenção: Cuidado para não criar um LOOP infinito- */
		/* - Agora vamos usar o LOOP com FOR- */
		
		for(int cont = 0; cont < 35; cont++){
			soma += 59.90;
		}
		/* - 
		 * Lembre-se que podemos usar junto dos LOOPs as palavras chave continue e break;
		 * Use Operadores Logicos em vez de varios IF e ELSE
		 * - */
	}
}
