package br.com.novaroma.workoutguider.apresentacao.cliente;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;
import br.com.novaroma.workoutguider.utils.UsuarioUtil;

public class MenuCliente extends JFrame {

	private JPanel contentPane;
	JLayeredPane layeredPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCliente frame = new MenuCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */

	public MenuCliente() throws ClassNotFoundException, IOException {
		ImageIcon icon = new ImageIcon(new ImageIcon(Principal.class
				.getResource("/br/com/novaroma/workoutguider/componentesvisuais/IconePrograma.png")).getImage());
		setIconImage(icon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1274, 670);
		layeredPane.add(new TelaVisualizarTreino());
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnDados = new JMenu("Cliente");
		menuBar.add(mnDados);

		JMenuItem mntmAtualizarCadastro = new JMenuItem("Atualizar cadastro");
		mntmAtualizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlterarCadastroCliente altera = new AlterarCadastroCliente();
				altera.setBounds(0, 0, 1274, 670);
				layeredPane.removeAll();
				layeredPane.add(altera);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnDados.add(mntmAtualizarCadastro);

		JMenuItem mntmExcluirConta = new JMenuItem("Excluir conta");
		mntmExcluirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Confirmação",
						JOptionPane.YES_NO_OPTION);

				if (resposta == JOptionPane.YES_OPTION) {
					ArquivoGeral arq = new ArquivoGeral(new Cliente());
					try {
						arq.remover(UsuarioUtil.retornaIndexCliente(TelaLogin.c1.getLogin()));
						Principal.getFrame().setVisible(true);
						dispose();

					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		mnDados.add(mntmExcluirConta);

		JSeparator separator = new JSeparator();
		mnDados.add(separator);

		JMenuItem mntmVoltar = new JMenuItem("Sair");
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal.getFrame().setVisible(true);
				dispose();
			}
		});
		mnDados.add(mntmVoltar);

		JMenu mnTreino = new JMenu("Treino");
		menuBar.add(mnTreino);

		JMenuItem mntmVisualizarTreino = new JMenuItem("Visualizar Treino");
		mntmVisualizarTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaVisualizarTreino visuTreino;
				try {
					visuTreino = new TelaVisualizarTreino();
					visuTreino.setBounds(0, 0, 1274, 670);
					layeredPane.removeAll();
					layeredPane.add(visuTreino);
					layeredPane.repaint();
					layeredPane.revalidate();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		mnTreino.add(mntmVisualizarTreino);

		JMenuItem mntmAtualizarProgresso = new JMenuItem("Progresso");
		mntmAtualizarProgresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Progresso progresso;
				try {
					progresso = new Progresso();
					progresso.setBounds(0, 0, 1274, 670);
					layeredPane.removeAll();
					layeredPane.add(progresso);
					layeredPane.repaint();
					layeredPane.revalidate();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		mnTreino.add(mntmAtualizarProgresso);
	}
}
