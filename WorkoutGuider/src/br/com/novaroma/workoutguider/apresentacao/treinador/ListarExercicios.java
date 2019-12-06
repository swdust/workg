package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarExercicios extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public ListarExercicios() throws ClassNotFoundException, IOException {
		setLayout(null);

		ArquivoGeral arq = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = arq.retornaColecao();
		Object[][] dadosExercicio = new String[colecao.size()][5];
		for (Exercicio ex : colecao) {
			dadosExercicio[colecao.indexOf(ex)][0] = ex.getNome();
			dadosExercicio[colecao.indexOf(ex)][1] = ex.getRep();
			dadosExercicio[colecao.indexOf(ex)][3] = ex.getSer();
			dadosExercicio[colecao.indexOf(ex)][2] = ex.getDif();
			dadosExercicio[colecao.indexOf(ex)][4] = ex.getContra();
		}
		String[] nomeColunas = { "Nome", "Repetições", "Dificuldade", "Séries", "Contraindicação" };

		table = new JTable(dadosExercicio, nomeColunas);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setLocation(0, 0);
		add(scrollPane);
		scrollPane.setSize(1280, 660);
		scrollPane.setVisible(true);

	}
}
