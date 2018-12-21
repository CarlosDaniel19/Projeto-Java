package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Notebook;
import util.Conexao;

public class NotebookDAO {

	public static Notebook inserir(String serialNote, String modelo, String descricao, int estoque,
			double precoUnitario, String figura, String dataCadastro) {
		Notebook notebook = null;
		try {
			String sql = "insert String Notebook (serialNote, modelo, descricao, estoque, precoUnitario, figura, dataCadastro) values (?, ?, ?, ?, ?, ?, ?)";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/infonote?useTimezone=true&serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver", "jeffrey", "password");

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);
			comando.setString(2, modelo);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}

	public static Notebook[] buscarTodos() {
		Notebook[] notebook = null;

		try {
			String sql = "Select * from notebook";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/infonote?useTimezone=true&serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver", "root", "1234");

			Connection con = conex.obterConexao();

			Statement comando = con.createStatement();

			ResultSet rs = comando.executeQuery(sql);

			notebook = new Notebook[10];

			int i = 0;
			while (rs.next()) {
				notebook[i++] = new Notebook(rs.getString("serialNote"), rs.getString("modelo"),
						rs.getString("descricao"), rs.getInt("estoque"), rs.getDouble("precoUnitario"),
						rs.getString("figura"), rs.getString("dataCadastro"), rs.getInt("idNote"));

			}
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}

	public static Notebook excluir(int idNote, String serialNote) {
		Notebook notebook = null;
		try {
			String sql = "delete from Notebook where SerialNote = ?";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/infonote?useTimezone=true&serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver", "jeffrey", "password");

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, serialNote);
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}

	public static Notebook atualizar(int idNote, String serialNote, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		Notebook notebook = null;
		try {
			String sql = "update notebook set descricao = ?, estoque = ?, precoUnitario = ?, figura = ?  where note = ? ";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver", "jeffrey", "password");

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, idNote);
			comando.setString(2, serialNote);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);
			

			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}
}