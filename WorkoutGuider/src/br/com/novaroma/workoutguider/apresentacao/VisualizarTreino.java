package br.com.novaroma.workoutguider.apresentacao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class VisualizarTreino extends JPanel {

	/**
	 * Create the panel.
	 */
	public VisualizarTreino() {
		setLayout(null);
		
		JLabel lblVisualizarTreino = new JLabel("VISUALIZAR TREINO:");
		lblVisualizarTreino.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblVisualizarTreino.setBounds(354, 146, 379, 48);
		add(lblVisualizarTreino);

	}
}
