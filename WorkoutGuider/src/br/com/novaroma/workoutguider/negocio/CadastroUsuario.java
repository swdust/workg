package br.com.novaroma.workoutguider.negocio;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.novaroma.workoutguider.apresentacao.TelaLogin;
import br.com.novaroma.workoutguider.dados.ArquivoGeral;
import br.com.novaroma.workoutguider.entidades.Cliente;
import br.com.novaroma.workoutguider.entidades.Treinador;
import br.com.novaroma.workoutguider.utils.UsuarioUtil;

public class CadastroUsuario {
	private String nome;
	private String login;
	private String senha;
	private String confirmeSenha;
	private String idade;
	private String endereco;
	private String email;
	private String telefone;
	private String cpf;
	private double altura;
	private double peso;
	private int tempoDisponivel;
	private boolean[] doencas;

	public CadastroUsuario(String nome, String login, String senha, String confirmeSenha, String idade, String endereco,
			String email, String telefone, String cpf, double altura, double peso, int tempoDisponivel,
			boolean[] doencas) {

		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.confirmeSenha = confirmeSenha;
		this.idade = idade;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.altura = altura;
		this.peso = peso;
		this.tempoDisponivel = tempoDisponivel;
		this.doencas = doencas;
	}

	public CadastroUsuario(String nome, String login, String senha, String confirmeSenha, String idade, String endereco,
			String email, String telefone, String cpf) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.confirmeSenha = confirmeSenha;
		this.idade = idade;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String verificaAltCadastro() {
		UsuarioNegocio verifique = new UsuarioNegocio();
		try {
			if (!verifique.existeLogin(login) || login.equals(TelaLogin.c1.getLogin())) {
				if (verifique.senha(senha, confirmeSenha)) {
					if (verifique.CPF(cpf)) {
						if (verifique.email(email)) {
							if (verifique.idade(idade)) {
								if (verifique.altura(altura)) {
									if (verifique.peso(peso)) {
										if (verifique.telefone(telefone)) {
											if (verifique.tempo(tempoDisponivel)) {
												return alterando();
											} else {
												return "Necess�rio ao menos 30 minutos!";
											}
										} else {
											return "N�mero telefonico inv�lido, digite novamente!";
										}
									} else {
										return "Peso inv�lido, digite novamente!";
									}
								} else {
									return "Altura inv�lida, vo�� deve ter entre 80cm a 200cm!";
								}
							} else {
								return "A idade m�nima permitida � 15 anos e a m�xima 90!";
							}
						} else {
							return "Email inv�lido, digite novamente!";
						}
					} else {
						return "CPF inv�lido, digite novamente!";
					}
				} else {
					return "Senha n�o confirmada, digite novamente!" + senha + " " + confirmeSenha;
				}
			} else {
				return "Login indispon�vel, tente outro!";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "Arquivo n�o encontrado!";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/sa�da!";
		}
	}

	public String verificaCadastro() {
		UsuarioNegocio verifique = new UsuarioNegocio();
		try {
			if (!verifique.existeLogin(login)) {
				if (verifique.senha(senha, confirmeSenha)) {
					if (verifique.CPF(cpf)) {
						if (verifique.email(email)) {
							if (verifique.idade(idade)) {
								if (verifique.altura(altura)) {
									if (verifique.peso(peso)) {
										if (verifique.telefone(telefone)) {
											if (verifique.tempo(tempoDisponivel)) {
												return cadastrando();
											} else {
												return "Necess�rio ao menos 30 minutos!";
											}
										} else {
											return "N�mero telefonico inv�lido, digite novamente!";
										}
									} else {
										return "Peso inv�lido, digite novamente!";
									}
								} else {
									return "Altura inv�lida, vo�� deve ter entre 80cm a 200cm!";
								}
							} else {
								return "A idade m�nima permitida � 15 anos e a m�xima 90!";
							}
						} else {
							return "Email inv�lido, digite novamente!";
						}
					} else {
						return "CPF inv�lido, digite novamente!";
					}
				} else {
					return "Senha n�o confirmada, digite novamente!" + senha + " " + confirmeSenha;
				}
			} else {
				return "Login indispon�vel, tente outro!";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "Arquivo n�o encontrado!";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/saida!";
		}
	}

	public String verificaCadastroT() {
		UsuarioNegocio verifique = new UsuarioNegocio();

		try {
			if (verifique.existeLoginT(login)) {
				return "Login indispon�vel, tente outro!";
			} else {

				if (verifique.senha(senha, confirmeSenha)) {
					if (verifique.CPF(cpf)) {
						if (verifique.email(email)) {
							if (verifique.idade(idade)) {
								if (verifique.telefone(telefone)) {
									return cadastrandoT();
								} else {
									return "N�mero telefonico inv�lido, digite novamente!";
								}
							} else {
								return "A idade m�nima permitida � 15 anos e a m�xima 90!";
							}
						} else {
							return "Email inv�lido, digite novamente!";
						}
					} else {
						return "CPF inv�lido, digite novamente!";
					}
				} else {
					return "Senha n�o confirmada, digite novamente! (" + senha + "=/=" + confirmeSenha + ")";
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "Arquivo n�o encontrado!";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/sa�da!";
		}
	}

	public String cadastrando() throws ClassNotFoundException, IOException {
		Match mt = new Match();
		Cliente c1 = new Cliente();

		c1.setNome(nome);
		c1.setLogin(login);
		c1.setSenha(senha);
		c1.setIdade(Integer.parseInt(idade));
		c1.setEndereco(endereco);
		c1.setEmail(email);
		c1.setTelefone(telefone);
		c1.setCpf(cpf);
		c1.setAltura(altura);
		c1.setPeso(peso);
		c1.setTempoDisponivel(tempoDisponivel);
		c1.setTelefone(telefone);
		c1.setDoencas(doencas);
		c1 = mt.match(c1);

		ArquivoGeral arquivo = new ArquivoGeral(c1);
		try {
			return arquivo.gravarObjeto(c1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada !!!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/saida !!!";
		}
	}

	public String alterando() throws ClassNotFoundException, IOException {
		Match mt = new Match();
		Cliente c1 = new Cliente();

		c1.setNome(nome);
		c1.setLogin(login);
		c1.setSenha(senha);
		c1.setIdade(Integer.parseInt(idade));
		c1.setEndereco(endereco);
		c1.setEmail(email);
		c1.setTelefone(telefone);
		c1.setCpf(cpf);
		c1.setAltura(altura);
		c1.setPeso(peso);
		c1.setTempoDisponivel(tempoDisponivel);
		c1.setTelefone(telefone);
		c1.setDoencas(doencas);
		c1 = mt.match(c1);

		ArquivoGeral arquivo = new ArquivoGeral(c1);
		try {
			return arquivo.alteraObjeto(UsuarioUtil.retornaIndexCliente(nome), c1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/sa�da!";
		}
	}

	public String cadastrandoT() {

		Treinador t1 = new Treinador();

		t1.setNome(nome);
		t1.setLogin(login);
		t1.setSenha(senha);
		t1.setIdade(Integer.parseInt(idade));
		t1.setEndereco(endereco);
		t1.setEmail(email);
		t1.setTelefone(telefone);
		t1.setCpf(cpf);
		t1.setTelefone(telefone);

		ArquivoGeral arquivo = new ArquivoGeral(t1);
		try {
			return arquivo.gravarObjeto(t1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe n�o encontrada!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro de entrada/sa�da!";
		}
	}

}
