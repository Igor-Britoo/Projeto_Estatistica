package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import beans.Pessoa;
import exceptions.PessoaJaExisteException;

public class RepositorioPessoas {
	//Armazena os dados num arquivo para manipula-los em java
	private ArrayList<Pessoa> repositorioPessoas;
	private String filename;
	
	@SuppressWarnings("unchecked")
	public RepositorioPessoas(String filename) {
    	this.repositorioPessoas = new ArrayList<Pessoa>();
    	this.filename = filename;
    	
    	Object listaPessoas = RepositorioFileUtil.lerArquivoPessoas(this.filename); 
        
        if (listaPessoas != null && listaPessoas instanceof List<?>){
            this.repositorioPessoas = (ArrayList<Pessoa>) listaPessoas;
        }
	}

	public ArrayList<Pessoa> getRepositorioPessoas() {
		return repositorioPessoas;
	}
	public void setRepositorioPessoas(ArrayList<Pessoa> repositorioPessoas) {
		this.repositorioPessoas = repositorioPessoas;
	}
	

	public void adicionarPessoa(Pessoa pessoa) throws PessoaJaExisteException{
		if(!this.existePessoa(pessoa)) {
			this.repositorioPessoas.add(pessoa);
		}
		else {
			throw new PessoaJaExisteException(pessoa);
		}
		RepositorioFileUtil.salvarArquivoPessoas(repositorioPessoas, this.filename);

	}
	
	public List<Pessoa> listar() {
		return Collections.unmodifiableList(this.repositorioPessoas);
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
