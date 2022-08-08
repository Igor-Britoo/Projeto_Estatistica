import java.util.Scanner;

import beans.Escolaridade;
import beans.Pessoa;
import beans.Raca;
import beans.Sexo;
import dados.RepositorioPessoas;
import exceptions.PessoaJaExisteException;
import exceptions.PessoaNaoExisteException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(1, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
								"Padeiro", 1500.5, 2, 0, 1.7, 65.4);
		Pessoa p2 = new Pessoa(5, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
				"Padeiro", 1500.5, 2, 0, 1.7, 65.4);
		
		RepositorioPessoas repositorioPessoas = new RepositorioPessoas();
		
		try {
			repositorioPessoas.adicionarPessoa(p1);
			repositorioPessoas.adicionarPessoa(p2);
		} catch (PessoaJaExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		repositorioPessoas.listarPessoas();
		System.out.println("//////////////////////////");
		try {
			repositorioPessoas.removerPessoa(p1);
		} catch (PessoaNaoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repositorioPessoas.listarPessoas();

		
	}
/*
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
*/	
}
