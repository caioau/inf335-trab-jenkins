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
class AnuncianteBeanTest {

	@Test
	void testMedia() {
		ProdutoBean produtoValor1 = new ProdutoBean("001", "produto 1", "desc1", 100.0, "sp");
		AnuncioBean anuncio0Desconto = new AnuncioBean();
		anuncio0Desconto.setDesconto(0.0);
		anuncio0Desconto.setProduto(produtoValor1);
		AnuncioBean anuncio0Desconto2 = new AnuncioBean();
		anuncio0Desconto2.setDesconto(0.0);
		ProdutoBean produtoValor2 = new ProdutoBean("002", "produto 2", "desc2", 200.0, "sp");
		anuncio0Desconto2.setProduto(produtoValor2);
		AnuncianteBean anunciante = new AnuncianteBean();
		anunciante.addAnuncio(anuncio0Desconto);
		anunciante.addAnuncio(anuncio0Desconto2);
		assertEquals(150.0, anunciante.valorMedioAnuncios());
	}

}
