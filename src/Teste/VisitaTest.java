package Teste;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import Implementacao.Cliente;
import Implementacao.Produto;
import Implementacao.Vendedor;
import Implementacao.Visita;

public class VisitaTest {

	@Test
	public void testVisita() {
		Vendedor a = new Vendedor("Lucas","Saldanha", "(31) 98521-2548","16.528.961", "153.698.258-63","Masculino");
		Cliente b = new Cliente("Hugo","(31) 98521-2548", 30, "153.698.258-63","Masculino","De Paula");
		Produto c = new Produto("P�o",0.58,200);
		Visita d = new Visita(a,b,c,"12/12/2017","18:00");
		assertEquals(a, d.getVendedorVisitante());
		assertEquals(b, d.getClienteVisitado());
		assertEquals(c, d.getProdutoVendido());
		GregorianCalendar dataADD = new GregorianCalendar();
        dataADD.set(2017,12,12,18,00);
        assertEquals(dataADD.getTime(), d.getDataDaVisita().getTime());
	}

}
