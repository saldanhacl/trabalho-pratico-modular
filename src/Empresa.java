import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeDaEmpresa;
    private String cnhDaEmpresa;
    private List<Vendedor> vendedoresCadastrados = new ArrayList<>();
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private List<Cliente> clientesCadastrados = new ArrayList<>();

    public Empresa(String nomeDaEmpresa, String cnhDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnhDaEmpresa = cnhDaEmpresa;
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
