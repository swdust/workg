package br.com.novaroma.workoutguider.apresentacao.treinador;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RemoverTreinador extends JPanel {
	private JTextField Login;
	private JTextField Senha;

	/**
	 * Create the panel.
	 */
	public RemoverTreinador() {
		setLayout(null);

		JLabel lblDeleoDeConta = new JLabel("Dele\u00E7\u00E3o de Conta!");
		lblDeleoDeConta.setFont(new Font("Verdana", Font.PLAIN, 32));
		lblDeleoDeConta.setForeground(Color.RED);
		lblDeleoDeConta.setBounds(506, 32, 320, 44);
		add(lblDeleoDeConta);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLogin.setBounds(513, 154, 86, 34);
		add(lblLogin);

		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSenha.setBounds(506, 218, 79, 33);
		add(lblSenha);

		Login = new JTextField();
		Login.setBounds(589, 157, 149, 34);
		add(Login);
		Login.setColumns(10);

		Senha = new JTextField();
		Senha.setColumns(10);
		Senha.setBounds(589, 220, 149, 34);
		add(Senha);

		JLabel lblEstouCienteDe = new JLabel("Estou ciente de que a a\u00E7\u00E3o n\u00E3o poder\u00E1 ser desfeita:");
		lblEstouCienteDe.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblEstouCienteDe.setBounds(475, 301, 367, 18);
		add(lblEstouCienteDe);

		JCheckBox Sim = new JCheckBox("Sim, desejo apagar minha conta!");
		Sim.setFont(new Font("Verdana", Font.PLAIN, 12));
		Sim.setBounds(548, 331, 233, 18);
		add(Sim);

		JButton btnApagar = new JButton("Apagar");
		btnApagar.setForeground(Color.RED);
		btnApagar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnApagar.setBounds(621, 371, 90, 34);
		add(btnApagar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnVoltar.setBounds(1020, 32, 90, 34);
		add(btnVoltar);

	}
}
