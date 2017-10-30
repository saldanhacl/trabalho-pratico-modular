package Exececao;

public class ExcecaoClienteCadastrado extends Exception{
    public ExcecaoClienteCadastrado(){
        super("Cliente já cadastrado!");
    }
}
