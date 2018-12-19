package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Notebook;
import model.Pedido;
import util.Conexao;
import util.Teclado;

public class NotebookDAO {

	public static Notebook inserir(String serialNote, String modelo, String descricao, int estoque,
			double precoUnitario, String figura, String dataCadastro) {
		Notebook notebook = null;
		try {
			String sql = "insert int contato (nome, email, mensagem) values (?, ?, ?)";

			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC",
					"com.mysql.cj.jdbc.Driver", "jeffrey", "password");

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contato;
	}

}
