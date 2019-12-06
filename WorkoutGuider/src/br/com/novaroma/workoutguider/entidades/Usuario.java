package br.com.novaroma.workoutguider.entidades;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String nome;
	private String login;
	private String senha;
	private int idade;
	private String endereco;
	private String email;
	private String telefone;
	private String cpf;

	public Usuario() {
	}

	public Usuario(String nome, String login, String senha, int idade, String endereco, String email, String telefone,
			String cpf) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.idade = idade;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + ", idade=" + idade + ", endereco="
				+ endereco + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + "]";
	}

	
}
