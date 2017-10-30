package Exececao;

public class ExcecaoVendedorCadastrado extends Exception {

    public ExcecaoVendedorCadastrado(){
        super("Vendedor já cadastrado!");
    }
}
