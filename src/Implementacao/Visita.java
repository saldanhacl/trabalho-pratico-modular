package Implementacao;

import java.util.GregorianCalendar;

public class Visita {

    private Vendedor vendedorVisitante;
    private Cliente clienteVisitado;
    private Produto produtoVendido;
    private GregorianCalendar dataDaVisita;

    public Visita(Vendedor vendedorVisitante, Cliente clienteVisitado, Produto produtoVendido,String data,String hora) {
        this.vendedorVisitante = vendedorVisitante;
        this.clienteVisitado = clienteVisitado;
        this.produtoVendido = produtoVendido;
        this.addData(data,hora);
    }

    public GregorianCalendar getDataDaVisita() {
        return dataDaVisita;
    }

    public void setDataDaVisita(GregorianCalendar dataDaVisita) {
        this.dataDaVisita = dataDaVisita;
    }

    public boolean addData(String data, String hora){
        boolean add = false;
        GregorianCalendar dataADD = new GregorianCalendar();

        String[] parteData = data.split("/");
        int dia = Integer.parseInt(parteData[0]);
        int mes = Integer.parseInt(parteData[1]);
        int ano = Integer.parseInt(parteData[2]);

        String[] parteHora = hora.split(":");
        int hr = Integer.parseInt(parteHora[0]);
        int min = Integer.parseInt(parteHora[1]);

        dataADD.set(ano,mes,dia,hr,min);
        setDataDaVisita(dataADD);

        if(getDataDaVisita().equals(dataADD))
            add = true;

        return add;
   }
}
