package questoes;
import java.util.Scanner;
import java.util.ArrayList;

/**Classe que apresenta os métodos computacionais que resolvem a Questão 2 do Desafio de Programação.
* @author Saulo de Társio
* @version 1.00
* @since 24 de fev 22:00
*/
public class Questao2 {
	
	/**
	 * Método que verifica quantos tipos de caracteres já foram colocados na senha.
	 * O tipos são: Números, Caracteres especiais e letras maisculas e minúsculas.
	 * @param senha A senha informada pelo usuário
	 * @return quant_falta
	 */
	public static int verificar_tipos_caracteres(String senha) {
		//Caracteres que já foram avaliados
		ArrayList<Character> repetidas = new ArrayList<Character>(); 
		
		//vetor contendo os caracteres considerados especiais
		char caracteres_especiais[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
		
		int quant_falta = 4;
		//Iterage sobre toda a senha
		for(int i=0; i < senha.length(); i++) {
			//Um caractere da string
			char c = senha.charAt(i);
			int c_inteiro = (int) c;
			//Testa se o caractere é dígito
			if(c_inteiro >= 48 && c_inteiro <= 57 && !repetidas.contains('1')) {
				repetidas.add('1');
				quant_falta--;
			}else {
				//Testa se o caractere é minúsculo
				if(c_inteiro >= 97 && c_inteiro <= 122 && !repetidas.contains('2')) {
					repetidas.add('2');
					quant_falta--;
				}else {
					//Testa se o caractere é minúsculo
					if(c_inteiro >= 65 && c_inteiro <= 90 && !repetidas.contains('3')) {
						repetidas.add('3');
						quant_falta--;
					}else {
						//Verifica se na String há caracteres especiais
						for(int j = 0; j < caracteres_especiais.length; j++) {
							if(c == caracteres_especiais[j] && !repetidas.contains('4')) {
								repetidas.add('4');
								quant_falta--;
								break;
							}
						}
					}
				}
			}
		}
		
		return quant_falta;
	}
	
	/**
	 * Função que verifica quantos caracteres faltam para criar uma válida senha.
	 * 
	 * @param senha A senha informada pelo usuário
	 * @return quant_caracteres
	 */
	
	public static int verificar_quant_caracteres(String senha) {
		//Quantos tipos diferentes de caracteres foram passados na senha
		int quant_tipos_caracteres = verificar_tipos_caracteres(senha);
		
		if(senha.length() + quant_tipos_caracteres <= 6) {
			return 6 - senha.length();
		}
		
		return quant_tipos_caracteres;
	}
	
	/**
	 * Método principal. Ele é chamado para executar o programa que foi pedido. Esse método invoca as funções
	 * implementadas, além de adquirir a entrada do usuário. Imprime o número de caracteres que faltam para deixar a senha
	 * informada segura.
	 * @param args Argumentos para a função main
	 */
	public static void main(String[] args) {
		//Para a entrada via teclado
		Scanner s = new Scanner(System.in);
		
		//Pedindo a senha para o usuário
		System.out.print("Informe a senha: ");
		//Lendo do teclado
		String senha = s.nextLine();
		//fechando o Scanner
		s.close();
		//Imprimindo o número de caracteres que faltam para completar a senha
		System.out.println(verificar_quant_caracteres(senha));
	}
}
