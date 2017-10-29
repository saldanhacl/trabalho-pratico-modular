
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FrameCliente extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton butOK;
	private JTextField campo;
	private JLabel texto;
	private JTextField campo2;
	private JLabel texto2;

	public FrameCliente() {
		super("Agendamento");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = this.getContentPane();
		
		cPane.setLayout(new FlowLayout());
		
		texto = new JLabel("Vendedor: ");
		campo = new JTextField(15);
		butOK = new JButton("OK");
		
		texto2 = new JLabel("Data: ");
		campo2 = new JTextField(15);
		
		cPane.add(texto);
		cPane.add(campo);	
		cPane.add(texto2);
		cPane.add(campo2);
		cPane.add(butOK);
		butOK.addActionListener(new ButOkEvent());
		this.pack();
		
	}
	class ButOkEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {			
	    	   JOptionPane.showMessageDialog(null, "Vendedor: " + campo.getText() + "\n" + "Data: " + campo2.getText() , "Agendamento", JOptionPane.PLAIN_MESSAGE);
	}
  }
}

