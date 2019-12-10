package br.com.novaroma.workoutguider.apresentacao.cliente;

import java.awt.Rectangle;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.utils.UsuarioUtil;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Progresso extends JPanel {
	static int dias;

	public Progresso() throws ClassNotFoundException, IOException {
		setBounds(new Rectangle(0, 0, 1264, 670));
		setLayout(null);

		Cliente c1 = UsuarioUtil.retornaCliente(TelaLogin.c1.getLogin());
		TelaLogin.c1.getLogin();
		dias = c1.getDiasTreinados();

		JButton btnTreineiUmDia = new JButton("TREINEI UM DIA");
		btnTreineiUmDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dias++;
			}
		});
		btnTreineiUmDia.setBounds(484, 147, 437, 68);
		add(btnTreineiUmDia);

		c1.setDiasTreinados(dias);

		ArquivoGeral arquivo = new ArquivoGeral(c1);
		arquivo.alteraObjeto(UsuarioUtil.retornaIndexCliente(c1.getNome()), c1);
		JProgressBar progressBar = new JProgressBar(0, 30);
		progressBar.setValue(dias);
		progressBar.setStringPainted(true);
		progressBar.setBounds(538, 349, 386, 58);
		add(progressBar);

	}
}
