package br.com.novaroma.workoutguider.excecao;

import br.com.novaroma.workoutguider.utils.Mensagem;

public class ExcecaoArquivo extends Exception {
	
		public ExcecaoArquivo(String mensagem) {
			super(Mensagem.ERRO_ARQUIVO.getMensagem() + mensagem);
		}

}
