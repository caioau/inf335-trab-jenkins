/**
 * 
 */
package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * @author cvolpato
 *
 */
class AnuncioBeanTest {
	
	private static final ProdutoBean produtoValor100 = new ProdutoBean("001", "produto 1", "desc1", 100.0, "sp");
	private static final AnuncioBean anuncio = new AnuncioBean();
	
    @BeforeAll
    static void setup() {
    	anuncio.setProduto(produtoValor100);
    }

	@Test
	void testDesconto100() {
		anuncio.setDesconto(1.0);
		assertEquals(0.0, anuncio.getValor());
	}
	
	@Test
	void testDesconto0() {
		anuncio.setDesconto(0.0);
		assertEquals(100.0, anuncio.getValor());
	}
	
	@Test
	void testDesconto50() {
		anuncio.setDesconto(0.5);
		assertEquals(50.0, anuncio.getValor());
	}
	
	@Test
	void testDesconto10() {
		anuncio.setDesconto(0.1);
		assertEquals(90.0, anuncio.getValor());
	}
	
	@Test
	void testDesconto1() {
		anuncio.setDesconto(0.01);
		assertEquals(99.0, anuncio.getValor());
	}

}
