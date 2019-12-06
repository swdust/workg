package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;
import br.com.novaroma.workoutguider.utils.Index;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ExcluirExercicio extends JPanel {
	
	/**
	 * Create the panel.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public ExcluirExercicio() throws ClassNotFoundException, IOException {
		setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(485, 187, 188, 29);
		add(comboBox);

		ArquivoGeral arq = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = arq.retornaColecao();
		String[] nomes = new String[colecao.size()];
		int cont = 0;
		for (Exercicio ex : colecao) {
			comboBox.addItem(ex.getNome());
		}

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colecao.remove(comboBox.getSelectedIndex());
				try {
					arq.gravaColecao(colecao);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				comboBox.removeAllItems();
				for (Exercicio ex : colecao) {
					comboBox.addItem(ex.getNome());
				}
			}
		});
		btnExcluir.setBounds(536, 258, 85, 21);
		add(btnExcluir);
		
		JLabel lblSelecioneOExerccio = new JLabel("Selecione o exerc\u00EDcio:");
		lblSelecioneOExerccio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecioneOExerccio.setBounds(294, 187, 199, 29);
		add(lblSelecioneOExerccio);

	}
	
}
