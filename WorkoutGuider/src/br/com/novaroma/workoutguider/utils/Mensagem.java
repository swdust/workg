package br.com.novaroma.workoutguider.utils;

public enum Mensagem {
	
	ERRO_ARQUIVO("Erro de arquivo: n�o foi poss�vel ");
	
	private String mensagem;
	
	private Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}
