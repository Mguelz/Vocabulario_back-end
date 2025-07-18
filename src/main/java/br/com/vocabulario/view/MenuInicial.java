package br.com.vocabulario.view;

import br.com.vocabulario.util.LeitorDeDados;

public class MenuInicial {
	public static final byte OPCAO_JOGAR = 1;
	public static final byte OPCAO_ADICIONAR = 2;
	public static final byte OPCAO_VISUALIZAR = 3;
	public static final byte OPCAO_ATUALIZAR = 4;
	public static final byte OPCAO_EXCLUIR = 5;
	public static final byte OPCAO_SAIR = 0;

	public void menuInicial() {
		LeitorDeDados scanner = new LeitorDeDados();
		CrudUsuario cu = new CrudUsuario();
		Instrucoes ins = new Instrucoes();

		boolean loop = true;
		int escolha = -1;

		ins.instrucoesIniciais();
		do {
			menuOpcoes();
			System.out.print("Escolha a opcao desejada: ");
			escolha = scanner.pegarNumeroInteiro();

			switch (escolha) {
			case OPCAO_JOGAR:
				System.out.println("\n-----------------------");
				System.out.println("Opcao escolhida: JOGAR");
				System.out.println("-----------------------\n");
				ApresentaNome an = new ApresentaNome();
				Instrucoes in = new Instrucoes();
				in.instrucoesJogar();
				an.apresentaNomes();
				break;
			case OPCAO_ADICIONAR:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Opcao escolhida: ADICIONAR");
				System.out.println("-------------------------------------------------------\n");
				cu.adicionar();
				break;
			case OPCAO_VISUALIZAR:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Opcao escolhida: VISUALIZAR (\"EM DESENVOLVIMENTO\")");
				System.out.println("-------------------------------------------------------\n");
				cu.visualizar();
				break;
			case OPCAO_ATUALIZAR:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Opcao escolhida: ATUALIZAR");
				System.out.println("-------------------------------------------------------\n");
				cu.atualizar();
				break;
			case OPCAO_EXCLUIR:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Opcao escolhida: EXCLUIR");
				System.out.println("-------------------------------------------------------\n");
				cu.excluir();
				break;
			case OPCAO_SAIR:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Opcao escolhida: SAIR");
				System.out.println("-------------------------------------------------------\n");
				loop = false;
				break;
			default:
				System.out.println("\n-------------------------------------------------------");
				System.out.println("Digita uma das opcoes:");
				menuOpcoes();
				break;
			}
		} while (loop);
		scanner.fecharLeitor();
	}

	public void menuOpcoes() {
		System.out.println("-------------------------------- Tela de Menu --------------------------------");
		System.out.println(" 1 - JOGAR");
		System.out.println(" 2 - ADICIONAR");
		System.out.println(" 3 - VISUALIZAR");
		System.out.println(" 4 - ATUALIZAR");
		System.out.println(" 5 - EXCLUIR");
		System.out.println(" 0 - Sair ");
	}
}
