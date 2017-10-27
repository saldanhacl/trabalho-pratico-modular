public class Vendedor {
    private String nome;
    private String telefone;
    private String cidade;
    private String RG;
    private String CPF;
    private String sexo;
    private Agenda agenda;

    public Vendedor(){}

    public Vendedor(String nome, String telefone, String cidade, String RG, String CPF, String sexo) {
        setCidade(cidade);
        setCPF(CPF);
        setNome(nome);
        setRG(RG);
        setSexo(sexo);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}

