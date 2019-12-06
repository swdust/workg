package br.com.novaroma.workoutguider.apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;

public class Main {

	private static JFrame frame;

	public static void main(String[] args) {

		setIcon();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void setIcon() {

	}

	public Main() {

		initialize();

	}

	// Main.getFrame().setContentPane(new TelaLogin());
	// Main.getFrame().getContentPane().revalidate();

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Workout Guider");
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaLogin telaLogin = new TelaLogin();
		frame.setContentPane(telaLogin);
		telaLogin.setLayout(null);
	}

	public static JFrame getFrame() {
		return frame;
	}
}
