package br.com.novaroma.workoutguider.utils;

import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Treinador;

public class UsuarioUtil {

	public static Treinador retornaTreinador(String login) throws ClassNotFoundException, IOException {
		ArquivoGeral arq = new ArquivoGeral(new Treinador());
		ArrayList<Treinador> colecao = arq.retornaColecao();
		for (Treinador t1 : colecao) {
			if (t1.getLogin().equals(login)) {
				return t1;
			}
		}
		return null;
	}

//A
	public static Cliente retornaCliente(String login) throws ClassNotFoundException, IOException {
		ArquivoGeral arq = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = arq.retornaColecao();
		for (Cliente c1 : colecao) {
			if (c1.getLogin().equals(login)) {
				return c1;
			}
		}
		return null;
	}

	public static int retornaIndexTreinador(String login) throws ClassNotFoundException, IOException {
		ArquivoGeral arq = new ArquivoGeral(new Treinador());
		ArrayList<Treinador> colecao = arq.retornaColecao();
		for (Treinador t1 : colecao) {
			if (t1.getLogin().equals(login)) {
				return colecao.indexOf(t1);
			}
		}
		return -1;
	}

	public static int retornaIndexCliente(String login) throws ClassNotFoundException, IOException {
		ArquivoGeral arq = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = arq.retornaColecao();
		for (Cliente c1 : colecao) {
			if (c1.getLogin().equals(login)) {
				return colecao.indexOf(c1);
			}
		}
		return -10000;
	}
}