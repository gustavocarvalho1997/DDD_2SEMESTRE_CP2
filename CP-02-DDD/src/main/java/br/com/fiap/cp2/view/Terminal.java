package br.com.fiap.cp2.view;

import java.sql.Connection;
import java.util.List;

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
			
			JOptionPane.showConfirmDialog(null, "Bem vindo(a), a seguir serão mostradas as opções de interação com o banco de dados criado!");
			while(true) {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para selecionar sua opção:\n1 - Cadastrar um aluno\n2 - Listar os alunos\n3 - Pesquisar um aluno pelo seu código\n4 - Deletar um aluno do banco pelo seu respectivo código\n5 - Atualizar as informações de um aluno\n6 - Sair"));
				if (opcao == 1) {
					String primeiroNome = JOptionPane.showInputDialog("Informe o primeiro nome do aluno: ");
					String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome do aluno:");
					String curso = JOptionPane.showInputDialog("Informe o curso do aluno:");
					String instituicao = JOptionPane.showInputDialog("Informe a instituição de ensino:");
					int anoDeInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de início desse aluno:\n Ex: 2023"));
					Aluno aluno = new Aluno(primeiroNome, sobrenome, curso, instituicao, anoDeInicio);
					dao.cadastrar(aluno);
					System.out.println("Cadastro efetuado com sucesso!");
				} else if (opcao == 2) {
					List<Aluno> alunos= dao.listar();
					for(Aluno a : alunos) {
						System.out.println(a.retornarInfoFormatadas());
					}
				} else if (opcao == 3 ) {
					int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do aluno"));
					Aluno aluno = dao.pesquisarPorCodigo(codigo);
					System.out.println(aluno.retornarInfoFormatadas());
				} else if (opcao == 4) {
					int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do aluno que deseja efetuas a exclusão do registro:"));
					dao.deletar(codigo);
					System.out.println("Registro deletado com sucesso!");
				} else if (opcao == 5) {
					int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do aluno que serão atualizadas as informações:"));
					String primeiroNome = JOptionPane.showInputDialog("Informe o primeiro nome do aluno: ");
					String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome do aluno:");
					String curso = JOptionPane.showInputDialog("Informe o curso do aluno:");
					String instituicao = JOptionPane.showInputDialog("Informe a instituição de ensino:");
					int anoDeInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de início desse aluno:\n Ex: 2023"));
					Aluno aluno = new Aluno(codigo, primeiroNome, sobrenome, curso, instituicao, anoDeInicio);
					dao.atualizar(aluno);
				} else if (opcao == 6) {
					break;
				} else {
					System.out.println("Opção selecionada não reconhecida!");
				}
			}//While
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}//MAIN
}//CLASS