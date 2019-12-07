package br.com.novaroma.workoutguider.utils;

import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class Index {

	public static Exercicio retornaEx(int index) throws ClassNotFoundException, IOException {

		ArquivoGeral arq = new ArquivoGeral(new Exercicio());
		ArrayList<Exercicio> colecao = arq.retornaColecao();
		for (Exercicio ex : colecao) {
			if (ex.getNome().equals(index)) {
				return ex;
			}
		}
		return null;
	}
}
