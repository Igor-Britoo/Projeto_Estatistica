package dados;

import java.util.ArrayList;

import beans.Pessoa;
import exceptions.PessoaJaExisteException;

public class RepositorioPessoas {
	//Armazena os dados num arquivo para manipula-los em java
	private ArrayList<Pessoa> repositorioPessoas;
	//Armazena os dados num arquivo para utiliza-los no R
	private ArrayList<String> repositorioString;
	
	public RepositorioPessoas() {
    	this.repositorioPessoas = new ArrayList<Pessoa>();
		this.repositorioString = new ArrayList<String>();
	}

	public ArrayList<Pessoa> getRepositorioPessoas() {
		return repositorioPessoas;
	}
	public void setRepositorioPessoas(ArrayList<Pessoa> repositorioPessoas) {
		this.repositorioPessoas = repositorioPessoas;
	}
	
	public ArrayList<String> getRepositorioString() {
		return repositorioString;
	} 	

	public void setRepositorioString(ArrayList<String> repositorioString) {
		this.repositorioString = repositorioString;
	}

	public void adicionarPessoa(Pessoa pessoa) throws PessoaJaExisteException{
		if(!this.existePessoa(pessoa)) {
			this.repositorioPessoas.add(pessoa);
			this.repositorioString.add(pessoa.toString());
		}
		else {
			throw new PessoaJaExisteException(pessoa);
		}
	}
	
	public void listarPessoas() {
		for(Pessoa p : this.repositorioPessoas) {
			System.out.println(p.toString());
		}
	}
	
	public boolean existePessoa(Pessoa pessoa){
		boolean existe = false;
		for(Pessoa p: this.repositorioPessoas) {
			if(p.equals(pessoa)) {
				existe=true;
				break;
			}
		}
		return existe;
	}

}
