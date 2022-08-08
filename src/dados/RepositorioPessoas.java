package dados;

import java.util.ArrayList;
import beans.Pessoa;
import exceptions.PessoaJaExisteException;
import exceptions.PessoaNaoExisteException;

public class RepositorioPessoas {
	private ArrayList<Pessoa> repositorioPessoas;
	
	public RepositorioPessoas() {
		this.repositorioPessoas = new ArrayList<Pessoa>();
	}

	public ArrayList<Pessoa> getRepositorioPessoas() {
		return repositorioPessoas;
	}
	public void setRepositorioPessoas(ArrayList<Pessoa> repositorioPessoas) {
		this.repositorioPessoas = repositorioPessoas;
	}
	
	public void adicionarPessoa(Pessoa pessoa) throws PessoaJaExisteException{
		if(!this.existePessoa(pessoa))this.repositorioPessoas.add(pessoa);
		else {
			throw new PessoaJaExisteException(pessoa);
		}
	}
	
	public void removerPessoa(Pessoa pessoa) throws PessoaNaoExisteException{
		if(this.existePessoa(pessoa))this.repositorioPessoas.remove(pessoa);
		else {
			throw new PessoaNaoExisteException(pessoa);
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
