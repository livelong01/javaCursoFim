package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;



public class Program {

	public static void main(String[] args) {
		
		/*
		 * O programa cria um comando onde ele altera o valor
		 * dos salarios dos vendedores do departamento 1 e 2. 
		 * Sendo que ocorre um "erro criado" de proposito 
		 * para crashar o programa dps de ele ter alterado a 
		 * o salario do porimeiro departamento. O teste quer
		 * ver se ele faz rollback ou se ele altera a primeira 
		 * parte e deixa a segunda igual.
		 *  
		 * No ""primeiro caso"", deu erro e ele alterou somente 
		 * a primeira parte. 
		 * 
		 * Segundo caso: foi criado o SetAutoCOmmit para nao 
		 * auto confirmar e confirmar a execucao antes de tudo 
		 * ter rodado sem erro. E no fim do codigo, adc um conn.commit para
		 * ser feita uma confirmacao manual. 
		 * 
		 * Por ultimo alterar o SqlException, adc um rollback. 
		 * ELe vai precisar de um try catch, adc e faça um erro
		 * personalizado. Caso de erro enquanto o programa tenta
		 * fazer o rollback, tmb tem q criar uma excepcao personalizada.
		 * 
		 * 
		 */
		Connection conn = null;
		
		
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);//bloqueia a confirmacao automatica.
			
			st = conn.createStatement();
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1" );
			
			/*
			int x = 1;
			if (x<2) {
				throw new SQLException("Fake error");
			}
			*/
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2" );
			
			conn.commit(); //Onde vai pedir confirmacao do usuario para atualizar.
			
			System.out.println("Rows1 = " + rows1);
			System.out.println("Rows2 = " + rows2);
		}
		catch ( SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();		}
	}
}