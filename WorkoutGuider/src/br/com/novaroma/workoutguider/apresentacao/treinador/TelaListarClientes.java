package br.com.novaroma.workoutguider.apresentacao.treinador;

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;

public class TelaListarClientes extends JPanel {
	private JTable table;
	private JTable table_1;

	public TelaListarClientes() throws ClassNotFoundException, IOException {
		setLayout(null);

		ArquivoGeral arq = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = arq.retornaColecao();
		Object[][] dadosClientes = new String[colecao.size()][5];
		for (Cliente c1 : colecao) {
			DecimalFormat df = new DecimalFormat("0.##");
			String imc = df.format(c1.getImc());
			dadosClientes[colecao.indexOf(c1)][0] = c1.getNome();
			dadosClientes[colecao.indexOf(c1)][1] = c1.getTelefone();
			dadosClientes[colecao.indexOf(c1)][3] = c1.getEmail();
			dadosClientes[colecao.indexOf(c1)][2] = Integer.toString(c1.getIdade());
			dadosClientes[colecao.indexOf(c1)][4] = imc;
		}
		String[] nomeColunas = { "Nome", "Telefone", "Idade", "Email", "IMC" };

		table = new JTable(dadosClientes, nomeColunas);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setLocation(0, 0);
		add(scrollPane);
		scrollPane.setSize(1280, 660);
		scrollPane.setVisible(true);

	}
}