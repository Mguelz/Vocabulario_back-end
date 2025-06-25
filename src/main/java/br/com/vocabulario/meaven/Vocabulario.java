package br.com.vocabulario.meaven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Vocabulario {
	/**
	 * Criando e adicionando elementos num map que contem tanto a tradução da
	 * palavra quanto a palavra em ingles  
	 * 
	 * @return map
	 * @author Miguel Arcanjo
	 */
	public Map<String, String> allWords() {
		Map<String, String> map = new HashMap<>();
		map.put("fundamental", "elementary");
		map.put("cada", "each");
		map.put("inicio", "beginning");
		map.put("conteudo", "contents");
		map.put("escolher", "choose");
		map.put("fazer", "made");
		map.put("destinado", "intended");
		map.put("medir", "measure");
		map.put("utilizacao", "usage");
		map.put("quais", "which");
		map.put("guia", "guide");
		map.put("funciona", "works");
		map.put("deixar", "give");
		map.put("ativo", "active");
		map.put("promove", "promotes");
		map.put("formulario", "forms");
		map.put("recursos", "features");
		map.put("variar", "differ");
		map.put("acordo", "deal");
		map.put("ensinou", "taught");
		map.put("dirigido", "addressed");
		map.put("perto", "near");
		map.put("bem", "well");
		map.put("chuveiro", "shower");
		map.put("inverno", "winter");
		map.put("local", "site");
		map.put("falar", "tell");
		map.put("carne", "meat");
		map.put("pao", "bread");
		map.put("a_partir", "starting");
		map.put("manteiga", "butter");
		map.put("novo_e_folha", "breand_new");
		map.put("riacho", "creek");
		map.put("rio", "river");
		map.put("lago", "lake");
		map.put("piscina", "pool");
		map.put("suficiente", "enough");
		map.put("sempre", "always");
		map.put("roubar", "steal");
		map.put("xingar", "course");
		map.put("morrendo_de_fome", "starving");
		map.put("atrasar", "late");
		map.put("labios", "lips");
		map.put("cavalo", "hourse");
		map.put("graveto", "stick");
		map.put("vidro", "glass");
		map.put("vender", "sell");
		map.put("mar", "sea");
		map.put("atualmente", "currently");
		map.put("seguradora", "insurance");
		map.put("nasceu", "born");
		map.put("vivo", "alive");
		map.put("manter", "keep");
		map.put("oculos", "glasses");
		map.put("emprestar", "lend");
		map.put("parceiros", "partners");
		map.put("forte", "stronger");
		map.put("monitoramento", "tracking");
		map.put("manter", "remain");
		map.put("doente", "sick");
		map.put("sozinho", "alone");
		map.put("instalacao", "facilaty");
		map.put("significar", "mean");
		map.put("quente", "warm");
		map.put("monitorar", "monitor");
		map.put("confiante", "confident");
		map.put("voou", "flew");
		map.put("escondido", "hiding");
		map.put("estranho", "weird");
		map.put("assegurar", "assure");
		map.put("inesquecivel", "unforgettable");
		map.put("ficar", "stay");
		map.put("juntos", "together");
		map.put("tubo", "tube");
		map.put("solto", "loose");
		map.put("lei", "law");
		map.put("menos", "less");
		map.put("com_medo", "afraid");
		map.put("parafusar", "screw");
		map.put("prateleira", "shelf");
		map.put("barba", "beard");
		map.put("movimentadas", "bustling");
		map.put("correndo", "rushed");
		map.put("diariamente", "daily");
		map.put("recados", "errands");
		map.put("fresco", "fresh");
		map.put("artesanal", "handmade");
		map.put("artesanato", "crafts");
		map.put("palpite", "hunch");
		map.put("trazendo", "bringing");
		map.put("ambos", "both");
		map.put("preso", "stuck");
		map.put("arrepios", "creeps");
		map.put("feliz", "glad");
		map.put("inteligente", "smart");
		map.put("noivo", "groom");
		map.put("uniao", "togetherness");
		map.put("perdoar", "forgive");
		map.put("puxado", "pulled");
		map.put("filho", "son");
		map.put("substituir", "replace");
		map.put("roubou", "stole");
		map.put("carne_de_porco", "pork");
		map.put("voltando", "comming_back");
		map.put("encontro", "meeting");
		map.put("procurar", "find");
		map.put("ouvir", "hear");
		map.put("xadrez", "chess");
		map.put("montar", "ride");
		map.put("cavaleiro", "knight");
		map.put("tempestade", "storm");
		map.put("dispositivos", "devices");
		map.put("acima", "above");
		map.put("alvo", "target");
		map.put("poder", "might");
		map.put("chegar", "arrive");
		map.put("viajar", "travel");
		map.put("vendido", "sould");

		map.put("morto", "dying");
		map.put("procesos", "suit");
		map.put("anel", "ring");
		map.put("bastante", "quite");
		map.put("me_perguntando", "wondering");
		map.put("gostaria", "would");
		map.put("louco", "nuts");
		map.put("parece", "seems");
		map.put("poderia", "could");
		map.put("escuridao", "blackness");
		map.put("preso", "trapped");
		map.put("queimar_se", "burn_up");
		map.put("entrada", "entry");
		map.put("forcada", "forcible");

		map.put("duvida", "doubts");
		map.put("limpeza", "clearing");
		map.put("acontecendo", "happening");
		map.put("desde_que", "since");
		map.put("que", "than");

		map.put("entao", "then");
        map.put("cuidado", "careful");
        map.put("cuspir", "spit");
        map.put("aumentar", "increase");
        map.put("assustado", "scared");
        map.put("oculos_de_protecao", "goggles");
        map.put("avaliacoes", "ratings");
        map.put("pertence", "belongs");
        map.put("magoar", "hurt");
        map.put("errado", "wrong");
        map.put("imprevisto", "unforeseen");
        map.put("todo", "every");
        map.put("podre", "rotten");
        map.put("ira", "wrath");
        map.put("raiva", "anger");
        map.put("buscar", "seek");
        map.put("erros", "mistakes");
        map.put("matar", "slay");
        map.put("despedido", "fired");
        map.put("claro", "sure");
        map.put("mesma", "same");
        map.put("caso_contrario", "otherwise");
        map.put("tocou", "rang");
        map.put("perigoso", "dangerous");
        map.put("oracoes", "prayer");
        map.put("gritar", "yell");
        map.put("bonito", "pretty");
        map.put("prejudicando", "jeopardizing");
        map.put("campainha", "bell");
        map.put("pelo_menos", "anyway");
        map.put("cheiro", "smell");
        map.put("incrivel", "awesome");
        map.put("entendi", "figured");
        map.put("cuidado", "careful");
        map.put("cidade", "town");
        map.put("toque", "ringing");
        map.put("se_importa", "cares");
        map.put("conhecimento", "knowledge");
        map.put("alimentacao", "feed");
        map.put("vestir", "wear");
        map.put("sujo", "dirty");
        map.put("devo", "shall");
        map.put("sumir", "vanish");
        map.put("suave", "smooth");
        map.put("cartoes_postais", "postcards");
        map.put("vizinho", "neightbor");
        map.put("desobedecer", "disobey");
        map.put("praticamente", "nearly");
        map.put("seguranca", "safety");
        map.put("calcada", "sidewalk");
        map.put("mais_proximo", "closest");
        map.put("casado", "married");
        map.put("dormindo", "asleep");
        map.put("aparecer", "appear");
        map.put("instantaneo", "snapshot");
        map.put("razao", "reason");
        map.put("emitir", "issue");
        map.put("serio", "kidding");
        map.put("pena", "pity");
        map.put("perder_tempo", "dawdle");
        map.put("sair", "leave");
        map.put("vergonha", "shame");
        map.put("descascado", "peeled");
        map.put("apoio", "endorsement");
        map.put("recursos", "assets");
        map.put("marca", "branding");
        map.put("aparecem", "appear");
        map.put("naquele", "that");
        map.put("mentiras", "lies");
        map.put("camadas", "layer");
        map.put("permite", "allows");
        map.put("mesmo", "same");
        map.put("aumentando", "increase");
        map.put("se", "whether");
        map.put("crescido", "grown");
        map.put("perseguir", "pursuit");
        map.put("ultimamente", "lately");
        map.put("ressurgimento", "resurgence");
        map.put("tipos", "kinds");
        map.put("rica", "rich");
        map.put("auge", "heyday");
        map.put("objetivos", "goals");
        map.put("aniversario", "birth");
        map.put("postura", "stances");
        map.put("vacilou", "faltered");
        map.put("fronteira", "frontier");
        map.put("sombrio", "bleake");
        map.put("possibilitando", "enabling");
        map.put("avaliada", "evaluated");
        map.put("por_isso", "thus");
        map.put("crescente", "growing");
        map.put("direcionado", "aimed");
        map.put("culpa", "blame");
        map.put("mais_amplo", "wider");
        map.put("responsabilidade", "accountability");
        map.put("inundacao", "flood");
        map.put("decisao", "ruling");
        map.put("garantir", "ensure");
        map.put("funcionarios", "employees");
        map.put("prejudicando", "harming");
        map.put("demissoes", "layoff");
        map.put("cair", "fell");
        map.put("divulgada", "disclosed");
        map.put("dentro", "withing");
        map.put("merecer", "deserve");
        map.put("acionar", "trigger");
        map.put("dificuldade", "trouble");
        map.put("ligacao", "bound");
        map.put("amantes", "lovers");
        map.put("culpado", "guility");
        map.put("traficante_de_drogas", "drug_diler");
        map.put("irrita", "vexes");
        map.put("piscar", "blink");
        map.put("sotaque", "accente");
        map.put("exibindo", "displaying");
        map.put("culpa", "blame");
        map.put("ambicao", "greed");
        map.put("com_medo", "afraid");
        map.put("ausente", "missing");
        map.put("preocupar", "worry");
        map.put("avanco", "breakthrough");
        
        map.put("desejo", "desire");
        map.put("dor", "pain");
        map.put("mentindo", "lying");
        map.put("chifres", "horns");
        map.put("susto", "scare");
        map.put("obrigacao", "duty");
        map.put("entediante", "boring");
        map.put("desculpas", "apologise");
        map.put("chateado", "upset");
        map.put("mentira", "lie");
        map.put("jurar", "swear");
        map.put("injusto", "unfair");
        map.put("bala", "bullet");
        map.put("ataque", "raid");
        map.put("leilao", "auction");
        map.put("ciumes", "jealous");
        map.put("ultimamente", "lately");
        map.put("pior", "worst");
        map.put("querer", "want");
        map.put("sozinho", "lonely");
        map.put("lutando", "strugglin");
        map.put("brincando", "kiding");
        map.put("qualquer", "either");
        map.put("fe", "faith");
        map.put("refeicao", "meal");
        map.put("pior", "worse");
        map.put("preocupar", "worry");
        map.put("parentes", "kindred");
        map.put("brevemente", "briefly");
        map.put("cicatrizes", "scars");
        map.put("peao", "pawn");
        map.put("bigode", "stache");
        map.put("punicao", "punishment");
        map.put("pior", "worst");
        map.put("prazer", "pleasure");
        map.put("quase", "almost");
        map.put("troca", "exchange");
        map.put("doce", "sweet");
        map.put("eu_melhorei", "i_got_better");
        
        map.put("remedios", "meds");
        map.put("esperanca", "hope");
        map.put("farol", "lighthouse");
        map.put("caido", "fallen");
        map.put("bagunca", "mess");
        map.put("alegria", "glee");
        map.put("culpa", "blame");
        map.put("inferno", "hell");
        map.put("desempregado", "helpless");
        map.put("machucado", "hurt");
        map.put("peito", "chest");
        map.put("espuma", "foam");
        map.put("baguncado", "messed_up");
        map.put("orgulhoso", "proud");
        map.put("tumulo", "grave");
        map.put("lamina", "blade");
        map.put("palpite", "hunch");
        map.put("esconderijo", "hiding");
        map.put("arma", "weapon");
        map.put("corte", "slash");
        map.put("ceu", "heaven");
        map.put("alcancou", "reached");
        map.put("premios", "prizes");
        map.put("abracar", "embrace");
        map.put("mais_longe", "further");
        map.put("local", "venue");
        map.put("paralisando", "stalling");
        map.put("chateando", "upset");
        map.put("milagre", "miracle");
        map.put("fervente", "boiling");
        map.put("caminho", "path");
        map.put("paz", "peace");
        map.put("queria", "wanted");
        map.put("superar", "outweigh");
        map.put("muito", "far");
        map.put("tentando", "tempted");
        
        map.put("liberdade", "freedom");
        map.put("era_uma_vez", "once_upon_a_time");
        map.put("fornecimento", "supply");
        map.put("nobre", "noble");
        map.put("pior", "worse");
        map.put("longe", "away");
        map.put("rir", "laught");
        map.put("compromisso", "appointmant");
        map.put("aterrorizante", "terrifying");
        map.put("diretor", "warden");
        map.put("boneca", "doll");
        map.put("bolsa", "purse");
        map.put("estranho", "uncanny");
        map.put("em_breve", "soon");
        map.put("falhas", "flaws");
        map.put("terceiro", "third_party");
        map.put("vale", "worth");
        map.put("aproveita", "leverages");
        map.put("de_fato", "indeed");
        map.put("fugir", "flee");
        map.put("taxa", "fee");
        map.put("aquecido", "heated");
        map.put("horrivel", "awful");
        map.put("pedaco", "piece");
        map.put("conscientizacao", "awareness");
        map.put("garantindo", "ensuring");
        map.put("avaliando", "assessing");
        map.put("contra", "against");
        map.put("dentro", "within");
        map.put("padroes", "standards");
//      24/03/2025
        map.put("melhorar", "improve");
        map.put("garantir", "ensuring");
        map.put("rapido", "quick");
        map.put("sinais", "signs");
        map.put("explodido", "burst");
        map.put("de_repente", "suddenly");
        map.put("vitimas", "casualties");
        map.put("fornecer", "supply");
        map.put("pedacos", "pieces");
        map.put("alegar", "claim");
        map.put("cego", "blind");
        map.put("mais_facil", "easiest");
        map.put("armazenamento", "storing");
        map.put("desperdicio", "waste");
        map.put("alma", "soul");
        map.put("raizes", "roots");
        map.put("abracos", "hugs");
        map.put("cifra", "cipher");
        map.put("ordem", "order");
        map.put("semente", "seed");
        map.put("solucao_de_problemas", "trobleshooting");
//      07/05/2025
        map.put("reconhecido", "recognized");
        map.put("sofrer", "suffer");
        map.put("culpa", "fault");
        map.put("resposta", "reply");
        map.put("multidao", "mob");
        map.put("quimica", "chemistry");
        map.put("estrutura", "framework");
        map.put("faisca", "spark");
        map.put("capa", "cloak");
        map.put("apostar", "bet");
        map.put("querida", "honey");
        map.put("timido", "shy");
        map.put("volume", "bulk");
        map.put("truques", "tricks");
        map.put("amplamente", "widely");
        map.put("implantado", "deployed");
        map.put("simplificar", "streamline");
        map.put("tambem_e", "is_also");
//		20/06/2025
        map.put("ganhou", "gained");
        map.put("derrubar", "takedown");
        map.put("indesejavel", "undesirable");
        map.put("aprimorado", "enhanced");
        map.put("com_estado", "stateful");
        map.put("porta_de_entrada", "gateway");
        map.put("unicamente", "solely");
        map.put("impedimento", "implied");
        map.put("olhando", "looking");
        map.put("sofisticado", "higher_end");
        map.put("tratamento", "handling");
        map.put("momento", "point");
        map.put("complementado", "supplemented");
        map.put("assinado", "signed");
        map.put("vinculativo", "binding");
        map.put("medo", "fear");
        map.put("descuido", "carelessness");
        map.put("bruto", "raw");
        map.put("invadir", "break");
        map.put("mergulho_profundo", "deeper_dive");
        map.put("inumeras", "countless");
        map.put("resumo", "digest");
        map.put("conceder", "grant");
        map.put("quantidade", "amount");

        
		map = aleatorizarElementos(map);
		return map;
	}

	/**
	 * Apresenta ao usuario uma mensagem de acerto
	 */
	public void mensagemAcertou() {
		System.out.println("---------------------------------------");
		System.out.println("Parabéns!!! você ACERTOU");
		System.out.println("---------------------------------------");
	}
	/**
	 * No momento em que for chamada Retorna a porcentagem de acertos 
	 */
	public	double porcentagemAcerto(int acertos, int erros) {
		return ((double) acertos / (acertos + erros)) * 100;
	}

	/**
	 * Apresenta ao usuario uma mensagem que o programa fechou
	 */
	public void mensagemFecharPrograma(int acertos, int erros) {
		double porcentagemAcertosFinal = porcentagemAcerto(acertos, erros);
		System.out.println("\n---------------------------------------");
		System.out.println("\nVoce acertou " + acertos + " e errou " + erros);
		System.out.printf("Essa Foi sua Porcentagem de Acertos - %.2f%%\n", porcentagemAcertosFinal);
		System.out.println("\n---------------------------------------");
		System.out.println("\nO Programa Fechou!");
	}

	/**
	 * Reinbaralhando a sequencia do HashMap, tornando todas as vezes que rodar o
	 * código, a sequencia das palavras iram ser aleatorias
	 * 
	 * @param Map<String, String> map
	 * @return novoMap
	 * @author Miguel com a ajuda do Wiu
	 */
	private static Map<String, String> aleatorizarElementos(Map<String, String> map) {
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		List<String> chaves = new ArrayList<String>(map.keySet());
		Collections.shuffle(chaves);
		chaves.forEach(e -> novoMap.put(e, map.get(e)));
		return novoMap;
	}

	/**
	 * instruções iniciais para orientação de como escrever as palavras e outras
	 * orientações de: como parar o programa e ver a quantidade de palavras
	 * acertadas e erradas
	 * 
	 */
	public void instrucoes() {
		System.out.println("-----------------------------INSTRUÇÕES INICIAIS-------------------------------------------\n");
		System.out.println("1. TODAS AS PALAVRAS TERÃO QUE SER DIGITADAS EM CAIXA BAIXA");
		System.out.println("   EXEMPLO: for --> para");
		System.out.println("2. A SEPARACAO ENTRE AS PALAVRAS É \"_\" E NÃO UM \"ESPAÇO\"");
		System.out.println("   EXEMPLO: around --> em_torno_de");
		System.out.println("3. A ACENTUAÇÃO DAS PALAVRAS SERÃO IGNORADAS, ENTÃO DIGITE COMO SE NÃO TIVESSE ACENTUAÇÃO");
		System.out.println("   EXEMPLO: bread --> pao");
		System.out.println("4. PARA PARAR O PROGRAMA DIGITE: \"close\"");
		System.out.println("5. DIGITE \"close\" QUANDO VOCE QUISER SABER QUANTAS PALAVRAS VOCE ACERTOU E ERROU");
		System.out.println("   APOS ESSE COMANDO VOCE IRA PARAR DE JOGAR");
		System.out.println("-------------------------------------------------------------------------------------------\n");

	}

}
