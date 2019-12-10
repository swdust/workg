package br.com.novaroma.workoutguider.negocio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import br.com.novaroma.workoutguider.apresentacao.cliente.TelaLogin;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class Match {
	public Cliente cc1 = new Cliente();
	File arquivoExercicio = new File("treino.txt");

	public Cliente match(Cliente c1) throws ClassNotFoundException, IOException {
		cc1 = c1;
		ArquivoGeral dados = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = dados.retornaColecao();
		ArrayList<Exercicio> treino = new ArrayList<Exercicio>();
		Collections.shuffle(colecao);
		int contador = 0;
		for (Exercicio ex : colecao) {
			if (dificuldade(ex)) {
				if (cIndicacao(ex)) {
					if (treino.size() < quantidadeEx()) {
						treino.add(ex);
					}
				}
			}
		}
		c1.setTreino(treino);
		return c1;
	}

	public boolean dificuldade(Exercicio ex) {
		int dificuldade = 0;

		if (cc1.getImc() <= 18.5) {
			dificuldade = 1;
		} else if ((cc1.getImc() > 18.5) && (cc1.getImc() <= 25)) {
			dificuldade = 3;
		} else if ((cc1.getImc() > 25) && (cc1.getImc() <= 30)) {
			dificuldade = 2;
		} else if (cc1.getImc() > 30) {
			dificuldade = 1;
		}

		if (ex.getDificuldade() <= dificuldade) {
			return true;
		}

		return false;

	}

	public boolean cIndicacao(Exercicio ex) {
		if ((ex.getContraIndicacao()[0] == cc1.getDoencas()[0]) && (cc1.getDoencas()[0])) {
			return false;
		} else if ((ex.getContraIndicacao()[1] == cc1.getDoencas()[1]) && (cc1.getDoencas()[1])) {
			return false;
		} else if ((ex.getContraIndicacao()[2] == cc1.getDoencas()[2]) && (cc1.getDoencas()[2])) {
			return false;
		} else if ((ex.getContraIndicacao()[3] == cc1.getDoencas()[3]) && (cc1.getDoencas()[3])) {
			return false;
		}
		return true;
	}

	public int quantidadeEx() {

		if ((cc1.getTempoDisponivel() > 30) && (cc1.getTempoDisponivel() < 40)) {
			return 3;
		} else if ((cc1.getTempoDisponivel() > 40) && (cc1.getTempoDisponivel() < 50)) {
			return 4;
		} else if ((cc1.getTempoDisponivel() > 50)) {
			return 5;
		}
		return 3;

	}
}