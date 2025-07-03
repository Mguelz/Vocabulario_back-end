package br.com.vocabulario.view;

import br.com.vocabulario.controller.VocabularioController;
import br.com.vocabulario.util.LeitorDeDados;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar
 * para ele
 * 
 * @author Miguel Arcanjo
 */
public class ApresentaNome {
	/**
	 * Principal lógica onde o usuario estará o tempo inteiro interagindo
	 */
	public void apresentaNomes() {
		VocabularioController vc = null;
		vc = new VocabularioController();
		LeitorDeDados scanner = new LeitorDeDados();
		CrudUsuario crudUser = new CrudUsuario();

		boolean loop = true;
		int idGerado = -1, acertos = 0, erros = 0;
		String ingles, portugues, digitado;

		while (loop) {
			idGerado = vc.aleatorizaSequencia();
			ingles = vc.obtemPalavraIngles(idGerado);
			portugues = vc.obtemPalavraPortugues(idGerado);

			System.out.println("Qual a tradução da palavra - \"" + ingles + "\"");
			digitado = scanner.pegarTextoCurto();
			if (digitado.toLowerCase().equals(portugues)) {
				mensagemAcerto();
				acertos++;
			} else if (digitado.toLowerCase().equals("close")) {
				crudUser.mensagemFecharPrograma(acertos, erros);
				loop = false;
				break;
			} else {
				System.out.println("---------------------------------------");
				System.err.println("ERROU, a resposta era \"" + portugues + "\" Você digitou \"" + digitado + "\" ");
				System.out.println("---------------------------------------");
				erros++;
			}
		}
	}

	/**
	 * Apresenta uma mensagem de acerto
	 */
	public static void mensagemAcerto() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}

	/**
	 * Apresenta uma mensagem de erro
	 */
	public static void mensagemFecharPrograma() {
		System.out.println("\n---------------------------------------");
		System.out.println("O Programa Fechou!");
		System.out.println("---------------------------------------");
	}

}
