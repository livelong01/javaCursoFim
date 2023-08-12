package application;

import java.awt.image.DataBufferByte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;



public class Program {

	public static void main(String[] args) {
		
		/*
		 * Atualizar o salario de um vendedor na base de dados.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			/*
			 * A MESMA COISA DO ANTERIOR, o comando DELETE é mt perigoso
			 * se nao colocar a condicional "Where" vai deletar todos os
			 * dados do DEPARTMENT.
			 * Para a delecao rolar, ela nao pode estar vinculado a nada.
			 * Por ex: se tiver algum seler com o id desse departamento 
			 * vinculado, ele dará um erro. Por isso o DbIntegrityException
			 * foi criado, para personalizar esse tipo de erro. O erro é
			 * do tipo referencial, qd vc deleta algo q esta referenciado
			 * por outro dado.
			 * Caso o departamento n esteja vinculado a nada, ele sera deletado
			 * sem problemas.
			 * 
			 */
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 2);

			int rownsAffected = st.executeUpdate();
			
			System.out.println("Done ROws Affected: " + rownsAffected);
			
		}
		catch ( SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();		}
	}
}