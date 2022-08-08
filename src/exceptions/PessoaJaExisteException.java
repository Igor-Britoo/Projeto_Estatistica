package exceptions;

import beans.Pessoa;

public class PessoaJaExisteException extends Exception{

	private static final long serialVersionUID = 243271438387886387L;
	private Pessoa pessoa;
	
	public PessoaJaExisteException(Pessoa pessoa) {
		super("Essa pessoa ja participou da pesquisa");
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}	

}
