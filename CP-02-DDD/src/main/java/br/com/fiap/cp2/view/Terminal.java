package br.com.fiap.cp2.view;

import java.sql.Connection;

import br.com.fiap.cp2.dao.AlunoDao;
import br.com.fiap.cp2.factory.ConnectionFactory;
import br.com.fiap.cp2.models.Aluno;

public class Terminal {
	public static void main(String[] args) {
		try {
			String usuario = "RM552466";
			String senha = "160297";
			Connection conn = ConnectionFactory.getConnection(usuario, senha);
			
			Aluno a = new Aluno("Gustavo", "Carvalho", "Desenvolvimento de Sistemas", "FIAP", 2023);
			AlunoDao dao = new AlunoDao(conn);
			
			dao.cadastrar(a);
			System.out.println("Cadastrado com sucesso");
			System.out.println(dao.listar());
			System.out.println("listagem feita com sucesso");
			System.out.println(dao.pesquisarPorCodigo(1));
			System.out.println("Pesquisa por código feita com sucesso!");
			dao.deletar(1);
			System.out.println(dao.listar());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}//MAIN
}//CLASS