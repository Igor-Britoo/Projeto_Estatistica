package beans;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private int cpf;
	private int idade;
	private Sexo sexo;
	private Raca raca;
	private Escolaridade escolaridade;
	private String profissao;
	private float salario;
	private int numViagensAoExterior;
	private int numFilhos;
	private float altura;
	private float peso;
	
	public Pessoa() {};
	
	public Pessoa(int cpf, int idade, Sexo sexo, Raca raca, Escolaridade escolaridade, String profissao, float salario,
			int numViagensAoExterior, int numFilhos, float altura, float peso) {
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.raca = raca;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
		this.salario = salario;
		this.numViagensAoExterior = numViagensAoExterior;
		this.numFilhos = numFilhos;
		this.altura = altura;
		this.peso = peso;
	}

	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getNumViagensAoExterior() {
		return numViagensAoExterior;
	}
	public void setNumViagensAoExterior(int numViagensAoExterior) {
		this.numViagensAoExterior = numViagensAoExterior;
	}
	public int getNumFilhos() {
		return numFilhos;
	}
	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return this.cpf + " , " + this.idade + " , " + this.sexo.getSexo() + " , " +
				this.raca.getRaca() + " , " + this.escolaridade.getEscolaridade() + " , " + 
				this.profissao + " , " + this.salario + " , " + this.numViagensAoExterior + 
				" , " + this.numFilhos + " , " + this.altura + " , " + this.peso;
	}

	@Override
	public boolean equals(Object obj) {
		Pessoa p = (Pessoa)obj;
		return this.cpf == p.getCpf();
	}
}
