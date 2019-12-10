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
import javax.swing.JTextPane;
import java.awt.Font;

public class Progresso extends JPanel {
	static int dias;
	/**
	 * Create the panel.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Progresso() throws ClassNotFoundException, IOException {
		setBounds(new Rectangle(0, 0, 1264, 670));
		setLayout(null);
		
		Cliente c1 = UsuarioUtil.retornaCliente(TelaLogin.c1.getLogin());
		TelaLogin.c1.getLogin();
		dias = c1.getDiasTreinados();
		
		JProgressBar progressBar = new JProgressBar(0, 30);
		progressBar.setValue(dias);
		progressBar.setStringPainted(true);
		progressBar.setBounds(538, 349, 386, 58);
		add(progressBar);
		
		JButton btnTreineiUmDia = new JButton("TREINEI UM DIA");
		btnTreineiUmDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dias++;
				c1.setDiasTreinados(dias);
				ArquivoGeral arquivo = new ArquivoGeral(c1);
				try {
					arquivo.alteraObjeto(UsuarioUtil.retornaIndexCliente(c1.getNome()), c1);
					progressBar.setValue(dias);
					progressBar.setStringPainted(true);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(progressBar.getValue() == 30) {
					JTextPane txtpnSeuProgressoChegou = new JTextPane();
					txtpnSeuProgressoChegou.setFont(new Font("Verdana", Font.PLAIN, 11));
					txtpnSeuProgressoChegou.setText("Seu progresso chegou ao m\u00E1ximo com esse treino espec\u00EDfico, atualize suas informa\u00E7\u00F5es  na guia \"Alterar Cadastro\" para receber um novo treino !!!");
					txtpnSeuProgressoChegou.setBounds(514, 438, 443, 155);
					add(txtpnSeuProgressoChegou);
				}
			}
		});
		btnTreineiUmDia.setBounds(484, 147, 437, 68);
		add(btnTreineiUmDia);
		
		

	}
}
