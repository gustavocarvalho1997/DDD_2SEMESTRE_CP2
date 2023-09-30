package br.com.fiap.cp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cp2.interfaces.Dao;
import br.com.fiap.cp2.models.Aluno;

public class AlunoDao implements Dao{
	//Atributos
	private Connection conn;
	
	private static final String CADASTRAR = "INSERT INTO T_CP_ALUNO (CODIGO, NOME, SOBRENOME, CURSO, INSTITUICAO, ANO_INICIO)"
			+ " VALUES (SEQ_CP_ALUNO.NEXTVAL, ?, ?, ?, ?, ?)";
	
	//Construtor
	public AlunoDao(Connection conn) {
		this.conn = conn;
	}//AlunoDao
	
	//Parse
	
	//Cadastrar
	public void cadastrar(Aluno aluno) throws SQLException {
		PreparedStatement stm = conn.prepareStatement(CADASTRAR);
		stm.setString(1, aluno.getPrimeiroNome());
		stm.setString(2, aluno.getSobrenome());
		stm.setString(3, aluno.getCurso());
		stm.setString(4, aluno.getInstituicao());
		stm.setInt(5, aluno.getAnoDeInicio());
		
		stm.executeUpdate();
	}//Cadastrar
	//Listar
	public List<Aluno> listar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	//PesquisarPorCodigo
	public Aluno pesquisarPorCodigo(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	//Deletar
	public void deletar(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	//Atualizar
	public void atualizar(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
}//CLASS