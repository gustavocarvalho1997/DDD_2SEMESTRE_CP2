package br.com.fiap.cp2.view;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fiap.cp2.dao.AlunoDao;
import br.com.fiap.cp2.factory.ConnectionFactory;
import br.com.fiap.cp2.models.Aluno;

public class Terminal {
	public static void main(String[] args) {
		try {
			String usuario = "RM552466";
			String senha = "160297";
			Connection conn = ConnectionFactory.getConnection(usuario, senha);
			AlunoDao dao = new AlunoDao(conn);
			
			while(true) {
				JOptionPane.showConfirmDialog(null, "Bem vindo(a), a seguir serão mostradas as opções de interação com o banco de dados criado!");
				
			}
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}//MAIN
}//CLASS