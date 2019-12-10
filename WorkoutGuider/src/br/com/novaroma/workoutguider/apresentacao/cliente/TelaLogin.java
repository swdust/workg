package br.com.novaroma.workoutguider.apresentacao.cliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.apresentacao.treinador.MenuTreinador;
import br.com.novaroma.workoutguider.apresentacao.treinador.TelaCadastroTreinador;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Treinador;
import br.com.novaroma.workoutguider.negocio.UsuarioNegocio;
import br.com.novaroma.workoutguider.utils.UsuarioUtil;

public class TelaLogin extends JPanel {
	private JTextField loginBox;
	private JPasswordField senhaBox;
	public static Treinador t1;
	public static Cliente c1;

	public TelaLogin() {

		setBackground(Color.WHITE);
		setBounds(100, 100, 1280, 720);
		setLayout(null);

		loginBox = new JTextField();
		loginBox.setBounds(587, 282, 167, 34);
		loginBox.setForeground(Color.BLACK);
		loginBox.setColumns(10);
		loginBox.setBackground(SystemColor.inactiveCaption);
		add(loginBox);

		senhaBox = new JPasswordField();
		senhaBox.setBounds(587, 328, 167, 34);
		senhaBox.setBackground(SystemColor.inactiveCaption);
		add(senhaBox);

		JButton CadastroUsuario = new JButton("Aluno");
		CadastroUsuario.setFont(new Font("Verdana", Font.PLAIN, 12));
		CadastroUsuario.setBounds(1075, 20, 90, 28);
		CadastroUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Principal.getFrame().setContentPane(new TelaCadastroCliente());
				Principal.getFrame().getContentPane().revalidate();
			}
		});
		add(CadastroUsuario);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(
				TelaLogin.class.getResource("/br/com/novaroma/workoutguider/componentesvisuais/LogoWG.JPG")));
		lblLogo.setBounds(498, 159, 333, 96);
		add(lblLogo);

		JLabel lblCopyright = new JLabel("All rights reserved to Workout Guider  \u00A9.");
		lblCopyright.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCopyright.setBounds(1038, 698, 252, 16);
		add(lblCopyright);

		JLabel lblMessage = new JLabel("Fa\u00E7a seu cadastro!");
		lblMessage.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMessage.setBounds(947, 26, 120, 16);
		add(lblMessage);

		JLabel lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon(
				TelaLogin.class.getResource("/br/com/novaroma/workoutguider/componentesvisuais/IconeUsuario.png")));
		lblUser.setBounds(537, 282, 38, 34);
		add(lblUser);

		JLabel lblKey = new JLabel("");
		lblKey.setIcon(new ImageIcon(
				TelaLogin.class.getResource("/br/com/novaroma/workoutguider/componentesvisuais/IconeSenha.png")));
		lblKey.setBounds(537, 323, 38, 39);
		add(lblKey);

		JButton CadastroTreinador = new JButton("Treinador");
		CadastroTreinador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal.getFrame().setContentPane(new TelaCadastroTreinador());
				Principal.getFrame().getContentPane().revalidate();
			}
		});
		CadastroTreinador.setFont(new Font("Verdana", Font.PLAIN, 12));
		CadastroTreinador.setBounds(1168, 20, 90, 28);
		add(CadastroTreinador);

		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setSelected(true);
		rdbtnCliente.setBounds(611, 377, 109, 23);
		add(rdbtnCliente);

		JRadioButton rdbtnTreinador = new JRadioButton("Treinador");
		rdbtnTreinador.setBounds(611, 407, 109, 23);
		add(rdbtnTreinador);

		ButtonGroup grupoUsuario = new ButtonGroup();
		grupoUsuario.add(rdbtnCliente);
		grupoUsuario.add(rdbtnTreinador);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEntrar.setBounds(611, 437, 109, 28);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				char[] senha = senhaBox.getPassword();
				String sen = new String(senha);
				UsuarioNegocio verifique = new UsuarioNegocio();
				File arquivoCliente = new File("cliente.txt");
				File arquivoTreinador = new File("treinador.txt");

				if (rdbtnCliente.isSelected()) {
					if (arquivoCliente.exists()) {
						try {
							if (verifique.loginSenha(loginBox.getText(), sen)) {
								c1 = UsuarioUtil.retornaCliente(loginBox.getText());
								MenuCliente menu = new MenuCliente();
								menu.setVisible(true);
								Principal.getFrame().setVisible(false);
							} else
								JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
						} catch (HeadlessException e) {
							e.printStackTrace();
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Nenhum cliente criado, faça seu cadastro!");
					}
				} else if (rdbtnTreinador.isSelected()) {

					if (arquivoTreinador.exists()) {
						try {
							if (verifique.loginSenhaT(loginBox.getText(), sen)) {
								t1 = UsuarioUtil.retornaTreinador(loginBox.getText());
								MenuTreinador menu = new MenuTreinador();
								menu.setVisible(true);
								Principal.getFrame().setVisible(false);
							} else {
								JOptionPane.showMessageDialog(null, "Treinador não encontrado!");
							}
						} catch (HeadlessException e) {
							e.printStackTrace();
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Nenhum treinador cadastrado, faça seu cadastro!");
					}
				}
			}
		});
		add(btnEntrar);
	}
}
