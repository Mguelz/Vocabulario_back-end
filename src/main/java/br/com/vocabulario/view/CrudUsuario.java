package br.com.vocabulario.view;

import java.util.List;
import java.util.Scanner;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.dao.VocabularioDAO;
import br.com.vocabulario.model.VocabularioModel;
import br.com.vocabulario.util.LeitorDeDados;

public class CrudUsuario {
	public static final String VOLTAR_MENU = "z";
	private static final String SENHA_CORRETA = "1"; // TODO temporario
	private static final String SENHA_ERRADA = "967"; // temporario
	private static final String NAO_ENCONTRADO = "nao_encontrado";

	VocabularioController vocControll = new VocabularioController();
	VocabularioModel vocModel = new VocabularioModel();
	LeitorDeDados scanner = new LeitorDeDados();
	Scanner scannerr = new Scanner(System.in);
	Instrucoes instrucoes = new Instrucoes();

	/**
	 * Adiciona dois elementos no banco de dados
	 * 
	 * 1- valida a senha 2- insere a palavra em portugues 3- insere a palavra em
	 * ingles
	 * 
	 */
	public void adicionar() {
		boolean loop = true;
		int id = 0;
		String ingles, portugues;
		String senhaDigitada, validandoSenha;

		System.out.println("Para voltar ao meno a qualquer momento digite: \"z\"");

		// validação da senha
		do {
			System.out.print("Insira a senha para acessar esta opção: ");
			senhaDigitada = scanner.pegarTextoCompleto();

			if (senhaDigitada.equalsIgnoreCase(VOLTAR_MENU)) {
				return;
			}

			validandoSenha = validarSenha(senhaDigitada);
		} while (validandoSenha.equals(SENHA_ERRADA));
		do {
			if (senhaDigitada.equals(VOLTAR_MENU)) {
				loop = false;
				System.out.println(" ");
			} else if (senhaDigitada.equals(SENHA_CORRETA)) {
				System.out.print("Insira a palavra em PORTUGUÊS: ");
				portugues = scanner.pegarTextoCurto();
				if (portugues.equals(VOLTAR_MENU)) {
					break;
				}
				System.out.print("Insira a palavra em INGLÊS: ");
				ingles = scanner.pegarTextoCurto();
				if (ingles.equals(VOLTAR_MENU)) {
					break;
				}
				vocModel.setId(id);
				vocModel.setIngles(ingles);
				vocModel.setPortugues(portugues);
				vocControll.cadastrar(vocModel);
				VocabularioModel cadastrado = vocControll.obtemId(portugues);

				System.out.println("\nCadastro Realizado!");
				System.out.println("ID - " + cadastrado.getId() + " - " + cadastrado.getPortugues() + " - "
						+ cadastrado.getIngles());
				System.out.println("---------------------------------------------------------\n");
				loop = false;
			}

		} while (loop);
	}

	/**
	 * Atualiza o banco de dados 1- valida a senha 2- Exibe como estava 3- Exibe
	 * como ficou
	 */
	public void atualizar() {
		boolean loop = true;
		String senhaDigitada, validandoSenha;
		String portuguesAntigo, inglesAntigo, idDigitado;
		int id;

		System.out.println("Para voltar ao meno a qualquer momento digite: \"z\"");

		// validação da senha
		do {
			System.out.print("Insira a senha para acessar esta opção: ");
			senhaDigitada = scanner.pegarTextoCompleto();

			if (senhaDigitada.equalsIgnoreCase(VOLTAR_MENU)) {
				return;
			}

			validandoSenha = validarSenha(senhaDigitada);
		} while (validandoSenha.equals(SENHA_ERRADA));

		do {
			if (senhaDigitada.equals(VOLTAR_MENU)) {
				loop = false;
				System.out.println(" ");
			} else if (senhaDigitada.equals(SENHA_CORRETA)) {
				System.out.print("Insira o ID: ");
				idDigitado = scanner.pegarTextoCompleto();
				if (idDigitado.equals(VOLTAR_MENU)) {
					return;
				} else {
					id = Integer.parseInt(idDigitado);
					if (!vocControll.existeId(id)) {
						System.out.println("ID não encontrado. Atualização cancelada.");
						return;
					}
				}

				System.out.println("Como esta atualmente");
				portuguesAntigo = vocControll.obtemPalavraPortugues(id);
				inglesAntigo = vocControll.obtemPalavraIngles(id);
				System.out.println(portuguesAntigo + " - " + inglesAntigo);
				System.out.print("Insira a nova palavra em PORTUGUÊS: ");
				String portugues = scanner.pegarTextoCurto();
				if (portugues.equals(VOLTAR_MENU)) {
					return;
				}
				System.out.print("Insira a nova palavra em INGLÊS: ");
				String ingles = scanner.pegarTextoCurto();
				if (ingles.equals(VOLTAR_MENU)) {
					return;
				}
				vocModel.setId(id);
				vocModel.setPortugues(portugues);
				vocModel.setIngles(ingles);
				vocControll.atualizar(vocModel);

				System.out.println("\nPalavras atualizadas!");
				System.out.println("ANTIGO: " + portuguesAntigo + " e " + inglesAntigo);
				System.out.println("NOVO: \"" + portugues + "\"" + " e " + "\"" + ingles + "\"\n");
				loop = false;
			}

		} while (loop);

	}

	/**
	 * visualiza os elementos do banco de dados
	 * 
	 * 1- valida a senha 2- escolha do tipo de visualizacao 3- busca de acordo como
	 * escolhido
	 */
	public void visualizar() {
		String senhaDigitada, validandoSenha, tipoVisualizacao;
		boolean loop = true, ignorar = false;
		int pegarId;
		String portugues, ingles;

		System.out.println("Para voltar ao meno a qualquer momento digite: \"z\"");

		// validação da senha
		do {
			System.out.print("Insira a senha para acessar esta opção: ");
			senhaDigitada = scanner.pegarTextoCompleto();

			if (senhaDigitada.equalsIgnoreCase(VOLTAR_MENU)) {
				return;
			}

			validandoSenha = validarSenha(senhaDigitada);
		} while (validandoSenha.equals(SENHA_ERRADA));

		// escolher se deseja visualizar apenas 1 elemente ou todos
		do {
			if (ignorar == true) {
				System.out.println("Para voltar ao meno a qualquer momento digite: \"z\"");
			}
			ignorar = true;
			System.out.print("Digite se deseja visualizar apenas um elemento (1) ou todos (2): ");
			tipoVisualizacao = scanner.pegarTextoCompleto();

			if (tipoVisualizacao.equals(VOLTAR_MENU)) {
				loop = false;
			} else if (tipoVisualizacao.equals("1")) {
				System.out.println("Insira o ID que deseja buscar: ");
				pegarId = scanner.pegarNumeroInteiro();
				vocModel.setId(pegarId);
				portugues = vocControll.obtemPalavraPortugues(pegarId);
				ingles = vocControll.obtemPalavraIngles(pegarId);
				if (portugues.equals(NAO_ENCONTRADO) || ingles.equals(NAO_ENCONTRADO)) {
					instrucoes.elementoNaoEncontrado();
				} else if (!portugues.equals(NAO_ENCONTRADO) || !ingles.equals(NAO_ENCONTRADO)) {
					System.out.println(portugues + " - " + ingles);
					instrucoes.linhaFinal();
				}
			} else if (tipoVisualizacao.equals("2")) {
				visualizarTodosElementos();
				instrucoes.linhaFinal();
			}
		} while (loop);
	}

	/**
	 * Busca 30 elementos do banco de dados
	 * 
	 */
	public void visualizarTodosElementos() {
		// criar uma lista
		// criar um loop que a cada id ele vai adicionando os pares de elementos nessa
		// lista
		// exibir lista
		List<VocabularioModel> colunaInteira = vocControll.listarTudo();
		int qtdElementos = 0;
		System.out.println("Listando todos os valores\n");
		while (qtdElementos < 30) {
			for (VocabularioModel i : colunaInteira) {
				System.out.println(i.getId() + ": " + i.getPortugues() + " - " + i.getIngles());
				qtdElementos++;
			}
		}

	}

	/**
	 * exclui um elemento do banco de dados
	 * 
	 * 
	 */
	public void excluir() {
		boolean loop = true, existe;
		String senhaDigitada, validarSenha, idExiste;
		int idParse;
//		String verificarChave, verificarValor;

		System.out.println("Para voltar ao meno a qualquer momento digite: \"z\"");

		// validação da senha
		do {
			System.out.print("Insira a senha para acessar esta opção: ");
			senhaDigitada = scanner.pegarTextoCompleto();
			validarSenha = validarSenha(senhaDigitada);
		} while (validarSenha.equals(SENHA_ERRADA));

		do {
			if (senhaDigitada.equals(VOLTAR_MENU)) {
				loop = false;
				System.out.println(" ");
			} else if (senhaDigitada.equals(SENHA_CORRETA)) {
				System.out.print("\nInsira o ID: ");
				String idDigitado = scanner.pegarTextoCompleto();
				if (idDigitado.equals(VOLTAR_MENU)) {
					return;
				} else {
					idParse = Integer.parseInt(idDigitado);
					existe = vocControll.existeId(idParse);
					if (!existe) {
						System.out.println("ID digitado não existe! Tente outro ID");
					} else {
						int id = Integer.parseInt(idDigitado);
						vocControll.excluir(id);
						existe = vocControll.existeId(id);
						if (existe == false) {
							System.out.println("Exclusão foi realizada com sucesso!");
							loop = false;
						} else if (existe == true) {
							System.out.println("Nenhuma exclusão não foi realizada");
						}
					}

				}
			}
		} while (loop);
	}

	/**
	 * Valida se a senha digitada esta correta e verifica se o usuario quer voltar
	 * para o menu ou nao
	 * 
	 * @param senha
	 * @return
	 */
	public String validarSenha(String senha) {
		if (senha.equalsIgnoreCase(VOLTAR_MENU)) {
			return VOLTAR_MENU;
		} else if (senha.equals(SENHA_CORRETA)) {
			return "sim";
		} else {
			System.out.println("Senha incorreta, digite novamente:");
			return SENHA_ERRADA;
		}
	}

	/**
	 * Retorna a porcentagem de acertos
	 * 
	 * @param acertos
	 * @param erros
	 * @return
	 */
	public double porcentagemAcerto(int acertos, int erros) {
		return ((double) acertos / (acertos + erros)) * 100;
	}

	/**
	 * Apresenta ao usuario uma mensagem que o programa fechou
	 * 
	 * @param acertos
	 * @param erros
	 */
	public void mensagemFecharPrograma(int acertos, int erros) {
		double porcentagemAcertosFinal = porcentagemAcerto(acertos, erros);
		System.out.println("\n---------------------------------------");
		System.out.println("\nVoce acertou " + acertos + " e errou " + erros);
		System.out.printf("Essa Foi sua Porcentagem de Acertos - %.2f%%\n\n", porcentagemAcertosFinal);
	}

}
