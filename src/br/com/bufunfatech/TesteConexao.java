package br.com.bufunfatech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TesteConexao {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", 
					"RM93863", "031188");		
			
			
			System.out.println("Banco Oracle FIAP conectou!");
			
			conexao.close();
			
		} catch (SQLException e) {
			System.err.println("N�o Foi poss�vel conectar no BD Oracle FIAP.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC n�o foi encontrado...");
			e.printStackTrace();			
		}
	}

}
