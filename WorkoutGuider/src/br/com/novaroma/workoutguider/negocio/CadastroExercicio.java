package br.com.novaroma.workoutguider.negocio;

import java.io.IOException;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Exercicio;

public class CadastroExercicio {

	private String nome;
	private int repeticao;
	private int serie;
	private int dificuldade;
	private boolean[] contraIndicacao;

	public CadastroExercicio(String nome, int repeticao, int serie, int dificuldade, boolean[] contraIndicacao) {
		this.nome = nome;
		this.repeticao = repeticao;
		this.serie = serie;
		this.dificuldade = dificuldade;
		this.contraIndicacao = contraIndicacao;
	}

	public String verificaCadastro() throws ClassNotFoundException, IOException {
		ExercicioNegocio verifique = new ExercicioNegocio();

		if (!verifique.existeExercicio(nome)) {
			if (verifique.repeticao(repeticao)) {
				if (verifique.serie(serie)) {
					if (verifique.dificuldade(dificuldade)) {
						if (verifique.contraIndicacao(contraIndicacao)) {
							return cadastrando();
						} else {
							return "Contra indicação inválida !!!";
						}
					} else {
						return "Dificuldade inválida !!!";
					}
				} else {
					return "O número de séries precisa estar entre 1 e 5 !!!";
				}
			} else {
				return "O número de repetições precisa estar entre 2 e 100 !!!";
			}
		} else {
			return "O exercício já existe !!!";
		}
	}

	public String cadastrando() throws ClassNotFoundException, IOException {
		Exercicio ex = new Exercicio();

		ex.setContraIndicacao(contraIndicacao);
		ex.setDificuldade(dificuldade);
		ex.setNome(nome);
		ex.setSerie(serie);
		ex.setRepeticao(repeticao);
		ArquivoGeral arquivo = new ArquivoGeral(ex);
		return (arquivo.gravarObjeto(ex));

	}

}
