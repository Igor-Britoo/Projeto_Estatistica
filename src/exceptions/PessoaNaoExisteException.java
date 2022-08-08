package exceptions;

import beans.Pessoa;

public class PessoaNaoExisteException extends Exception {

	private static final long serialVersionUID = -7310207631041941135L;
	private Pessoa pessoa;
	
	public PessoaNaoExisteException(Pessoa pessoa) {
		super("Essa pessoa nao participou da pesquisa");
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa(){
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}	
}
