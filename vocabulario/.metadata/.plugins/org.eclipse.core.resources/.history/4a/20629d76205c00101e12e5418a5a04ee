package br.com.vocabulario.controller;

import java.util.List;
import java.util.Random;

import br.com.vocabulario.dao.VocabularioDAO;
import br.com.vocabulario.model.VocabularioModel;

public class VocabularioController {
	private VocabularioDAO vocabularioDAO;

	public VocabularioController() {
		vocabularioDAO = new VocabularioDAO();
	}

	/**
	 * Inclui um dado em cada coluna do banco de dados
	 * 
	 * @param vocabulario
	 */
	public void cadastrar(VocabularioModel vocabulario) {
		vocabularioDAO.insert(vocabulario);
	}

	/**
	 * É capaz de atualizar os dados de uma linha do banco de dados, de acordo com o
	 * id que for passado
	 * 
	 * @param vocabulario
	 */
	public void atualizar(VocabularioModel vocabulario) {
		vocabularioDAO.update(vocabulario);
	}

	/**
	 * É capaz de excluir um dado do banco de dados
	 * 
	 * @param cd_id
	 */
	public void excluir(int id) {
		vocabularioDAO.delete(id);
	}

	/**
	 * Obtem todos dados do banco de dados (todas as colunas), ou seja, é um select
	 * all
	 * 
	 * @return List<VocabularioModel>
	 */
	public List<VocabularioModel> listarTudo() {
		return vocabularioDAO.selectAll();
	}

	/**
	 * Obtem 30 elementos do banco de dados
	 * 
	 * @return List<VocabularioModel>
	 */
	public List<VocabularioModel> listar30() {
		return vocabularioDAO.select30Elementos();
	}

	/**
	 * valida se existe o id
	 * 
	 * @return List<VocabularioModel>
	 */
	public boolean existeId(int id) {
		return vocabularioDAO.existeId(id);
	}

	/**
	 * ira pegar a traducao da palavra em ingles passada no parametro
	 * 
	 * @param nm_valor
	 * @return
	 */
	public String obtemPalavraPortugues(int id) {
		return vocabularioDAO.obtemPortugues(id);
	}

	/**
	 * Obtem uma palavra em inglês a partir do id que for passado
	 * 
	 * @param id
	 * @return VocabularioModel
	 */
	public String obtemPalavraIngles(int id) {
		return vocabularioDAO.obtemIngles(id);
	}

	/**
	 * Obtem todos os dados da tabela ingles no banco de dados
	 * 
	 * @return List<VocabularioModel>
	 */
	public List<VocabularioModel> obtemTodosIngles() {
		return vocabularioDAO.obtemTodosIngles();
	}

	/**
	 * ira pegar a traducao da palavra em ingles passada no parametro
	 * 
	 * @param nm_valor
	 * @return
	 */
	public VocabularioModel obtemId(String portugues) {
		return vocabularioDAO.validaCadastro(portugues);
	}

	/**
	 * Gera um numero aleatório onde será usado posteriormente para puxar o id do
	 * banco de dados
	 * 
	 * @return int
	 */
	public int aleatorizaSequencia() {
		VocabularioController vc = null;
		vc = new VocabularioController();
		int qtdElementos = vocabularioDAO.selectQtdElementosColuna();
		return vc.aleatorizacao(qtdElementos);
	}

	/**
	 * Este método retorna a quantidade de dados que existe dentro da tabela
	 * nm_valor no banco de dados
	 * 
	 * @return int
	 */
	public int selectQtdElementosTabela() {
		return vocabularioDAO.selectQtdElementosColuna();
	}

	/**
	 * Será recebido um numero como parametro <br>
	 * o algoritimo gerara um numero aleatorio entre 1 e o valor passado (incluindo
	 * o valor)<br>
	 * 
	 * @param qtdDados
	 * @return int
	 */
	public int aleatorizacao(int qtdDados) {
		Random random = new Random();
		return random.nextInt(qtdDados) + 1;
	}

}
