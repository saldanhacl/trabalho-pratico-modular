package Implementacao;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Visita> visitas = new ArrayList<>();

    public void visitasAgendadas() {
        System.out.println("------- VISITAS --------\n");
        for (Visita v : visitas) {
            System.out.println("ID #" + visitas.indexOf(v));
            System.out.println("Data da visita: " + v.getDataDaVisita());
            System.out.println("Implementacao.Vendedor: " + v.getVendedorVisitante());
            System.out.println("Implementacao.Cliente: " + v.getClienteVisitado());
            System.out.println("Implementacao.Produto: " + v.getProdutoVendido());
        }
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visita> visitas) {
        this.visitas = visitas;
    }
}