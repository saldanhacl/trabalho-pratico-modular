package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Exececao.ExcecaoClienteCadastrado;
import Exececao.ExcecaoProdutoCadastrado;
import Exececao.ExcecaoVendedorCadastrado;
import Implementacao.Cliente;
import Implementacao.Empresa;
import Implementacao.Produto;
import Implementacao.Vendedor;

public class EmpresaTest {

	Empresa software = new Empresa("PBRL", "120.3254.201-0001.96");
	Vendedor a = new Vendedor("Pedro", "Henrique", "(31)97361-7174",
            "29.870.405-5", "924.892.200-71", "Masculino");
	Cliente b = new Cliente("Bruno", "(31)98611-8463", 18, "154.258.698-66",
            "Masculino", "Lafite");
	Produto c = new Produto("Leite", 2.0, 100);
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testEmpresa()
	{
		assertEquals("PBRL", software.getNomeDaEmpresa());
	}

	@Test
    public void testCadastrarVendedor() throws ExcecaoVendedorCadastrado
    {
		software.cadastrarVendedor(a);
		assertEquals("Pedro",a.getNome());
		assertEquals("Henrique",a.getSobrenome());
		assertEquals("(31)97361-7174",a.getTelefone());
		assertEquals("29.870.405-5",a.getRG());
		assertEquals("924.892.200-71",a.getCPF());
		assertEquals("Masculino",a.getSexo());
    }
	
	@Test
	public void testCadastrarCliente() throws ExcecaoClienteCadastrado
	{
		software.cadastrarCliente(b);
		assertEquals("Bruno",b.getNome());
		assertEquals("Lafite",b.getSobrenome());
		assertEquals("(31)98611-8463",b.getTelefone());
		assertEquals(18,b.getIdade());
		assertEquals("154.258.698-66",b.getCPF());
		assertEquals("Masculino",b.getSexo());
	}
	
	@Test
	public void testCadastrarProduto() throws ExcecaoProdutoCadastrado
	{
		software.cadastrarProduto(c);
		assertEquals("Leite",c.getNomeDoProduto());
		assertEquals(2.0,c.getPrecoUnitario(), 0.01);
	}

}
