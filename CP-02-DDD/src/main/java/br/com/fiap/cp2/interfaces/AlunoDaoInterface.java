package br.com.fiap.cp2.interfaces;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cp2.exceptions.CodeNotFoundException;
import br.com.fiap.cp2.models.Aluno;

public interface AlunoDaoInterface {
	public void cadastrar(Aluno aluno) throws SQLException;
	public List<Aluno> listar() throws SQLException;
	public Aluno pesquisarPorCodigo(int codigo) throws SQLException, CodeNotFoundException;
	public void deletar(int codigo) throws SQLException, CodeNotFoundException;
	public void atualizar(Aluno aluno) throws SQLException;
}//Interface