package questoes;
import java.util.ArrayList;
import java.util.Scanner;

/**
* Classe que apresenta os métodos computacionais que resolvem a Questão 3 do Desafio de Programação.
* @author Saulo de Társio
* @version 1.00
* @since 24 de fev 22:25
*/

public class Questao3 {
	//Retorna todas as substrings formadas pela palavra informada
	
	/**
	 * Método que recebe a palavra informada pelo usuário e constroi um array com todas as
	 * substrings geradas a partir dela.
	 * @param palavra A palavra informada pelo usuário
	 * @return sub_array
	 */
	public static ArrayList<String> substrings(String palavra){
		//O array de substrings
		ArrayList<String> sub_array = new ArrayList<String>();
		
		for(int i=0; i < palavra.length(); i++) {
			for(int j=i; j < palavra.length(); j++) {
				//Adiciona no array a substring
				sub_array.add(palavra.substring(i, j+1));
			}
		}
		
		return sub_array;
	}
	
	/**
	 * Método que compara se duas strings são anagramas uma da outra.
	 * @param str1 Uma string qualquer
	 * @param str2 Uma String qualquer
	 * @return isAnagram
	 */
	public static boolean verificar_anagramas(String str1, String str2) {
		//Criando dois arrays de caracteres construídos a partir das strings recebidas
		ArrayList<Character> char1 = new ArrayList<Character>();
		ArrayList<Character> char2 = new ArrayList<Character>();
		boolean isAnagram = false;
				
		int cont = 0;
		int peso1 = 0;
		int peso2 = 0;
		
				
		//Não há anagrama se as strings tiverem tamanhos diferentes
		if(str1.length() != str2.length())
			return isAnagram;
		
		//Construindo dois ArrayLists
		for(int i=0; i < str1.length(); i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			//Adiciona nos arrays
			char1.add(c1);
			char2.add(c2);
			
			//calcula os pesos das palavras
			//pesos são iguais caso haja os mesmos caracteres nas duas strings 
			peso1 = peso1 + (int)c1;
			peso2 = peso2 + (int)c2;
			
		}
		
		//verifica se todos os carecteres de um string estão contidos na outra
		for(int i=0; i < char1.size(); i++) {
			if(char1.contains(char2.get(i))) {
				cont++;
			}
		}
		
		//Verdade, caso o cont seja igual ao tamanho de uma das strings, indicando que todos os caracteres
		//estão contido e os pesos são iguais, se há apenas os mesmo caracteres na string.
		isAnagram = cont == char1.size() && peso1 == peso2;
				
		return isAnagram;
	}
	
	/**
	 * Função que constrói uma lista de substrings a partir da palavra informada pelo usuário
	 * e verifica se dentro dessa lista há pares que anagramas entre si, retornando a quantidade
	 * desses anagramas.
	 * @param palavra A palavra informada pelo usuário.
	 * @return cont_anagramas
	 */
	public static int verificar_quant_anagramas(String palavra) {
		//Obtendo as substrings
		ArrayList<String> subs = substrings(palavra);
		int cont_anagramas = 0;
		
		//pegando pares de substrings formadas pela palavra informada pelo usuário
		for(int i = 0; i < subs.size(); i++) {
			for(int j = i+1; j < subs.size(); j++) {
				if(verificar_anagramas(subs.get(i), subs.get(j))) {
					cont_anagramas++;
				}
			}
		}
		
		return cont_anagramas;
	}
	
	/**
	 * Método principal. Ele é chamado para executar o programa que foi pedido. Esse método invoca as funções
	 * implementadas, além de adquirir a entrada do usuário. Imprime o número de anagramas presentes na palavra
	 * informada pelo usuário
	 * @param args Argumentos para a função main
	 */
	public static void main(String[] args) {
		//Para a entrada a partir do teclado
		Scanner s = new Scanner(System.in);
		
		//Pegando a entrada do usuário
		System.out.print("Informe a palava: ");
		String palavra = s.nextLine();
		s.close();
		
		//vericando o número de anagramas
		int cont_anagramas = verificar_quant_anagramas(palavra);
		System.out.println(cont_anagramas);
		
	}

}
