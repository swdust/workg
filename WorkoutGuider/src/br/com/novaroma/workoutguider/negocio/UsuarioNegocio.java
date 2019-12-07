package br.com.novaroma.workoutguider.negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Treinador;

public class UsuarioNegocio {

	public boolean senha(String senha, String confirmaSenha) {
		if (senha.equals(confirmaSenha)) {
			return true;
		}
		return false;
	}

	private String padLeft(String text, char character) {
		return String.format("%11s", text).replace(' ', character);
	}

	private int calcularDigito(String str, int[] peso) {
		int soma = 0;
		for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(str.substring(indice, indice + 1));
			soma += digito * peso[peso.length - str.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}

	public boolean CPF(String cpf) {
		final int[] pesoCPF = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
		cpf = cpf.trim().replace(".", "").replace("-", "");
		if ((cpf == null) || (cpf.length() != 11))
			return false;

		for (int j = 0; j < 10; j++)
			if (padLeft(Integer.toString(j), Character.forDigit(j, 10)).equals(cpf))
				return false;

		Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
		Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
		return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
	}

	public static boolean email(String email) {
		boolean validez = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				validez = true;
			}
		}
		return validez;
	}

	public boolean sexo(char sexo) {
		if ((sexo != 'f') && (sexo != 'm')) {
			return true;
		}
		return false;
	}

	public boolean peso(double peso) {
		return true;
	}

	public boolean telefone(String telefone) {
		Pattern p = Pattern.compile("[9]{1}[0-9]{8}");
		Matcher m = p.matcher(telefone);
		return m.matches();
	}

	public boolean altura(double altura) {
		if ((altura < 80) || (altura > 200)) {
			return false;
		}
		return true;
	}

	public boolean existeLogin(String login) throws FileNotFoundException, ClassNotFoundException, IOException {
		File arquivoCliente = new File("cliente.txt");
		if (!arquivoCliente.exists()) {
			return false;
		}
		ArquivoGeral dados = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = new ArrayList();
		colecao = dados.retornaColecao();
		for (Cliente cliente : colecao) {
			if (cliente.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}

	public boolean existeLoginT(String login) throws FileNotFoundException, ClassNotFoundException, IOException {
		File arquivoCliente = new File("treinador.txt");
		if (!arquivoCliente.exists()) {
			return false;
		}
		ArquivoGeral dados = new ArquivoGeral(new Treinador());
		ArrayList<Treinador> colecao = new ArrayList();
		colecao = dados.retornaColecao();
		for (Treinador treinador : colecao) {
			if (treinador.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}

	public boolean loginSenha(String login, String senha)
			throws FileNotFoundException, ClassNotFoundException, IOException {
		ArquivoGeral dados = new ArquivoGeral(new Cliente());
		ArrayList<Cliente> colecao = new ArrayList<Cliente>();
		colecao = dados.retornaColecao();
		for (Cliente cliente : colecao) {
			if ((cliente.getLogin().equals(login)) && (cliente.getSenha().equals(senha))) {
				return true;
			}
		}
		return false;
	}

	public boolean loginSenhaT(String login, String senha)
			throws FileNotFoundException, ClassNotFoundException, IOException {
		ArquivoGeral dados = new ArquivoGeral(new Treinador());
		ArrayList<Treinador> colecao = new ArrayList<Treinador>();
		colecao = dados.retornaColecao();
		for (Treinador treinador : colecao) {
			if ((treinador.getLogin().equals(login)) && (treinador.getSenha().equals(senha))) {
				return true;
			}
		}
		return false;
	}

	public boolean tempo(int tempo) {
		if (tempo < 30) {
			return true;
		}
		return false;
	}

	public boolean idade(String idade) {
		int idad = Integer.parseInt(idade);
		if (idad < 15) {
			return false;

		} else if (idad > 90) {
			return false;
		}
		return true;
	}

	public int imc(double imc) {
		if (imc < 18.5) {
			return 1;
		} else if ((imc >= 18.5) && (imc < 25)) {
			return 2;
		} else if ((imc >= 25) && (imc < 30)) {
			return 3;
		} else if ((imc >= 30) && (imc < 35)) {
			return 4;
		} else if ((imc >= 35) && (imc < 40)) {
			return 5;
		} else if ((imc > 40)) {
			return 6;
		}
		return 0;
	}

	public String doencas(boolean[] doencas) {
		String array = "\n";
		if (doencas[0]) {
			array += " Asma\n";
		}
		if (doencas[1]) {
			array += " Cardiopatia\n";
		}
		if (doencas[2]) {
			array += " Diabetes\n";
		}
		if (doencas[3]) {
			array += " Osteoporose\n";
		}
		if (!(doencas[0] || doencas[1] || doencas[2] || doencas[3])) {
			array = "Sem doenças !!!";
		}
		return array;
	}

	public void nome() {

	}

}
