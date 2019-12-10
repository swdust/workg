package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class TelaExcluirClientes extends JPanel {

	/**
	 * Create the panel.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public TelaExcluirClientes() throws ClassNotFoundException, IOException {
		setBounds(new Rectangle(0, 0, 1264, 670));
		setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(485, 187, 188, 29);
		add(comboBox);

		ArquivoGeral arq = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = arq.retornaColecao();
		String[] nomes = new String[colecao.size()];
		int cont = 0;
		for (Cliente c1 : colecao) {
			comboBox.addItem(c1.getNome());
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
				for (Cliente c1 : colecao) {
					comboBox.addItem(c1.getNome());
				}
			}
		});
		btnExcluir.setBounds(536, 258, 85, 21);
		add(btnExcluir);

		JLabel lblSelecioneOExerccio = new JLabel("Selecione o cliente:");
		lblSelecioneOExerccio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecioneOExerccio.setBounds(294, 187, 199, 29);
		add(lblSelecioneOExerccio);

	}

}
