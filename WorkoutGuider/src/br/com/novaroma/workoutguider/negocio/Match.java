package br.com.novaroma.workoutguider.negocio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.apresentacao.TelaLogin;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class Match {

	// ler arquivo já existente
	File arquivoExercicio = new File("treino.txt");
	ArquivoGeral dados = new ArquivoGeral(new Exercicio());
	Cliente cliente = new Cliente();
	ArrayList<Exercicio> exercicio = new ArrayList<Exercicio>();
	ArrayList<Cliente> colecaoCliente = new ArrayList<Cliente>();

	// arraylist final
	ArrayList<Exercicio> treino = new ArrayList<Exercicio>();

	public boolean dificuldade(Exercicio ex) {
		int dificuldade = 0;

		if (TelaLogin.c1.getImc() <= 18.5) {
			dificuldade = 1;
		} else if ((TelaLogin.c1.getImc() > 18.5) && (TelaLogin.c1.getImc() <= 25)) {
			dificuldade = 3;
		} else if ((TelaLogin.c1.getImc() > 25) && (TelaLogin.c1.getImc() <= 30)) {
			dificuldade = 2;
		} else if (TelaLogin.c1.getImc() > 30) {
			dificuldade = 1;
		}

		if (ex.getDificuldade() == dificuldade) {
			return true;
		}

		return false;

	}

}