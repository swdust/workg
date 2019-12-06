package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.apresentacao.Main;
import br.com.novaroma.workoutguider.apresentacao.TelaLogin;
import br.com.novaroma.workoutguider.negocio.CadastroUsuario;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaCadastroTreinador extends JPanel {
	private JTextField Login;
	private JTextField Nome;
	private JTextField Endereco;
	private JTextField Email;
	private JTextField Idade;
	private JTextField Cpf;
	private JTextField Telefone;
	private JPasswordField Senha;
	private JPasswordField confirmeSenha;

	public TelaCadastroTreinador() {
		setBackground(Color.WHITE);
		setBounds(100, 100, 1280, 720);
		setLayout(null);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLogin.setBounds(173, 207, 190, 28);
		add(lblLogin);

		Login = new JTextField();
		Login.setBounds(173, 234, 190, 28);
		add(Login);
		Login.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNome.setBounds(575, 298, 183, 28);
		add(lblNome);

		Nome = new JTextField();
		Nome.setBounds(575, 324, 190, 28);
		add(Nome);
		Nome.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSenha.setBounds(173, 298, 190, 28);
		add(lblSenha);

		JLabel lblConfirmaSenha = new JLabel("Confirma senha:");
		lblConfirmaSenha.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblConfirmaSenha.setBounds(173, 401, 190, 28);
		add(lblConfirmaSenha);

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblEndereco.setBounds(972, 401, 190, 28);
		add(lblEndereco);

		Endereco = new JTextField();
		Endereco.setBounds(972, 425, 190, 28);
		add(Endereco);
		Endereco.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblEmail.setBounds(575, 207, 190, 28);
		add(lblEmail);

		Email = new JTextField();
		Email.setBounds(575, 234, 190, 28);
		add(Email);
		Email.setColumns(10);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblIdade.setBounds(972, 207, 190, 28);
		add(lblIdade);

		Idade = new JTextField();
		Idade.setBounds(969, 234, 193, 28);
		add(Idade);
		Idade.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCpf.setBounds(575, 401, 190, 28);
		add(lblCpf);

		Cpf = new JTextField();
		Cpf.setBounds(575, 425, 191, 28);
		add(Cpf);
		Cpf.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblTelefone.setBounds(972, 298, 190, 28);
		add(lblTelefone);

		Telefone = new JTextField();
		Telefone.setBounds(972, 324, 190, 28);
		add(Telefone);
		Telefone.setColumns(10);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new TelaLogin());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnVoltar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnVoltar.setBounds(1153, 34, 101, 33);
		add(btnVoltar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cadastrnado o treinador
				char[] sen = Senha.getPassword();
				String senha = new String(sen);

				char[] csen = confirmeSenha.getPassword();
				String confirmeSenha = new String(csen);

				CadastroUsuario cad = new CadastroUsuario(Nome.getText(), Login.getText(), senha, confirmeSenha,
						Idade.getText(), Endereco.getText(), Email.getText(), Telefone.getText(), Cpf.getText());

				JOptionPane.showMessageDialog(null, cad.verificaCadastroT());

			}
		});
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnCadastrar.setBounds(613, 540, 109, 33);
		add(btnCadastrar);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaCadastroTreinador.class
				.getResource("/br/com/novaroma/workoutguider/componentesvisuais/workoutguider mini.JPG")));
		label.setBounds(18, 20, 240, 62);
		add(label);

		JLabel lblCadastroDeTreinador = new JLabel("Cadastro - Treinador ");
		lblCadastroDeTreinador.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblCadastroDeTreinador.setBounds(506, 79, 369, 67);
		add(lblCadastroDeTreinador);

		Senha = new JPasswordField();
		Senha.setBounds(173, 324, 190, 28);
		add(Senha);

		confirmeSenha = new JPasswordField();
		confirmeSenha.setBounds(173, 429, 190, 28);
		add(confirmeSenha);

	}
}
