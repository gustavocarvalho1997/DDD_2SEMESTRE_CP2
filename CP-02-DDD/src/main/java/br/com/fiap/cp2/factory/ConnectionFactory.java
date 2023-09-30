package br.com.fiap.cp2.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection(String usuario, String senha) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
				usuario, senha);
		return conn;
	}//getConnection
	
}//CLASS