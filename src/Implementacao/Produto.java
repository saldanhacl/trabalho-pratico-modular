package Implementacao;

public class Produto {

    private String nomeDoProduto;
    private double precoUnitario;
    private int quantidadeProduto;

    public Produto() {
    }

    public Produto(String nomeDoProduto, double precoUnitario, int quantidadeProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return nomeDoProduto;
    }
}
