package br.com.novaroma.workoutguider.apresentacao.cliente;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Principal {

	private static JFrame frame;

	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		initialize();

	}

	private void initialize() {
		
		frame = new JFrame();
		//ImageIcon icon = new ImageIcon("C:\\Users\\uiu\\git\\workg\\WorkoutGuider\\src\\br\\com\\novaroma\\workoutguider\\componentesvisuais\\IconePrograma.png");
		//frame.setIconImage(icon.getImage());
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
