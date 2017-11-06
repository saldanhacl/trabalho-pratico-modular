package Implementacao;

public class Produto {

    private String nomeDoProduto;
    private double precoUnitario;
    private int quantidadeProduto;

    public Produto(String nomeDoProduto, double precoUnitario, int quantidadeProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return nomeDoProduto;
    }
}
