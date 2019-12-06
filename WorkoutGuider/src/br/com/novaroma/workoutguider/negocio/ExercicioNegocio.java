package br.com.novaroma.workoutguider.negocio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class ExercicioNegocio {

	public boolean existeExercicio(String nome) throws ClassNotFoundException, IOException {
		File arquivoExercicio = new File("exercicio.txt");
		if (!arquivoExercicio.exists()) {
			return false;
		}
		ArquivoGeral dados = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = new ArrayList<Exercicio>();
		colecao = dados.retornaColecao();
		for (Exercicio ex : colecao) {
			if (ex.getNome().equals(nome)) {
				return true;
			} else if (ex.getNome() != nome) {
				return false;
			}
		}
		return false;
	}

	public boolean repeticao(int rep) {
		if (rep > 1 && rep <= 100) {
			return true;
		}
		return false;
	}

	public boolean serie(int serie) {
		if (serie > 0 && serie <= 5) {
			return true;
		}
		return false;
	}

	public boolean dificuldade(int dificuldade) {
		return true;
	}

	public boolean contraIndicacao(boolean[] contraindicacao) {
		return true;
	}
}
