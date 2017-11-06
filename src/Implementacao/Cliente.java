package Implementacao;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String telefone;
    private int idade;
    private String CPF;
    private String sexo;

    public Cliente(String nome, String telefone, int idade, String CPF, String sexo, String sobrenome) {
        setNome(nome);
        setTelefone(telefone);
        setCPF(CPF);
        setIdade(idade);
        setSexo(sexo);
        setSobrenome(sobrenome);
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
