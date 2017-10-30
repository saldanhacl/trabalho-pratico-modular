
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


	public FrameCliente() {
		super("Agendamento");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = this.getContentPane();
		
		cPane.setLayout(new FlowLayout());
		
		vendedor = new JLabel("Vendedor: ");
		cPane.add(vendedor);
		cPane.add(new JComboBox<String>(new String[] { "Nenhuma opcao selecionada", " opcao 1" }));
		System.out.println();
		

		cliente = new JLabel("Cliente: ");
		cPane.add(cliente);
		cPane.add(new JComboBox<String>(new String[] { "Nenhuma opcao selecionada", " opcao 1" }));
		System.out.println();
		
		produto = new JLabel("Produto: ");
		cPane.add(produto);
		cPane.add(new JComboBox<String>(new String[] { "Nenhuma opcao selecionada", " opcao 1" }));
		System.out.println();
		

		data = new JLabel("Data: ");
		campo = new JTextField(15);	
		butOK = new JButton("Agendar");
		cPane.add(data);
		cPane.add(campo);	
		cPane.add(butOK);
		butOK.addActionListener(new ButOkEvent());
		this.pack();
		
	}
	class ButOkEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {			
	    	   JOptionPane.showMessageDialog(null, "Data: " + campo.getText() , "", JOptionPane.PLAIN_MESSAGE);
	}
  }
}

