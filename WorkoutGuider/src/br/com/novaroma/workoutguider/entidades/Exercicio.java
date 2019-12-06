package br.com.novaroma.workoutguider.entidades;

import java.io.Serializable;
import java.util.Arrays;

public class Exercicio implements Serializable {

	private String nome;
	private int repeticao;
	private int serie;
	private int dificuldade;
	private boolean[] contraIndicacao;

	public Exercicio() {
	}

	public Exercicio(String nomeExercicio, int repeticao, int serie, int dificuldade, boolean[] contraIndicacao) {
		this.nome = nomeExercicio;
		this.repeticao = repeticao;
		this.serie = serie;
		this.dificuldade = dificuldade;
		this.contraIndicacao = contraIndicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public boolean[] getContraIndicacao() {
		return contraIndicacao;
	}

	public void setContraIndicacao(boolean[] contraIndicacao) {
		this.contraIndicacao = contraIndicacao;
	}

	public String getRep() {
		return Integer.toString(repeticao);
	}

	public String getSer() {
		return Integer.toString(serie);
	}

	public String getDif() {
		switch (dificuldade) {
		case 1:
			return "Fácil";
		case 2:
			return "Médio";
		case 3:
			return "Difícil";
		}
		return null;
	}

	public String getContra() {
		String ci = new String();
		if (contraIndicacao[0]) {
			ci += "|Asma |";
		}
		if (contraIndicacao[1]) {
			ci += "|Cardiopatia |";
		}
		if (contraIndicacao[2]) {
			ci += "|Diabetes |";
		}
		if (contraIndicacao[3]) {
			ci += "|Osteoporose |";
		}
		return ci;
	}

	@Override
	public String toString() {
		return "Exercicios [nome=" + nome + ", repeticao=" + repeticao + ", serie=" + serie + ", dificuldade="
				+ dificuldade + ", contraIndicacao=" + Arrays.toString(contraIndicacao) + "]";
	}

}