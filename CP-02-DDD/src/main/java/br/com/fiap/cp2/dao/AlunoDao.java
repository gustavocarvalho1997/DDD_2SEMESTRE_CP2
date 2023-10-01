package br.com.fiap.cp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cp2.exceptions.CodeNotFoundException;
import br.com.fiap.cp2.interfaces.AlunoDaoInterface;
import br.com.fiap.cp2.models.Aluno;

public class AlunoDao implements AlunoDaoInterface{
	//Atributos
	private Connection conn;
	
	private static final String CADASTRAR = "INSERT INTO T_CP_ALUNO (CODIGO, NOME, SOBRENOME, CURSO, INSTITUICAO, ANO_INICIO)"
			+ " VALUES (SEQ_CP_ALUNO.NEXTVAL, ?, ?, ?, ?, ?)";
	private static final String LISTAR = "SELECT * FROM T_CP_ALUNO ORDER BY CODIGO";
	private static final String PESQ_CD = "SELECT * FROM T_CP_ALUNO WHERE CODIGO = ?";
	private static final String DELETAR = "DELETE FROM T_CP_ALUNO WHERE CODIGO = ?";
	
	//Construtor
	public AlunoDao(Connection conn) {
		this.conn = conn;
	}//AlunoDao
	
	//Parse INICIO
	private Aluno parse(ResultSet rs) throws SQLException{
		int codigo = rs.getInt("CODIGO");
		String primeiroNome = rs.getString("NOME");
		String sobrenome = rs.getString("SOBRENOME");
		String curso = rs.getString("CURSO");
		String instituicao = rs.getString("INSTITUICAO");
		int anoDeInicio = rs.getInt("ANO_INICIO");
		Aluno aluno = new Aluno(codigo, primeiroNome, sobrenome, curso, instituicao, anoDeInicio);
		return aluno;
	}//Parse FIM
	
	//Cadastrar INICIO
	public void cadastrar(Aluno aluno) throws SQLException {
		PreparedStatement stm = conn.prepareStatement(CADASTRAR);
		stm.setString(1, aluno.getPrimeiroNome());
		stm.setString(2, aluno.getSobrenome());
		stm.setString(3, aluno.getCurso());
		stm.setString(4, aluno.getInstituicao());
		stm.setInt(5, aluno.getAnoDeInicio());
		
		stm.executeUpdate();
	}//Cadastrar FIM
	
	//Listar INICIO
	public List<Aluno> listar() throws SQLException {
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<Aluno> lista = new ArrayList<Aluno>();
		while(rs.next()) {
			Aluno aluno = parse(rs);
			lista.add(aluno);
		}
		return lista;
	}//LISTAR FIM
	
	//PesquisarPorCodigo INICIO
	public Aluno pesquisarPorCodigo(int codigo) throws SQLException, CodeNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_CD);
		stm.setInt(1, codigo);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new CodeNotFoundException("Código do aluno não localizado!");
		} else {
			Aluno aluno = parse(rs);
			return aluno;
		}
	}//PesquisarPorCodigo FIM
	
	//Deletar INICIO
	public void deletar(int codigo) throws SQLException, CodeNotFoundException {
		pesquisarPorCodigo(codigo);
		PreparedStatement stm = conn.prepareStatement(DELETAR);
		stm.setInt(1, codigo);
		
		stm.executeUpdate();
	}//Deletar FIM
	
	//Atualizar INICIO
	public void atualizar(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}//Atualizar FIM
	
	
	
	
	
	
	
	
}//CLASS