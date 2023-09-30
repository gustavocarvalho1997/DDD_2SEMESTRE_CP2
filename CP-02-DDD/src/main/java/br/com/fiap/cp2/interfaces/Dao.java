package br.com.fiap.cp2.interfaces;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cp2.models.Aluno;

public interface Dao {
	public void cadastrar(Aluno aluno) throws SQLException;
	public List<Aluno> listar() throws SQLException;
	public Aluno pesquisarPorCodigo(int codigo) throws SQLException;
	public void deletar(int codigo) throws SQLException;
	public void atualizar(Aluno aluno) throws SQLException;
}//Interface