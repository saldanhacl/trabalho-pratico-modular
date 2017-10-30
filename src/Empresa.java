import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    Scanner in = new Scanner(System.in);
    private String nomeDaEmpresa;
    private String cnpjDaEmpresa;
    private List<Vendedor> vendedoresCadastrados = new ArrayList<>();
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private List<Cliente> clientesCadastrados = new ArrayList<>();

    public Empresa(){
    }

    public Empresa(String nomeDaEmpresa, String cnpjDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnpjDaEmpresa = cnpjDaEmpresa;
    }

    public void agendarVisita(Vendedor v, Cliente c, Produto p, String data){
        Visita visita = new Visita(v,c,p,data);
        v.getAgenda().getVisitas().add(visita);
    }

    public void agendarVisita(){
        System.out.println("\n------- AGENDAMENTO DE VISITAS --------\n");
        System.out.print("Digite o ID do vendedor: ");
        int vendedorID = in.nextInt();
        System.out.print("Digite o ID do cliente: ");
        int clienteID = in.nextInt();
        System.out.print("Digite o ID do produto: ");
        int produtoID = in.nextInt();
        System.out.println("Digite a data da visita (dd/mm/aaa): ");
        String dataVisita = in.next();
        System.out.println("Digite a hora da visita (hh:mm): ");
        String horaVisita = in.next();
        Visita v = new Visita(vendedoresCadastrados.get(vendedorID),clientesCadastrados.get(clienteID),
                            produtosCadastrados.get(produtoID),dataVisita + " " + horaVisita);
        vendedoresCadastrados.get(vendedorID).getAgenda().getVisitas().add(v);
        System.out.println("\nVisita maracada com sucesso!\n");

    }

    public void cadastrarVendedor(Vendedor v){
        if (!vendedoresCadastrados.contains(v)){
            vendedoresCadastrados.add(v);
            System.out.println("Vendedor " + v + " cadastrado com sucesso!");
        } else System.out.println("Vendedor já cadastrado");
    }

    public void cadastrarCliente(Cliente c){
        if (!clientesCadastrados.contains(c)){
            clientesCadastrados.add(c);
            System.out.println("Cliente " + c + " cadastrado com sucesso!");
        } else System.out.println("Cliente já cadastrado");
    }

    public void cadastrarProduto(Produto p){
        if (!produtosCadastrados.contains(p)){
            produtosCadastrados.add(p);
            System.out.println("Produto " + p + " cadastrado com sucesso!");
        } else System.out.println("Produto já cadastrado");
    }

    public void mostrarVendedores(){
        System.out.println("\n------- VENDEDORES --------\n");
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
        System.out.println("\n------- CLIENTES --------\n");
        for (Cliente c : clientesCadastrados) {
            System.out.println("ID #" + clientesCadastrados.indexOf(c));
            System.out.println("Nome: " + c.getNome() + " "  +  c.getSobrenome());
            System.out.println("CPF: " + c.getCPF());
            System.out.println("Sexo: " + c.getSexo());
            System.out.println("Telefone:" +  c.getTelefone());
        }
    }

    public void mostrarProdutos(){
        System.out.println("\n------- PRODUTOS --------\n");
        for (Produto p : produtosCadastrados) {
            System.out.println("ID #" + produtosCadastrados.indexOf(p));
            System.out.println("Produto: " + p.getNomeDoProduto());
            System.out.println("Preço: " + p.getPrecoUnitario());
            System.out.println("Quantidade: " + p.getQuantidadeProduto());
        }
    }


    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getCnhDaEmpresa() {
        return cnpjDaEmpresa;
    }

    public void setCnhDaEmpresa(String cnhDaEmpresa) {
        this.cnpjDaEmpresa = cnhDaEmpresa;
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
