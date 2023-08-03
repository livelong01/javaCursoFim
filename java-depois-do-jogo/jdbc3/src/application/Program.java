package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;



public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			/*
			 * Conn = serve para conectar com o servidor
			 * st = para alterar o banco de dados.
			 * O que esta em maiusculo, é o comando SQL.
			 * OU SEJA, INSERT INTO ( adicione na tabela "seller")
			 * Em baixo segue os campos que serao adc informacao.
			 * "VALUES" INDICA O LOCAL PARA ADC OS VALORES DE CADA CAMPO
			 * E as interrogacoes, sao tipos coringas. QUe ficam em espera
			 * para por fim adc as informacoes em cada campo um outro momento.
			 */
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DEpartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)");
			/*
			 * Nesse caso abaixo, o numero "1" representa a primeira "?"
			 * e do lado o valor a ser adc. 
			 * Lembrando que st. set deve ser do tipo que sera adc. Nesse caso, 
			 * uma STRING.
			 */
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000);
			st.setInt(5, 4);
			
			/*
			 * No fim, precisamos executar a atualizacao, 
			 * com isso se usa a funcao st.executeUpdate()
			 * ela retornara um numero inteiro, mostrando
			 * quantas linhas foram alteradas da tabela.
			 * Por isso o professor, fez uma variavel int
			 * chamada rowsAffected para mostrar o resultado
			 * de linhas alteradas.
			 */
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected );
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
