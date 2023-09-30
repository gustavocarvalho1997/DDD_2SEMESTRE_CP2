package br.com.fiap.cp2.view;

import java.sql.Connection;

import br.com.fiap.cp2.factory.ConnectionFactory;

public class Terminal {
	public static void main(String[] args) {
		try {
			String usuario = "RM552466";
			String senha = "160297";
			Connection conn = ConnectionFactory.getConnection(usuario, senha);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//MAIN
}//CLASS