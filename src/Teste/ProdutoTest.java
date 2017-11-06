package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Implementacao.Produto;

public class ProdutoTest {

	@Test
	public void testProduto() {
		Produto a = new Produto("P�o",0.58,200);
		assertEquals("P�o",a.getNomeDoProduto());
		assertEquals(0.58,a.getPrecoUnitario(),0.1);
		assertEquals(200,a.getQuantidadeProduto());
	}

}
