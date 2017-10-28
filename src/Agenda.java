import java.util.Date;

public class Agenda {

    private Vendedor vendedorVisitante;
    private Cliente clienteVisitado;
    private Produto produtoVendido;
    private Date dataDaVisita;

    public Agenda(Vendedor vendedorVisitante, Cliente clienteVisitado, Produto produtoVendido, Date dataDaVisita) {
        this.vendedorVisitante = vendedorVisitante;
        this.clienteVisitado = clienteVisitado;
        this.produtoVendido = produtoVendido;
        this.dataDaVisita = dataDaVisita;
    }

    public Vendedor getVendedorVisitante() {
        return vendedorVisitante;
    }

    public void setVendedorVisitante(Vendedor vendedorVisitante) {
        this.vendedorVisitante = vendedorVisitante;
    }

    public Cliente getClienteVisitado() {
        return clienteVisitado;
    }

    public void setClienteVisitado(Cliente clienteVisitado) {
        this.clienteVisitado = clienteVisitado;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Date getDataDaVisita() {
        return dataDaVisita;
    }

    public void setDataDaVisita(Date dataDaVisita) {
        this.dataDaVisita = dataDaVisita;
    }
}
