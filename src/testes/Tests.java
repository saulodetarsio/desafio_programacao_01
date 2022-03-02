package testes;

import junit.framework.TestCase;
import questoes.Questao2;
import questoes.Questao3;

/**
 * Classe que apresenta os métodos computacionais que testam os programas implementados referentes às questões 2 e 3 do Desafio de Programação.
* @author Saulo de Társio
* @version 1.00
* @since 02 de mar 17:30
*/
public class Tests extends TestCase{
	
	//Testes da Questão 2 começam aqui
	
	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, falta apenas um caractere.
	 */
	public void testFaltaUmCaractere() {
		assertEquals(Questao2.verificar_quant_caracteres("1#sDD"), 1);
		assertEquals(Questao2.verificar_quant_caracteres("12Ass"), 1);
		assertEquals(Questao2.verificar_quant_caracteres("12Asss"), 1);
		assertEquals(Questao2.verificar_quant_caracteres("122AAsss2AAd"), 1);
		assertEquals(Questao2.verificar_quant_caracteres("#@asasS"), 1);
	}
	
	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, faltam dois caracteres.
	 */
	public void testFaltaDoisCaracteres() {
		assertEquals(Questao2.verificar_quant_caracteres("12As"), 2);
		assertEquals(Questao2.verificar_quant_caracteres("AsssAA"), 2);
		assertEquals(Questao2.verificar_quant_caracteres("AssA"), 2);
		assertEquals(Questao2.verificar_quant_caracteres("1XXX2X"), 2);
		assertEquals(Questao2.verificar_quant_caracteres("AssAA"), 2);
		
	}
	
	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, faltam três caracteres.
	 */
	public void testFaltamTresCaracteres() {
		assertEquals(Questao2.verificar_quant_caracteres("AAA"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("AAAA"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("AAAAA"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("AAAAAAAAAAA"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("Ya3"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("Yaa"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("aaaa"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("''''a"), 3);
		assertEquals(Questao2.verificar_quant_caracteres("]]]]]]]W"), 3);
	}
	

	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, faltam quatro caracteres.
	 */
	public void testFaltamQuatroCaracteres() {
		assertEquals(Questao2.verificar_quant_caracteres("AA"), 4);
		assertEquals(Questao2.verificar_quant_caracteres("Aa"), 4);
		assertEquals(Questao2.verificar_quant_caracteres("1]"), 4);
		assertEquals(Questao2.verificar_quant_caracteres("]]"), 4);
		assertEquals(Questao2.verificar_quant_caracteres("]]]"), 4);
		assertEquals(Questao2.verificar_quant_caracteres("]]]]]]"), 4);

	}
	
	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, faltam cinco caracteres.
	 */
	public void testFaltamCincoCaracteres() {
		assertEquals(Questao2.verificar_quant_caracteres("A"), 5);
		assertEquals(Questao2.verificar_quant_caracteres("3"), 5);
		assertEquals(Questao2.verificar_quant_caracteres("["), 5);

	}
	
	/**
	 * Método que testa o programa implementado referente à questão 2. 
	 * Nesse caso, para a senha ser definida como forte, faltam quatro caracteres.
	 */
	public void testFaltamSeisCaracteres() {
		assertEquals(Questao2.verificar_quant_caracteres(""), 6);
	}
	
	//Testes da Questão 3 começam aqui
	
	/**
	 * Método que testa o programa implementado referente à questão 3. 
	 * Nesse caso, não há de anagramas na palavra dada.
	 */
	
	public void testeCaso0() {
		assertEquals(Questao3.verificar_quant_anagramas("ao"), 0);
		assertEquals(Questao3.verificar_quant_anagramas("ea"), 0);
		assertEquals(Questao3.verificar_quant_anagramas("auo"), 0);
		assertEquals(Questao3.verificar_quant_anagramas("abcd"), 0);
	}
	
	/**
	 * Método que testa o programa implementado referente à questão 3. 
	 * Nesse caso, há apenas 1 par de anagramas na palavra dada.
	 */
	
	public void testeCaso1() {
		assertEquals(Questao3.verificar_quant_anagramas("OO"), 1);
		assertEquals(Questao3.verificar_quant_anagramas("11"), 1);
		
	}
	
	/**
	 * Método que testa o programa implementado referente à questão 3.
	 * Nesse caso, há 2 pares de anagramas na palavra dada.
	 */
	
	public void testeCaso2() {
		assertEquals(Questao3.verificar_quant_anagramas("ovo"), 2);
		assertEquals(Questao3.verificar_quant_anagramas("asa"), 2);
		assertEquals(Questao3.verificar_quant_anagramas("mim"), 2);
		
	}
	
	/**
	 *  Método que testa o programa implementado referente à questão 3.
	 * Nesse caso, há 3 pares de anagramas na palavra dada.
	 */
	public void testeCaso3() {
		assertEquals(Questao3.verificar_quant_anagramas("ifailuhkqq"), 3);		
	}
	
	/**
	 *  Método que testa o programa implementado referente à questão 3. 
	 * Nesse caso, há 4 pares de anagramas na palavra dada.
	 */
	public void testeCaso4() {
		assertEquals(Questao3.verificar_quant_anagramas("abba"), 4);		
	}
	
	/**
	 * Método que testa o programa implementado referente à questão 3.
	 * Nesse caso, há 5 pares de anagramas na palavra dada.
	 */
	public void testeCaso5() {
		assertEquals(Questao3.verificar_quant_anagramas("abab"), 5);		
	}
	

	/**
	 * Método que testa o programa implementado referente à questão 3. 
	 * Nesse caso, há 10 pares de anagramas na palavra dada.
	 */
	public void testeCaso10() {
		assertEquals(Questao3.verificar_quant_anagramas("aaaa"), 10);		
	}
	
	
}
