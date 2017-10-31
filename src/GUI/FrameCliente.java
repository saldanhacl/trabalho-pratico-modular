package GUI;

import Implementacao.*;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FrameCliente extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton butOK;
	private JTextField campo;
	private JLabel vendedor;
	private JLabel cliente;
	private JLabel produto;
	private JLabel data;
	public static final String NL = System.getProperty("line.separator");


	public FrameCliente(Empresa e) {

		super("Agendamento");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = this.getContentPane();

		cPane.setLayout(new FlowLayout());
		
		vendedor = new JLabel("Vendedor: ");
		cPane.add(vendedor);

		JComboBox<Vendedor> vendedores = new JComboBox<>();
		for (Vendedor v : e.getVendedoresCadastrados()) {
			vendedores.addItem(v);
		}
		cPane.add(vendedores);
		

		cliente = new JLabel("Cliente: ");
		cPane.add(cliente);

		JComboBox<Cliente> clientes = new JComboBox<>();
		for (Cliente c : e.getClientesCadastrados()) {
			clientes.addItem(c);
		}
		cPane.add(clientes);
		
		produto = new JLabel("Produto: ");
		cPane.add(produto);
		JComboBox<Produto> produtos = new JComboBox<>();
		for (Produto p: e.getProdutosCadastrados()) {
			produtos.addItem(p);
		}
		cPane.add(produtos);
		

		data = new JLabel("Data: ");
		campo = new JTextField(15);
		butOK = new JButton("Agendar");
		cPane.add(data);
		cPane.add(campo);	
		cPane.add(butOK);
		butOK.addActionListener(new ButOkEvent());
		this.pack();

		Vendedor vendedorVisita = (Vendedor) vendedores.getSelectedItem();
		Cliente clienteVisita = (Cliente) clientes.getSelectedItem();
		Produto produtoVisita = (Produto) produtos.getSelectedItem();

		//Passar a data por 24/04/1999 e criar campo hora e passar como 14:00
		//Neste estilo - Teste:
		e.agendarVisita(vendedorVisita, clienteVisita, produtoVisita, "14/09/1999","14:00");
		
	}


	class ButOkEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {			
	    	   JOptionPane.showMessageDialog(null, "Data: " + campo.getText() , "", JOptionPane.PLAIN_MESSAGE);
	}
  }
}

