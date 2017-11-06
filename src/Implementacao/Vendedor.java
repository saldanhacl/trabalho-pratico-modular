package Implementacao;

public class Vendedor {

    private String nome;
    private String sobrenome;
    private String telefone;
    private String RG;
    private String CPF;
    private String sexo;
    private Agenda agenda;

    public Vendedor(String nome, String sobrenome, String telefone, String RG, String CPF, String sexo) {
        setCPF(CPF);
        setNome(nome);
        setSobrenome(sobrenome);
        setRG(RG);
        setSexo(sexo);
        setTelefone(telefone);
        agenda = new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}

