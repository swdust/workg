package br.com.novaroma.workoutguider.apresentacao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class TelaDadosCliente extends JPanel {
	private JTextField Nome;
	private JTextField Login;
	private JTextField idade;
	private JTextField Email;
	private JTextField CPF;
	private JTextField Altura;
	private JTextField Peso;
	private JTextField IMC;
	private JTextField Tempo;

	public TelaDadosCliente() {
		setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNome.setBounds(297, 172, 73, 34);
		add(lblNome);

		Nome = new JTextField();
		Nome.setText((String) null);
		Nome.setForeground(Color.DARK_GRAY);
		Nome.setFont(new Font("Verdana", Font.PLAIN, 13));
		Nome.setColumns(10);
		Nome.setBounds(382, 176, 169, 32);
		add(Nome);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLogin.setBounds(297, 234, 73, 34);
		add(lblLogin);

		Login = new JTextField();
		Login.setText((String) null);
		Login.setForeground(Color.DARK_GRAY);
		Login.setFont(new Font("Verdana", Font.PLAIN, 13));
		Login.setColumns(10);
		Login.setBounds(382, 238, 169, 32);
		add(Login);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblIdade.setBounds(297, 294, 73, 34);
		add(lblIdade);

		idade = new JTextField();
		idade.setText((String) null);
		idade.setForeground(Color.DARK_GRAY);
		idade.setFont(new Font("Verdana", Font.PLAIN, 13));
		idade.setColumns(10);
		idade.setBounds(382, 298, 169, 32);
		add(idade);

		JLabel label = new JLabel("Visualizar Dados");
		label.setFont(new Font("Verdana", Font.PLAIN, 32));
		label.setBounds(532, 28, 283, 63);
		add(label);

		Email = new JTextField();
		Email.setText((String) null);
		Email.setForeground(Color.DARK_GRAY);
		Email.setFont(new Font("Verdana", Font.PLAIN, 13));
		Email.setColumns(10);
		Email.setBounds(382, 356, 169, 32);
		add(Email);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblEmail.setBounds(297, 352, 73, 34);
		add(lblEmail);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCpf.setBounds(315, 411, 73, 34);
		add(lblCpf);

		CPF = new JTextField();
		CPF.setText((String) null);
		CPF.setForeground(Color.DARK_GRAY);
		CPF.setFont(new Font("Verdana", Font.PLAIN, 13));
		CPF.setColumns(10);
		CPF.setBounds(382, 415, 169, 32);
		add(CPF);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSexo.setBounds(305, 476, 65, 34);
		add(lblSexo);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblAltura.setBounds(753, 172, 73, 34);
		add(lblAltura);

		Altura = new JTextField();
		Altura.setText((String) null);
		Altura.setForeground(Color.DARK_GRAY);
		Altura.setFont(new Font("Verdana", Font.PLAIN, 13));
		Altura.setColumns(10);
		Altura.setBounds(827, 174, 169, 32);
		add(Altura);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblPeso.setBounds(753, 234, 73, 34);
		add(lblPeso);

		Peso = new JTextField();
		Peso.setText((String) null);
		Peso.setForeground(Color.DARK_GRAY);
		Peso.setFont(new Font("Verdana", Font.PLAIN, 13));
		Peso.setColumns(10);
		Peso.setBounds(827, 238, 169, 32);
		add(Peso);

		JLabel lblImc = new JLabel("IMC:");
		lblImc.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblImc.setBounds(753, 294, 73, 34);
		add(lblImc);

		IMC = new JTextField();
		IMC.setText((String) null);
		IMC.setForeground(Color.DARK_GRAY);
		IMC.setFont(new Font("Verdana", Font.PLAIN, 13));
		IMC.setColumns(10);
		IMC.setBounds(827, 298, 169, 32);
		add(IMC);

		JLabel lblTempoDisponvel = new JLabel("Tempo Dispon\u00EDvel: ");
		lblTempoDisponvel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblTempoDisponvel.setBounds(633, 354, 193, 34);
		add(lblTempoDisponvel);

		Tempo = new JTextField();
		Tempo.setText((String) null);
		Tempo.setForeground(Color.DARK_GRAY);
		Tempo.setFont(new Font("Verdana", Font.PLAIN, 13));
		Tempo.setColumns(10);
		Tempo.setBounds(827, 358, 169, 32);
		add(Tempo);

		JRadioButton Feminino = new JRadioButton("Feminino");
		Feminino.setFont(new Font("Verdana", Font.PLAIN, 13));
		Feminino.setBounds(382, 487, 115, 18);
		add(Feminino);

		JRadioButton Masculino = new JRadioButton("Masculino");
		Masculino.setFont(new Font("Verdana", Font.PLAIN, 13));
		Masculino.setBounds(382, 508, 115, 18);
		add(Masculino);

		JLabel lblDoenas = new JLabel("Doen\u00E7as:");
		lblDoenas.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblDoenas.setBounds(711, 411, 115, 34);
		add(lblDoenas);

		JCheckBox Asma = new JCheckBox("Asma");
		Asma.setFont(new Font("Verdana", Font.PLAIN, 13));
		Asma.setBounds(827, 411, 105, 18);
		add(Asma);

		JCheckBox Cardiopatia = new JCheckBox("Cardiopatia");
		Cardiopatia.setFont(new Font("Verdana", Font.PLAIN, 13));
		Cardiopatia.setBounds(827, 439, 105, 18);
		add(Cardiopatia);

		JCheckBox Diabetes = new JCheckBox("Diabetes");
		Diabetes.setFont(new Font("Verdana", Font.PLAIN, 13));
		Diabetes.setBounds(827, 468, 105, 18);
		add(Diabetes);

		JCheckBox Osteoporose = new JCheckBox("Osteoporose");
		Osteoporose.setFont(new Font("Verdana", Font.PLAIN, 13));
		Osteoporose.setBounds(827, 492, 105, 18);
		add(Osteoporose);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnVoltar.setBounds(1131, 35, 90, 28);
		add(btnVoltar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAlterar.setBounds(633, 592, 90, 28);
		add(btnAlterar);

	}
}
