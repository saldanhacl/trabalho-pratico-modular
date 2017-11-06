package Testes;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

import org.junit.Test;

import Implementacao.Cliente;

public class ClienteTest {

	@Test
	public void testCliente() {
		Cliente a = new Cliente("Hugo","(31) 98521-2548", 30, "153.698.258-63","Masculino","De Paula");
		assertEquals("Hugo",a.getNome());
		assertEquals("(31) 98521-2548",a.getTelefone());
		assertEquals(30,a.getIdade());
		assertEquals("153.698.258-63",a.getCPF());
		assertEquals("Masculino",a.getSexo());
		assertEquals("De Paula",a.getSobrenome());
	}

}
