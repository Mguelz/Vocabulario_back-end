package br.com.vocabulario.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:mysql://localhost:3306/Vocabulario";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection connection;

	/**
	 * Conecta com o banco de dados
	 * 
	 * @return
	 */
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
//				System.out.println("Connected to the database!");				
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed to connect to the database!");
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Desconecta com o banco de dados
	 */
	public static void disconnect() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Disconnected from the database!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Testa conexão como banco
	 */
//	public static void main(String[] args) {
//		Connection conn = Conexao.connect();
//		Conexao.disconnect();
//	}
}