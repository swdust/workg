package br.com.novaroma.workoutguider.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Treinador;
import br.com.novaroma.workoutguider.entidades.Usuario;

public class ArquivoGeral<T> {
	T objeto;
	File arquivoCliente = new File("cliente.txt");
	File arquivoTreinador = new File("treinador.txt");
	File arquivoExercicio = new File("exercicio.txt");

	public ArquivoGeral(T objeto) {
		this.objeto = objeto;
	}

	public String gravarObjeto(T obj) throws ClassNotFoundException, IOException {

		ArrayList<T> colecao = new ArrayList<>();

		if (objeto.getClass().equals(Cliente.class)) {

			if (arquivoCliente.exists()) {
				colecao = retornaColecao();
			} else {
				arquivoCliente.createNewFile();
			}

		} else if (objeto.getClass().equals(Treinador.class)) {

			if (arquivoTreinador.exists()) {
				colecao = retornaColecao();
			} else {
				arquivoTreinador.createNewFile();

			}

		} else {

			if (arquivoExercicio.exists()) {
				colecao = retornaColecao();
			} else {
				arquivoExercicio.createNewFile();

			}

		}

		colecao.add(obj);
		return gravaColecao(colecao);
	}

	public String gravaColecao(ArrayList<T> colecao) throws IOException {
		FileOutputStream fos;

		if (objeto.getClass().equals(Cliente.class)) {
			fos = new FileOutputStream(arquivoCliente);
		} else if (objeto.getClass().equals(Treinador.class)) {
			fos = new FileOutputStream(arquivoTreinador);
		} else {
			fos = new FileOutputStream(arquivoExercicio);
		}
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(colecao);
		oos.close();
		return "Arquivo gravado com sucesso";

	}

	public ArrayList<T> retornaColecao() throws ClassNotFoundException, IOException {
		ArrayList<T> colecao = new ArrayList<>();
		FileInputStream fis;

		if (objeto.getClass().equals(Cliente.class)) {
			fis = new FileInputStream(arquivoCliente);
		} else if (objeto.getClass().equals(Treinador.class)) {
			fis = new FileInputStream(arquivoTreinador);
		} else {
			fis = new FileInputStream(arquivoExercicio);
		}
		ObjectInputStream ois = new ObjectInputStream(fis);
		colecao = (ArrayList<T>) ois.readObject();
		return colecao;
	}

	public String remover(int indice) throws ClassNotFoundException, IOException {
		ArrayList<T> colecao = retornaColecao();
		colecao.remove(indice);
		gravaColecao(colecao);
		return "Removido com sucesso !!!";
	}

	public String alteraObjeto(int index, T objetoAlterado) throws ClassNotFoundException, IOException {
		ArrayList<T> colecao = new ArrayList<>();
		colecao = retornaColecao();
		colecao.set(index, objetoAlterado);
		gravaColecao(colecao);
		return "Alteração concluida !!!";
	}

}
