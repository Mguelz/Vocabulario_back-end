package br.com.vocabulario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vocabulario.conexao.Conexao;
import br.com.vocabulario.model.VocabularioModel;

public class VocabularioDAO {
	/**
	 * Insere no banco de dados um par de palavras
	 * 
	 * @param vocabulario
	 */
	public void insert(VocabularioModel vocabulario) {
		String sql = "INSERT INTO pares (portugues, ingles) VALUES (?, ?)";
		try {
			Connection conexao = Conexao.connect();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, vocabulario.getPortugues());
			stmt.setString(2, vocabulario.getIngles());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Lista todos os pares de valores que possui no banco de dados
	 * 
	 * @return Todos os parse de valores do banco
	 */
	public List<VocabularioModel> selectAll() {
		List<VocabularioModel> vocabularioCompleto = new ArrayList<>();
		String sql = "SELECT * FROM pares ORDER BY id ASC";

		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				VocabularioModel vocabulario = new VocabularioModel();
				vocabulario.setId(rs.getInt("id"));
				vocabulario.setIngles(rs.getString("portugues"));
				vocabulario.setPortugues(rs.getString("ingles"));
				vocabularioCompleto.add(vocabulario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vocabularioCompleto;
	}

	/**
	 * Lista uma quantidade personalizada de valores que elementos do banco de dados
	 * 
	 * @return 30 pares
	 */
	public List<VocabularioModel> select30Elementos() {
		List<VocabularioModel> vocabularioCompleto = new ArrayList<>();
		String sql = "SELECT * FROM pares ORDER BY id ASC LIMIT 30";

		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				VocabularioModel vocabulario = new VocabularioModel();
				vocabulario.setId(rs.getInt("id"));
				vocabulario.setIngles(rs.getString("portugues"));
				vocabulario.setPortugues(rs.getString("ingles"));
				vocabularioCompleto.add(vocabulario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vocabularioCompleto;
	}

	/**
	 * Obtem a quantidade de dados em uma coluna
	 * 
	 * @return
	 */
	public int selectQtdElementosColuna() {
		String sql = "SELECT COUNT(ingles) AS qtd_elementos FROM pares";
		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			if (rs.next()) {
				return rs.getInt("qtd_elementos");
			}

		} catch (SQLException e) {
			System.err.println("Erro ao contar elementos: " + e.getMessage());
		}
		return 0; // retorna 0 se não houver resultado ou erro
	}

	/**
	 * obtem a palavra em ingles do @ID passado no parametro
	 * 
	 * @param nm_valor
	 * @return List<VocabularioModel>
	 */
	public String obtemIngles(int id) {
		String sql = "SELECT ingles FROM pares WHERE id = ?";
		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					String palavra = rs.getString("ingles");
					return (palavra != null && !palavra.isEmpty()) ? palavra : "vazio";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "nao_encontrado";
	}

	/**
	 * obtem a palavra em portugues do @ID passado no parametro
	 * 
	 * @param nm_valor
	 * @return List<VocabularioModel>
	 */
	public String obtemPortugues(int id) {
		String sql = "SELECT portugues FROM pares WHERE id = ?";
		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					String palavra = rs.getString("portugues");
					return (palavra != null && !palavra.isEmpty()) ? palavra : "vazio";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "nao_encontrado";
	}

	/**
	 * Obtem todos os dados da coluna ingles
	 * 
	 * @return
	 */
	public List<VocabularioModel> obtemTodosIngles() {
		List<VocabularioModel> valorCompleto = new ArrayList<>();
		String sql = "SELECT ingles FROM pares";

		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				VocabularioModel vocabulario = new VocabularioModel();
				vocabulario.setIngles(rs.getString("ingles"));
				valorCompleto.add(vocabulario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return valorCompleto;
	}

	/**
	 * Valida se realmente foi inserido no banco os dados do usuario
	 * 
	 * @param portugues
	 * @return
	 */
	public VocabularioModel validaCadastro(String portugues) {
		VocabularioModel vocModel = new VocabularioModel();
		String sql = "SELECT id, portugues, ingles FROM `pares` WHERE portugues = ?";
		int id = 0;
		String portuguesBanco, inglesBanco = null;
		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql)) {
			stmt.setString(1, portugues);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					id = rs.getInt("id");
					portuguesBanco = rs.getString("portugues");
					inglesBanco = rs.getString("ingles");
					vocModel.setId(id);
					vocModel.setPortugues(portuguesBanco);
					vocModel.setIngles(inglesBanco);
					return vocModel;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vocModel;

	}

	/**
	 * atualiza os dados da tabela pares atravez do ID passado
	 * 
	 * @param vocabulario
	 */
	public void update(VocabularioModel vocabulario) {
		String sql = "update pares set portugues = ?, ingles = ? where id = ?";
		try {
			PreparedStatement stmt = Conexao.connect().prepareStatement(sql);
			stmt.setString(1, vocabulario.getPortugues());
			stmt.setString(2, vocabulario.getIngles());
			stmt.setInt(3, vocabulario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * exclui uma linha do banco de dados atravez do ID passado
	 * 
	 * @param id
	 */
	public void delete(int id) {
		String sql = "delete from pares where id = ?";
		try {
			PreparedStatement stmt = Conexao.connect().prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Valida se o ID passado exsite
	 * 
	 * @param id
	 * @return
	 */
	public boolean existeId(int id) {
		String sql = "SELECT 1 FROM pares WHERE id = ? LIMIT 1";
		try (PreparedStatement stmt = Conexao.connect().prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				return rs.next(); // retorna true se encontrou alguma linha
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
