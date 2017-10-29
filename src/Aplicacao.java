public class Aplicacao {

    public static void main(String[] args) {

        Empresa pp = new Empresa("PiedPiper", "36.482.265/0001-10");

        pp.cadastrarVendedor(new Vendedor("Pedro", "Henrique", "(31)97361-7174",
                                        "29.870.405-5", "924.892.200-71", "Masculino"));
        pp.cadastrarCliente(new Cliente("Rafael", "(31)97362-8463", 18, "063.756.140-66",
                                        "Masculino", "Badaró"));
        pp.cadastrarProduto(new Produto("Leite", 2.0, 100));

        pp.mostrarClientes();
        pp.mostrarProdutos();
        pp.mostrarVendedores();

        pp.agendarVisita();

    }

}
