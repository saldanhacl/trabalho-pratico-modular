package Implementacao;

import Exececao.ExcecaoClienteCadastrado;
import Exececao.ExcecaoProdutoCadastrado;
import Exececao.ExcecaoVendedorCadastrado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeDaEmpresa;
    private List<Vendedor> vendedoresCadastrados = new ArrayList<>();
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private List<Cliente> clientesCadastrados = new ArrayList<>();

    public Empresa(String nomeDaEmpresa, String cnpjDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public void agendarVisita(Vendedor v, Cliente c, Produto p,String data,String hora){
        Visita visita = new Visita(v,c,p,data,hora);
        v.getAgenda().getVisitas().add(visita);
    }

    public void cadastrarVendedor(Vendedor v) throws ExcecaoVendedorCadastrado{
        if (!vendedoresCadastrados.contains(v)){
            vendedoresCadastrados.add(v);
            System.out.println("Vendedor " + v + " cadastrado com sucesso!");
        } else throw new ExcecaoVendedorCadastrado();
    }

    public void cadastrarCliente(Cliente c) throws ExcecaoClienteCadastrado{
        if (!clientesCadastrados.contains(c)){
            clientesCadastrados.add(c);
            System.out.println("Cliente " + c + " cadastrado com sucesso!");
        } else throw new ExcecaoClienteCadastrado();
    }

    public void cadastrarProduto(Produto p) throws ExcecaoProdutoCadastrado{
        if (!produtosCadastrados.contains(p)){
            produtosCadastrados.add(p);
            System.out.println("Produto " + p + " cadastrado com sucesso!");
        } else throw new ExcecaoProdutoCadastrado();
    }


    public List<Vendedor> getVendedoresCadastrados() {
        return vendedoresCadastrados;
    }

    public List<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

}
