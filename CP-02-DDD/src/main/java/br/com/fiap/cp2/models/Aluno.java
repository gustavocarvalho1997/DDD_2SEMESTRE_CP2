package br.com.fiap.cp2.models;

public class Aluno {
	//Atributos
	private int codigo;
	private String primeiroNome, sobrenome, curso;
	private int idade, anoDeInicio;
	//Construtor
	public Aluno(int codigo, String primeiroNome, String sobrenome, String curso, int idade, int anoDeInicio) {
		super();
		this.codigo = codigo;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.curso = curso;
		this.idade = idade;
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
	public int getIdade() {
		return idade;
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
	public void setIdade(int idade) {
		this.idade = idade;
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