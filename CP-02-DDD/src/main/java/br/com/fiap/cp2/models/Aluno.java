package br.com.fiap.cp2.models;

public class Aluno {
	//Atributos
	private int codigo;
	private String primeiroNome, sobrenome, curso, instituicao;
	private int anoDeInicio;
	//Construtor
	public Aluno(int codigo, String primeiroNome, String sobrenome, String curso, String instituicao, int anoDeInicio) {
		super();
		this.codigo = codigo;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.curso = curso;
		this.instituicao = instituicao;
		this.anoDeInicio = anoDeInicio;
	}//ALUNO
	//Getters
	public int getCodigo() {
		return codigo;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getCurso() {
		return curso;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public int getAnoDeInicio() {
		return anoDeInicio;
	}
	//Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setIdade(String instituicao) {
		this.instituicao = instituicao;
	}
	public void setAnoDeInicio(int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	//toString
	@Override
	public String toString() {
		return "Aluno [ Código: " + codigo + ", primeiroNome:" + primeiroNome + ", sobrenome: " + sobrenome + ", curso: "
				+ curso + " ]";
	}//toString
}//CLASS