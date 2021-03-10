package gourmet.com.br;

import javax.swing.JFrame;

import gourmet.com.br.view.MessageDialog;
import gourmet.com.br.view.implement.Logica;

public class GourmetApp {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		MessageDialog md = new MessageDialog(f);
		Logica l = new Logica(f, md);
		l.adivinharPrato();
		
	}

	


}
