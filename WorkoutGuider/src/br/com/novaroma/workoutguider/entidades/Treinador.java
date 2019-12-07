package br.com.novaroma.workoutguider.entidades;

import br.com.novaroma.workoutguider.entidades.Usuario;

public class Treinador extends Usuario {

	public Treinador() {
	}

	public Treinador(String nome, String login, String senha, String confirmeSenha, int idade, String endereco,
			String email, String telefone, String cpf) {
		super(nome, login, senha, idade, endereco, email, telefone, cpf);
	}

}
