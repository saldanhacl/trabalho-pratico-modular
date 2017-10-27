public class Produto {

    private String nomeDoProduto;
    private double precoUnitario;
    private int quantidadeProduto;

    public Produto(String nomeDoProduto, double precoUnitario) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoUnitario = precoUnitario;
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
}
