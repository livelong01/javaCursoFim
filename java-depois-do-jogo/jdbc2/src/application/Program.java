package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement(); //criar uma variavel statement
			
			/*
			 * para poder usar o comando "executeQuery" e usar a string para
			 * criar comandos sql.
			 */
			rs = st.executeQuery("select * from department");
		
			/*
			 * Enquanto tiver conteudo na tabela, ou seja, 
			 * enquanto o rs.next for true ele vai ccontinuar 
			 * printando o conteudo da tabela, quando rs.next 
			 * for falso, n tiver mais linhas para ler. Ele
			 * vai ser falso e cancela o "while".
			 */
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
