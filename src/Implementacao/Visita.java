package Implementacao;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Visita {

    private Vendedor vendedorVisitante;
    private Cliente clienteVisitado;
    private Produto produtoVendido;
    private GregorianCalendar dataDaVisita;

    public Visita() {
    }

    public Visita(Vendedor vendedorVisitante, Cliente clienteVisitado, Produto produtoVendido,String data,String hora) {
        this.vendedorVisitante = vendedorVisitante;
        this.clienteVisitado = clienteVisitado;
        this.produtoVendido = produtoVendido;
        this.addData(data,hora);
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

    public GregorianCalendar getDataDaVisita() {
        return dataDaVisita;
    }

   public void addData(String data, String hora){
        String[] parteData = data.split("/");
        int dia = Integer.parseInt(parteData[0]);
        int mes = Integer.parseInt(parteData[1]);
        int ano = Integer.parseInt(parteData[2]);

        String[] parteHora = hora.split(":");
        int hr = Integer.parseInt(parteHora[0]);
        int min = Integer.parseInt(parteHora[1]);

        this.dataDaVisita.set(ano,mes,dia,hr,min);
   }
}
