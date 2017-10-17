package br.danieleaula;

import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args) {

		String usuarioBd = "DaniRengel";
		String senhaBd = "senha123";
		boolean senhaCorreta = false;

		int i = 0;

		while (i < 3 && !senhaCorreta) {

			String usuario = JOptionPane.showInputDialog("Usuário ");
			String senha = JOptionPane.showInputDialog("Senha ");

			if (!usuarioBd.equals(usuario) && !senhaBd.equals(senha)) {
				i++;
				JOptionPane.showMessageDialog(null, "Senha Incorreta. " + i);
				
			} else {
				senhaCorreta = true;
			}

		}
		if (senhaCorreta) {
			JOptionPane.showMessageDialog(null, "Senha correta. Usuário logado ");
		} else {
			JOptionPane.showMessageDialog(null, "Senha Incorreta. Conta bloqueada  " + i);

		}
	}

}
