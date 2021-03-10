package gourmet.com.br.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialog {

	private JFrame f = null;

	public MessageDialog(JFrame f) {
		this.f = f;
	}

	public void showMessageDialog(String mensagem) {
		JOptionPane.showMessageDialog(f,mensagem , "Alert", JOptionPane.WARNING_MESSAGE);
	}
	
	public  int showConfirmDialog(String mensagem) {
	 return JOptionPane.showConfirmDialog(f, mensagem);  	
	}
	
	public String showInputDialog(String mensagem) {
		return JOptionPane.showInputDialog(f, mensagem); 
	}
}
