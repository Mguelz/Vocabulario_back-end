package br.com.vocabulario.meaven;

//import vocabulario.V1_map.LeitorDeDados;
//import vocabulario.V1_map.Vocabulario;

/**
 * O usuario terá que acertar a tradução da palavra que o sistema apresentar para ele
 * 
 * @author Miguel Arcanjo
 */
public class ApresentaNome {
	
	public void apresentaNomes() {
		LeitorDeDados scanner = new LeitorDeDados();
		Vocabulario vocabulario = new Vocabulario();

		vocabulario.instrucoes();
		
		boolean loop = true;
		String digitado = "";
		int acertos = 0, erros = 0;

		while (loop) {
			loop = true;
			int tentativas = 0;
			for (String key : vocabulario.allWords().keySet()) {
				tentativas++;
				if (tentativas == 50 || tentativas == 100 || tentativas == 150  || tentativas == 200 || tentativas == 250 || tentativas == 300  || tentativas == 350
						             || tentativas == 400 || tentativas == 450  || tentativas == 500 || tentativas == 550 || tentativas == 600  || tentativas == 650 
						             || tentativas == 700 || tentativas == 750  || tentativas == 800 || tentativas == 850 || tentativas == 900  || tentativas == 950 ) {
					System.out.println("\n\nQuantidade de tentativas - \"" + tentativas);
//					System.out.println("Porcentagem de aceros até o momento - \"" + vocabulario.porcentagemAcerto(acertos, erros) + "\"\n\n");
					System.out.printf("Porcentagem de aceros até o momento - %.2f%%\n", vocabulario.porcentagemAcerto(acertos, erros));
					System.out.println("\n\n");
				}
				System.out.println("Qual a tradução da palavra - \"" + vocabulario.allWords().get(key) + "\"");
				digitado = scanner.pegarTextoCurto();
				if (digitado.toLowerCase().equals(key)) {
					vocabulario.mensagemAcertou();
					acertos++;
				} else if (digitado.toLowerCase().equals("close")) {
					System.out.println("\n---------------------------------------");
					vocabulario.mensagemFecharPrograma(acertos, erros);
					loop = false;
					break;
				} else {
					System.out.println("---------------------------------------");
					System.err.println("ERROU, a resposta era \"" + key + "\" Você digitou \"" + digitado + "\" ");
					System.out.println("---------------------------------------");
					erros++;
				}
			}
		}
		scanner.fecharLeitor();
	}

}
