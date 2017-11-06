package Main;


import Exececao.ExcecaoClienteCadastrado;
import Exececao.ExcecaoProdutoCadastrado;
import Exececao.ExcecaoVendedorCadastrado;
import GUI.FrameCliente;
import Implementacao.Cliente;
import Implementacao.Empresa;
import Implementacao.Produto;
import Implementacao.Vendedor;

import javax.swing.JOptionPane;


public class Aplicacao {

    public static void main(String[] args) {

        Empresa pp = new Empresa("PiedPiper", "36.482.265/0001-10");

        try{

            pp.cadastrarVendedor(new Vendedor("Pedro", "Henrique", "(31)97361-7174",
                    "29.870.405-5", "924.892.200-71", "Masculino"));
            pp.cadastrarVendedor(new Vendedor("Maria", "Augusta", "(31) 99612-4881",
                    "35.976.974-3", "246.969.996-70", "Feminino"));
            pp.cadastrarVendedor(new Vendedor("Hugo", "Bastos", "(32) 99751-6186",
                    "50.497.713-1", "767.173.006-80", "Masculino"));
            pp.cadastrarVendedor(new Vendedor("Tadeu", "Reis", "(34) 98233-9873",
                    "22.100.090-2", "638.555.836-33", "Masculino"));
            pp.cadastrarVendedor(new Vendedor("Lucas", "Saldanha", "(31)97361-7174",
                    "29.870.405-5", "924.892.200-71", "Masculino"));

            pp.cadastrarCliente(new Cliente("Rafael", "(31)97362-8463", 18, "063.756.140-66",
                    "Masculino", "Badaró"));
            pp.cadastrarCliente(new Cliente("Gustavo", "(31)97362-8463", 20, "063.756.140-66",
                    "Masculino", "Henrique"));
            pp.cadastrarCliente(new Cliente("Bruno", "(31)97362-8463", 19, "063.756.140-66",
                    "Masculino", "Lafite"));
            pp.cadastrarCliente(new Cliente("André", "(31)97362-8463", 54, "063.756.140-66",
                    "Masculino", "Maurício"));

            pp.cadastrarProduto(new Produto("Camiseta", 45.99, 100));
            pp.cadastrarProduto(new Produto("Perfume", 89.99, 200));
            pp.cadastrarProduto(new Produto("Maquiagem", 39.99, 300));


//        pp.mostrarClientes();
//        pp.mostrarProdutos();
//        pp.mostrarVendedores();



            FrameCliente apg = new FrameCliente(pp);
            apg.setLocationRelativeTo(null);
            apg.setVisible(true);

        }catch (ExcecaoVendedorCadastrado e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error: Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }catch (ExcecaoClienteCadastrado e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error: Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }catch (ExcecaoProdutoCadastrado e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error: Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }

}
