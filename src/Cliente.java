public class Cliente {

    private String nome;
    private String telefone;
    private int idade;
    private String CPF;
    private String sexo;
    private String cidade;
    private String estado;
    private String RG;


    public Cliente(){}

    public Cliente(String nome, String telefone, int idade, String CPF, String sexo, String cidade, String estado, String RG) {
        setNome(nome);
        setTelefone(telefone);
        setCidade(ciadade);
        setCPF(CPF);
        setEstado(estado);
        setIdade(idade);
        setRG(RG);
        setSexo(sexo);
    }s

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
