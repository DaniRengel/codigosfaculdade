package br.danieleaula;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Exemplo {


	public static void main(String[] args) {
		
		JPasswordField password = new JPasswordField(10);
		password.setEchoChar('*'); 
		// Cria um rótulo para o campo
		JLabel rotulo = new JLabel("Entre com a senha:");
		// Coloca o rótulo e a caixa de entrada numa JPanel:
		JPanel entUsuario = new JPanel();
		entUsuario.add(rotulo);
		entUsuario.add(password);
		// Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:
		JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
		// O programa só prossegue quando o usuário clicar o botao de OK do showMessageDialog. 
		// Aí, é só pegar a senha:
		// Captura a senha:
		String senha = password.getText();
		// mostra a senha no terminal:
		System.out.println("Você digitou: "+senha+"\nFim de execucao.");


	}
	
	@Deprecated 
	
	public void text () {
		
	}

}
