package br.com.novaroma.workoutguider.entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Usuario implements Serializable {

	private double altura;
	private double peso;
	private double imc;
	private int tempoDisponivel;
	private char sexo;
	private boolean[] doencas;
	private ArrayList<Exercicio> treino;

	public Cliente() {
	}

	public Cliente(double altura, double peso, boolean[] doencas, int tempoDisponivel, char sexo, String nome,
			String login, String senha, int idade, String endereco, String email, String telefone, boolean permissao,
			String cpf, String tipo) {
		super(nome, login, senha, idade, endereco, email, telefone, cpf);
		this.altura = altura;
		this.peso = peso;
		this.doencas = doencas;
		this.tempoDisponivel = tempoDisponivel;
		this.sexo = sexo;
	}

	public ArrayList<Exercicio> getTreino() {
		return treino;
	}

	public void setTreino(ArrayList<Exercicio> ex) {
		this.treino = ex;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return peso / (((altura / 100) * (altura / 100)));
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public boolean[] getDoencas() {
		return doencas;
	}

	public void setDoencas(boolean[] doencas) {
		this.doencas = doencas;
	}

	public int getTempoDisponivel() {
		return tempoDisponivel;
	}

	public void setTempoDisponivel(int tempoDisponivel) {
		this.tempoDisponivel = tempoDisponivel;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
