package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Implementacao.Vendedor;

public class VendedorTest {

	@Test
	public void testVendedor() {
		Vendedor a = new Vendedor("Lucas","Saldanha", "(31) 98521-2548","16.528.961", "153.698.258-63","Masculino");
		assertEquals("Lucas",a.getNome());
		assertEquals("(31) 98521-2548",a.getTelefone());
		assertEquals("16.528.961", a.getRG());
		assertEquals("153.698.258-63",a.getCPF());
		assertEquals("Masculino",a.getSexo());
		assertEquals("Saldanha",a.getSobrenome());
	}

}
