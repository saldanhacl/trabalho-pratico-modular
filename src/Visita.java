public class Visita {

    private Vendedor vendedorVisitante;
    private Cliente clienteVisitado;
    private Produto produtoVendido;
    private String dataDaVisita;

    public Visita(Vendedor vendedorVisitante, Cliente clienteVisitado, Produto produtoVendido,String dataDaVisita) {
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

    public String getDataDaVisita() {
        return dataDaVisita;
    }

    public void setDataDaVisita(String dataDaVisita) {
        this.dataDaVisita = dataDaVisita;
    }
}
