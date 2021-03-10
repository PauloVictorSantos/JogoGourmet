package gourmet.com.br;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gourmet.com.br.view.MessageDialog;

public class GourmetApp {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		MessageDialog md = new MessageDialog(f);
		ArrayList<String> prato = new ArrayList<String>();
		prato.add("Lasanha");
		prato.add("Bolo de chocolate");
		prato.add("Camar�o internacional");
		ArrayList<String> cartPrato = new ArrayList<String>();
		cartPrato.add(" massa");
		cartPrato.add("Doce");
		cartPrato.add("Salgado");
		int i = 1;
		while (i == 1) {
			int num = (int) (Math.random() * 1 + 1);
			md.showMessageDialog("Pense em um prato que gosta !");
			int b = 0;
			boolean acertou = false;
			while (b < cartPrato.size()) {
				if (md.showConfirmDialog(
						"O prato que voc� pensou � " + cartPrato.get(b) + "?") == JOptionPane.YES_OPTION) {
					if (md.showConfirmDialog(
							"O prato que voc� pensou � " + prato.get(b) + "?") == JOptionPane.YES_OPTION) {
						md.showMessageDialog("Acertei de novo!");
						acertou = true;
						break;
					} else {
						break;
					}
				}

				b++;
			}
			if (!acertou) {
				String nomePrato = md.showInputDialog("Qual prato voc� pensou ?");
				if (nomePrato != null)
					prato.add(nomePrato);
				String caracPrato = md.showInputDialog(nomePrato + " � _________, mas " + prato.get(num) + " n�o");
				if (caracPrato != null)
					cartPrato.add(caracPrato);
			}
		}

	}

}
