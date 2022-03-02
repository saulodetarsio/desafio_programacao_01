package questoes;
import java.util.Scanner;

/**
 * Classe que apresenta os métodos computacionais que resolvem a Questão 1 do Desafio de Programação.
* @author Saulo de Társio
* @version 1.00
* @since 24 de fev 22:10
*/
public class Questao1 {
	/**
	 * Método que recebe o valor informado pelo usuário e imprime o padrão pedido na questão do desafio.
	 * @param n um valor inteiro informado pelo usuário.
	 */
	public static void imprimir_padrao(int n) {
		//Fazendo a impressão
		for(int i=0; i < n; i++) {
			//Os espaços
			for (int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			//Os asteriscos
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			//Uma quebra de linha
			System.out.println();
		}
	}
	
	/**
	 * Método principal. Ele é chamado para executar o programa que foi pedido. Esse método invoca a função
	 * implementada, além de adquirir a entrada do usuário. Imprime o padrão pedido na questão do desafio.
	 * @param args Argumentos para a função main
	 */
	public static void main(String[] args) {
		//Para adquirir dados do teclado
		Scanner s = new Scanner(System.in);
		
		//Adquirindo os dados do usuário
		System.out.print("Informe o valor de n: ");
		//A leitura do teclado
		int n = s.nextInt();
		//fechar Scanner
		s.close();
		
		//chamada do métod que imprime o padrão
		imprimir_padrao(n);
		
	}

}
