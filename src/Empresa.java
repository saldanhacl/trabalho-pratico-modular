import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    Scanner in = new Scanner(System.in);
    private String nomeDaEmpresa;
    private String cnhDaEmpresa;
    private List<Vendedor> vendedoresCadastrados = new ArrayList<>();
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private List<Cliente> clientesCadastrados = new ArrayList<>();
    private List<Agenda> listaDeVisitas = new ArrayList<>();

    public Empresa(String nomeDaEmpresa, String cnhDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnhDaEmpresa = cnhDaEmpresa;
    }

    public void mostrarVendedores(){
        System.out.println("------- VENDEDORES --------\n");
        for (Vendedor v : vendedoresCadastrados) {
            System.out.println("ID #" + vendedoresCadastrados.indexOf(v));
            System.out.println("Nome: " + v.getNome() + " "  +  v.getSobrenome());
            System.out.println("CPF: " + v.getCPF());
            System.out.println("RG: " + v.getRG());
            System.out.println("Sexo: " + v.getSexo());
            System.out.println("Telefone:" +  v.getTelefone());
        }
    }

    public void mostrarClientes(){
        System.out.println("------- CLIENTES --------\n");
        for (Cliente c : clientesCadastrados) {
            System.out.println("ID #" + clientesCadastrados.indexOf(c));
            System.out.println("Nome: " + c.getNome() + " "  +  c.getSobrenome());
            System.out.println("CPF: " + c.getCPF());
            System.out.println("Sexo: " + c.getSexo());
            System.out.println("Telefone:" +  c.getTelefone());
        }
    }

    public void mostrarProtudos(){
        System.out.println("------- PRODUTOS --------\n");
        for (Produto p : produtosCadastrados) {
            System.out.println("ID #" + produtosCadastrados.indexOf(p));
            System.out.println("Produto: " + p.getNomeDoProduto());
            System.out.println("Preço: " + p.getPrecoUnitario());
            System.out.println("Quantidade: " + p.getQuantidadeProduto());
        }
    }

    public void visitasAgendadas() {
        System.out.println("------- VISITAS --------\n");
        for (Agenda a : listaDeVisitas) {
            System.out.println("ID #" + listaDeVisitas.indexOf(a));
            System.out.println("Data da visita: " + a.getDataDaVisita());
            System.out.println("Vendedor: " + a.getVendedorVisitante());
            System.out.println("Cliente: " + a.getClienteVisitado());
            System.out.println("Produto: " + a.getProdutoVendido());
        }
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getCnhDaEmpresa() {
        return cnhDaEmpresa;
    }

    public void setCnhDaEmpresa(String cnhDaEmpresa) {
        this.cnhDaEmpresa = cnhDaEmpresa;
    }

    public List<Vendedor> getVendedoresCadastrados() {
        return vendedoresCadastrados;
    }

    public void setVendedoresCadastrados(List<Vendedor> vendedoresCadastrados) {
        this.vendedoresCadastrados = vendedoresCadastrados;
    }

    public List<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public void setProdutosCadastrados(List<Produto> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

    public void setClientesCadastrados(List<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }
}
