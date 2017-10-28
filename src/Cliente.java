public class Cliente {

    private String nome;
    private String sobrenome;
    private String telefone;
    private int idade;
    private String CPF;
    private String sexo;

    public Cliente(){}

    public Cliente(String nome, String telefone, int idade, String CPF, String sexo, String sobrenome) {
        setNome(nome);
        setTelefone(telefone);
        setCPF(CPF);
        setIdade(idade);
        setSexo(sexo);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
