package br.com.novaroma.workoutguider.apresentacao.treinador;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import br.com.novaroma.workoutguider.negocio.CadastroExercicio;
import br.com.novaroma.workoutguider.negocio.ExercicioNegocio;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class AdicionarExercicio extends JPanel {
	private JTextField NomeExercicio;

	public AdicionarExercicio() {
		setLayout(null);

		JLabel lblNome = new JLabel("Nome do Exerc\u00EDcio:");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNome.setBounds(367, 220, 190, 30);
		add(lblNome);

		JLabel lblRepetio = new JLabel("Repeti\u00E7\u00F5es");
		lblRepetio.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblRepetio.setBounds(367, 327, 190, 30);
		add(lblRepetio);

		JLabel lblSrie = new JLabel("S\u00E9ries");
		lblSrie.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSrie.setBounds(371, 436, 186, 30);
		add(lblSrie);

		JLabel lblDificuldade = new JLabel("Dificuldade");
		lblDificuldade.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblDificuldade.setBounds(763, 206, 180, 30);
		add(lblDificuldade);

		JLabel lblNewLabel = new JLabel("Contra-Indica\u00E7\u00E3o");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(763, 384, 155, 30);
		add(lblNewLabel);

		NomeExercicio = new JTextField();
		NomeExercicio.setBounds(365, 246, 192, 30);
		add(NomeExercicio);
		NomeExercicio.setColumns(10);

		JRadioButton Facil = new JRadioButton("F\u00E1cil");
		Facil.setFont(new Font("Verdana", Font.PLAIN, 15));
		Facil.setBounds(763, 243, 109, 23);
		add(Facil);

		JRadioButton Medio = new JRadioButton("M\u00E9dio");
		Medio.setSelected(true);
		Medio.setFont(new Font("Verdana", Font.PLAIN, 15));
		Medio.setBounds(763, 269, 109, 23);
		add(Medio);

		JRadioButton Dificil = new JRadioButton("Dif\u00EDcil");
		Dificil.setFont(new Font("Verdana", Font.PLAIN, 15));
		Dificil.setBounds(763, 292, 109, 23);
		add(Dificil);

		JCheckBox Asma = new JCheckBox("Asma");
		Asma.setFont(new Font("Verdana", Font.PLAIN, 15));
		Asma.setBounds(763, 416, 97, 23);
		add(Asma);

		JCheckBox Osteoporose = new JCheckBox("Osteoporose");
		Osteoporose.setFont(new Font("Verdana", Font.PLAIN, 15));
		Osteoporose.setBounds(763, 493, 155, 23);
		add(Osteoporose);

		JCheckBox Cardiopatia = new JCheckBox("Cardiopatia");
		Cardiopatia.setFont(new Font("Verdana", Font.PLAIN, 15));
		Cardiopatia.setBounds(763, 442, 109, 23);
		add(Cardiopatia);

		JCheckBox Diabetes = new JCheckBox("Diabetes");
		Diabetes.setFont(new Font("Verdana", Font.PLAIN, 15));
		Diabetes.setBounds(763, 468, 97, 23);
		add(Diabetes);

		JLabel lblCadastroDeExerccios = new JLabel("Cadastro de Exerc\u00EDcios");
		lblCadastroDeExerccios.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblCadastroDeExerccios.setBounds(466, 76, 377, 49);
		add(lblCadastroDeExerccios);

		JSpinner series = new JSpinner();
		series.setBounds(367, 465, 82, 30);
		add(series);

		JSpinner repeticoes = new JSpinner();
		repeticoes.setBounds(367, 357, 82, 30);
		add(repeticoes);

		ButtonGroup grupoDificuldade = new ButtonGroup();
		grupoDificuldade.add(Facil);
		grupoDificuldade.add(Medio);
		grupoDificuldade.add(Dificil);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int serie = (Integer) series.getValue();
				int rep = (Integer) repeticoes.getValue();

				int dificuldade = 2;

				if (Facil.isSelected()) {
					dificuldade = 1;
				} else if (Medio.isSelected()) {
					dificuldade = 2;
				} else if (Dificil.isSelected()) {
					dificuldade = 3;
				}

				boolean[] contraIndicacao = new boolean[4];
				if (Asma.isSelected()) {
					contraIndicacao[0] = true;
				}
				if (Cardiopatia.isSelected()) {
					contraIndicacao[1] = true;
				}
				if (Diabetes.isSelected()) {
					contraIndicacao[2] = true;
				}
				if (Osteoporose.isSelected()) {
					contraIndicacao[3] = true;
				}

				CadastroExercicio cad = new CadastroExercicio(NomeExercicio.getText(), rep, serie, dificuldade,
						contraIndicacao);
				try {
					JOptionPane.showMessageDialog(null, cad.verificaCadastro());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
		btnCadastrar.setBounds(638, 610, 89, 23);
		add(btnCadastrar);

	}
}
