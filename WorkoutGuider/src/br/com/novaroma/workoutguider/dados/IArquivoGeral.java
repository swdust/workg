package br.com.novaroma.workoutguider.dados;

import java.io.IOException;
import java.util.ArrayList;

import br.com.novaroma.workoutguider.entidades.Usuario;

public interface IArquivoGeral<T> {

	String gravarObjeto(T obj) throws ClassNotFoundException, IOException;

	String gravaColecao(ArrayList<T> colecao) throws IOException;

	ArrayList<T> retornaColecao() throws ClassNotFoundException, IOException;

	String remover(int indice) throws ClassNotFoundException, IOException;

	String alteraObjeto(int index, T objetoAlterado) throws ClassNotFoundException, IOException;

}
