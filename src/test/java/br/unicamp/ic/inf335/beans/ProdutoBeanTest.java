/**
 * 
 */
package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * @author cvolpato
 *
 */
public class ProdutoBeanTest {
	
	private static final ProdutoBean produtoValor1 = new ProdutoBean("001", "produto 1", "desc1", 1.0, "sp");
	private static final ProdutoBean produtoValor2 = new ProdutoBean("002", "produto 2", "desc2", 2.0, "sp");
	

	@Test
	void testComparetoBigger() {
		assertEquals(1,produtoValor2.compareTo(produtoValor1), "produto com valor 2 deve ser maior que outro com 1");
	}
	
	@Test
	void testComparetoSmaller() {
		assertEquals(-1,produtoValor1.compareTo(produtoValor2), "produto com valor 1 deve ser menor que outro com 2");
	}

	@Test
	void testComparetoEquals() {
		ProdutoBean produtoValor3 = new ProdutoBean("003", "produto 3", "desc3", 1.0, "sp");
		assertEquals(0,produtoValor1.compareTo(produtoValor3), "produto com valor 1 deve ser igual a outro com mesmo valor");
	}
	
}
