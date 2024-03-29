package br.com.novaroma.workoutguider.apresentacao.cliente;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;
import br.com.novaroma.workoutguider.negocio.Match;

import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class TelaVisualizarTreino extends JPanel {
	private JTextField caixaDeVisualizacao;
	private JTable table;

	public TelaVisualizarTreino() throws ClassNotFoundException, IOException {
		setBounds(new Rectangle(0, 0, 1264, 670));
		setLayout(null);

		ArquivoGeral arq = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = arq.retornaColecao();
		ArrayList<Exercicio> treino = new ArrayList<Exercicio>();

		for (Cliente c1 : colecao) {
			if (c1.getNome().equals(TelaLogin.c1.getNome())) {
				treino = c1.getTreino();

			}
		}

		Object[][] dadosTreino = new String[treino.size()][4];

		for (Exercicio ex : treino) {
			dadosTreino[treino.indexOf(ex)][0] = ex.getNome();
			dadosTreino[treino.indexOf(ex)][1] = ex.getRep();
			dadosTreino[treino.indexOf(ex)][2] = ex.getSer();
			dadosTreino[treino.indexOf(ex)][3] = ex.getDif();
		}

		String[] nomeColunas = { "Nome", "Repeti��es", "S�ries", "Dificuldade" };

		table = new JTable(dadosTreino, nomeColunas);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setLocation(231, 213);
		add(scrollPane);
		scrollPane.setSize(827, 335);
		
		JTextPane txtpnTreinoMensal = new JTextPane();
		txtpnTreinoMensal.setEditable(false);
		txtpnTreinoMensal.setFont(new Font("Verdana", Font.PLAIN, 30));
		txtpnTreinoMensal.setText("Seu Treino Di\u00E1rio");
		txtpnTreinoMensal.setBounds(495, 122, 302, 53);
		add(txtpnTreinoMensal);
		scrollPane.setVisible(true);

	}
}
