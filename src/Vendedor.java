public class Vendedor {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String RG;
    private String CPF;
    private String sexo;

    public Vendedor(){}

    public Vendedor(String nome, String sobrenome, String telefone, String RG, String CPF, String sexo) {
        setCPF(CPF);
        setNome(nome);
        setSobrenome(sobrenome);
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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


}

