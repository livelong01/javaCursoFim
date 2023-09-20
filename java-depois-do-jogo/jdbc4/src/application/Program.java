package application;

import java.awt.image.DataBufferByte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import db.DB;



public class Program {

	public static void main(String[] args) {
		
		/*
		 * Atualizar o salario de um vendedor na base de dados.
		 */
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			/*
			 * UPDATE  =  ATUALIZAR OS seller 
			 * Set, modificar a coluna BaseSalary e o "?" é o valor adc.
			 * NÃO ESQUECER DO WHERE!!!
			 * Ele é a condicional, sem ele todos os salarios serao modificados.
			 * UM DESESTRE!
			 * A condicao no caso, é : ONDE O DEPARTMENTID = "?" valor que darei 
			 * no futuro.
			 */
			
			st = conn.prepareStatement(
					 "UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
					
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
			
			int rownsAffected = st.executeUpdate();
			
			System.out.println("Done Rows Affected: " + rownsAffected);
			
		}
		catch ( SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();		}
	}
}