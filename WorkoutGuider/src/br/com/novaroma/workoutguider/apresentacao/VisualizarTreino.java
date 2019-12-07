package br.com.novaroma.workoutguider.apresentacao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class VisualizarTreino extends JPanel {
	private JTextField caixaDeVisualizacao;

	public VisualizarTreino() {
		setLayout(null);

		JLabel lblVisualizarTreino = new JLabel("VISUALIZAR TREINO:");
		lblVisualizarTreino.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblVisualizarTreino.setBounds(477, 71, 344, 48);
		add(lblVisualizarTreino);

	}
}
