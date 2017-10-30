package Exececao;

public class ExcecaoProdutoCadastrado extends Exception {
    public ExcecaoProdutoCadastrado(){
        super("Produto já cadastrado!");
    }
}
