package br.com.novaroma.workoutguider.apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.negocio.CadastroUsuario;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaCadastroCliente extends JPanel {
	private JTextField Nome;
	private JTextField Login;
	private JTextField Endereco;
	private JTextField Email;
	private JTextField CPF;
	private JTextField Tempo;
	private JTextField Idade;
	private JTextField Peso;
	private JTextField Altura;
	private JTextField Telefone;
	private JPasswordField senhaBox;
	private JPasswordField confirmeSenhaBox;

	public TelaCadastroCliente() {
		setBackground(Color.WHITE);
		setBounds(100, 100, 1280, 720);
		setLayout(null);

		JLabel lblWorkoutGuider = new JLabel("Cadastro - Aluno");
		lblWorkoutGuider.setBounds(563, 47, 359, 50);
		lblWorkoutGuider.setFont(new Font("Verdana", Font.PLAIN, 30));
		add(lblWorkoutGuider);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(34, 25, 215, 50);
		lblLogo.setIcon(new ImageIcon(TelaCadastroCliente.class
				.getResource("/br/com/novaroma/workoutguider/componentesvisuais/workoutguider mini.JPG")));
		add(lblLogo);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(95, 149, 190, 22);
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblNome);

		Nome = new JTextField();
		Nome.setBounds(95, 170, 190, 28);
		add(Nome);
		Nome.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(1050, 152, 188, 16);
		lblSexo.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblSexo);

		JRadioButton Feminino = new JRadioButton("Feminino");
		Feminino.setBounds(1050, 180, 115, 18);
		Feminino.setFont(new Font("Verdana", Font.PLAIN, 14));
		add(Feminino);

		JRadioButton Masculino = new JRadioButton("Masculino");
		Masculino.setSelected(true);
		Masculino.setBounds(1050, 210, 115, 18);
		Masculino.setFont(new Font("Verdana", Font.PLAIN, 14));
		add(Masculino);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(95, 238, 183, 22);
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblLogin);

		Login = new JTextField();
		Login.setBounds(95, 257, 185, 28);
		add(Login);
		Login.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(95, 324, 184, 18);
		lblSenha.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblSenha);

		senhaBox = new JPasswordField();
		senhaBox.setBounds(95, 344, 185, 28);
		add(senhaBox);

		JLabel lblConfirmeASenha = new JLabel("Confirme sua senha:");
		lblConfirmeASenha.setBounds(95, 405, 190, 22);
		lblConfirmeASenha.setFont(new Font("Verdana", Font.PLAIN, 17));
		add(lblConfirmeASenha);

		confirmeSenhaBox = new JPasswordField();
		confirmeSenhaBox.setBounds(95, 426, 183, 28);
		add(confirmeSenhaBox);

		JLabel lblEndereoResidencial = new JLabel("Endere\u00E7o:");
		lblEndereoResidencial.setBounds(575, 149, 200, 22);
		lblEndereoResidencial.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblEndereoResidencial);

		Endereco = new JTextField();
		Endereco.setBounds(575, 170, 190, 28);
		add(Endereco);
		Endereco.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(95, 493, 190, 16);
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblEmail);

		Email = new JTextField();
		Email.setText("xxxxx@xxx.com");
		Email.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Email.setText("");
			}
		});
		Email.setBounds(95, 512, 190, 28);
		add(Email);
		Email.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(95, 576, 190, 16);
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblCpf);

		CPF = new JTextField();
		CPF.setText("xxx.xxx.xxx-xx");
		CPF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				CPF.setText("");
			}
		});
		CPF.setBounds(95, 595, 190, 28);
		add(CPF);
		CPF.setColumns(10);

		JLabel lblTempoDisponvel = new JLabel("Tempo Dispon\u00EDvel:");
		lblTempoDisponvel.setBounds(575, 404, 190, 22);
		lblTempoDisponvel.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblTempoDisponvel);

		Tempo = new JTextField();
		Tempo.setToolTipText("xxx.xxx.xxx-xx");
		Tempo.setBounds(575, 426, 190, 28);
		add(Tempo);
		Tempo.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Idade:");
		lblDataDeNascimento.setBounds(575, 241, 190, 16);
		lblDataDeNascimento.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblDataDeNascimento);

		Idade = new JTextField();
		Idade.setBounds(577, 257, 188, 28);
		add(Idade);
		Idade.setColumns(10);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(575, 481, 90, 28);
		lblPeso.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblPeso);

		Peso = new JTextField();
		Peso.setText("Quilos");
		Peso.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Peso.setText("");
			}
		});
		Peso.setBounds(575, 512, 190, 28);
		add(Peso);
		Peso.setColumns(10);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(575, 573, 183, 22);
		lblAltura.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblAltura);

		Altura = new JTextField();
		Altura.setText("Centímetros");
		Altura.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Altura.setText("");
			}
		});
		Altura.setBounds(575, 595, 190, 28);
		add(Altura);
		Altura.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(575, 325, 170, 16);
		lblTelefone.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblTelefone);

		Telefone = new JTextField();
		Telefone.setText("XXXXXXXXX");
		Telefone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Telefone.setText("");
			}
		});
		Telefone.setBounds(575, 344, 190, 28);
		add(Telefone);
		Telefone.setColumns(10);

		JLabel lblDoenas = new JLabel("Doen\u00E7as:");
		lblDoenas.setBounds(1050, 325, 105, 16);
		lblDoenas.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(lblDoenas);

		JCheckBox Asma = new JCheckBox("Asma");
		Asma.setFont(new Font("Verdana", Font.PLAIN, 12));
		Asma.setBounds(1050, 349, 105, 18);
		add(Asma);

		JCheckBox Cardiopatia = new JCheckBox("Cardiopatia");
		Cardiopatia.setFont(new Font("Verdana", Font.PLAIN, 12));
		Cardiopatia.setBounds(1050, 379, 105, 18);
		add(Cardiopatia);

		JCheckBox Diabetes = new JCheckBox("Diabetes");
		Diabetes.setFont(new Font("Verdana", Font.PLAIN, 12));
		Diabetes.setBounds(1050, 409, 105, 18);
		add(Diabetes);

		JCheckBox Osteoporose = new JCheckBox("Osteoporose");
		Osteoporose.setFont(new Font("Verdana", Font.PLAIN, 12));
		Osteoporose.setBounds(1050, 439, 105, 18);
		add(Osteoporose);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				char[] sen = senhaBox.getPassword();
				String senha = new String(sen);

				char[] csen = confirmeSenhaBox.getPassword();
				String confirmeSenha = new String(csen);

				boolean[] doencas = new boolean[4];
				if (Asma.isSelected()) {
					doencas[0] = true;
				} else {
					doencas[0] = false;
				}
				if (Cardiopatia.isSelected()) {
					doencas[1] = true;
				} else {
					doencas[1] = false;
				}
				if (Diabetes.isSelected()) {
					doencas[2] = true;
				} else {
					doencas[2] = false;
				}
				if (Osteoporose.isSelected()) {
					doencas[3] = true;
				} else {
					doencas[3] = false;
				}

				CadastroUsuario cad1 = new CadastroUsuario(Nome.getText(), Login.getText(), senha, confirmeSenha,
						Idade.getText(), Endereco.getText(), Email.getText(), Telefone.getText(), CPF.getText(),
						Double.parseDouble(Altura.getText()), Double.parseDouble(Peso.getText()),
						Integer.parseInt(Tempo.getText()), doencas);
				JOptionPane.showMessageDialog(null, cad1.verificaCadastro());
			}
		});

		btnCadastrar.setBounds(608, 643, 115, 34);
		add(btnCadastrar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.getFrame().setContentPane(new TelaLogin());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnVoltar.setBounds(1166, 47, 90, 28);
		add(btnVoltar);

		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(Masculino);
		grupoSexo.add(Feminino);

	}

}
