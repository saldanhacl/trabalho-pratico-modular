package Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.*;

import org.junit.Test;

import Implementacao.Cliente;
import Implementacao.Empresa;
import Implementacao.Produto;
import Implementacao.Vendedor;
import Implementacao.Visita;

public class AgendaTest {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testMostrarVisitas() 
	{
		Vendedor a = new Vendedor("Lucas","Saldanha", "(31) 98521-2548","16.528.961", "153.698.258-63","Masculino");
		Cliente b = new Cliente("Hugo","(31) 98521-2548", 30, "153.698.258-63","Masculino","De Paula");
		Produto c = new Produto("P�o",0.58,200);
		Empresa software = new Empresa("PBRL", "120.3254.201-0001.96");
		
		Visita d = new Visita(a,b,c,"12/12/2017","18:00");
		List<Visita> lista = new ArrayList<Visita>();
		lista.add(d);
		
		software.agendarVisita(a, b, c, "12/12/2017", "18:00");
		List<Visita> lista2 = new ArrayList<Visita>();
		lista2 = a.getAgenda().getVisitas();
		Visita v1 = lista2.get(0);
		assertEquals(d.getVendedorVisitante(), v1.getVendedorVisitante());
		assertEquals(d.getClienteVisitado(), v1.getClienteVisitado());
		assertEquals(d.getProdutoVendido(), v1.getProdutoVendido());
		assertEquals(d.getDataDaVisita(), v1.getDataDaVisita	());
	}

}
