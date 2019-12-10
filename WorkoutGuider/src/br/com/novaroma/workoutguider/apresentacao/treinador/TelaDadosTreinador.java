package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.utils.*;
import br.com.novaroma.workoutguider.apresentacao.cliente.TelaLogin;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Treinador;
import br.com.novaroma.workoutguider.negocio.CadastroUsuario;

import java.awt.Font;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDadosTreinador extends JPanel {
	private JTextField Nome;
	private JTextField Login;
	private JTextField Idade;
	private JTextField Email;
	private JTextField Endereço;
	private JTextField Telefone;
	private JTextField cpf;

	public TelaDadosTreinador() throws ParseException {
		setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNome.setBounds(269, 140, 80, 31);
		add(lblNome);

		Nome = new JTextField();
		Nome.setForeground(Color.DARK_GRAY);
		Nome.setFont(new Font("Verdana", Font.PLAIN, 13));
		Nome.setText(TelaLogin.t1.getNome());
		Nome.setBounds(344, 142, 169, 32);
		add(Nome);
		Nome.setColumns(10);

		JLabel lblVisualizardados = new JLabel("Visualizar Dados");
		lblVisualizardados.setFont(new Font("Verdana", Font.PLAIN, 32));
		lblVisualizardados.setBounds(517, 36, 283, 63);
		add(lblVisualizardados);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLogin.setBounds(269, 232, 80, 31);
		add(lblLogin);

		Login = new JTextField();
		Login.setForeground(Color.DARK_GRAY);
		Login.setFont(new Font("Verdana", Font.PLAIN, 13));
		Login.setText(TelaLogin.t1.getLogin());
		Login.setColumns(10);
		Login.setBounds(344, 234, 169, 32);
		add(Login);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblIdade.setBounds(269, 329, 80, 31);
		add(lblIdade);

		Idade = new JTextField();
		Idade.setForeground(Color.DARK_GRAY);
		Idade.setFont(new Font("Verdana", Font.PLAIN, 13));
		Idade.setText(Integer.toString(TelaLogin.t1.getIdade()));
		Idade.setColumns(10);
		Idade.setBounds(344, 331, 169, 32);
		add(Idade);

		JLabel lblCpf = new JLabel("Email:");
		lblCpf.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCpf.setBounds(271, 433, 63, 31);
		add(lblCpf);

		Email = new JTextField();
		Email.setForeground(Color.DARK_GRAY);
		Email.setFont(new Font("Verdana", Font.PLAIN, 13));
		Email.setText(TelaLogin.t1.getEmail());
		Email.setColumns(10);
		Email.setBounds(344, 435, 169, 32);
		add(Email);

		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblEndereo.setBounds(728, 140, 125, 31);
		add(lblEndereo);

		Endereço = new JTextField();
		Endereço.setForeground(Color.DARK_GRAY);
		Endereço.setFont(new Font("Verdana", Font.PLAIN, 13));
		Endereço.setText(TelaLogin.t1.getEndereco());
		Endereço.setColumns(10);
		Endereço.setBounds(835, 142, 169, 32);
		add(Endereço);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblTelefone.setBounds(731, 232, 94, 31);
		add(lblTelefone);

		Telefone = new JTextField();
		Telefone.setForeground(Color.DARK_GRAY);
		Telefone.setFont(new Font("Verdana", Font.PLAIN, 13));
		Telefone.setText(Celular.formatarCelular(TelaLogin.t1.getTelefone()));
		Telefone.setColumns(10);
		Telefone.setBounds(835, 232, 169, 32);
		add(Telefone);

		JLabel lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCpf_1.setBounds(779, 329, 94, 31);
		add(lblCpf_1);

		cpf = new JTextField();
		cpf.setForeground(Color.DARK_GRAY);
		cpf.setFont(new Font("Verdana", Font.PLAIN, 13));
		cpf.setText(CPF.formatarCPF(TelaLogin.t1.getCpf()));
		cpf.setColumns(10);
		cpf.setBounds(835, 331, 169, 32);
		add(cpf);

	}
}
