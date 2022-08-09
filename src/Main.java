import java.io.File;
import java.util.Locale;
import java.util.Scanner;

import beans.Escolaridade;
import beans.Pessoa;
import beans.Raca;
import beans.Sexo;
import dados.RepositorioFileUtil;
import dados.RepositorioPessoas;
import exceptions.PessoaJaExisteException;

public class Main {
	
	public static void formulario(Pessoa pessoa, Scanner input) {
		input.useLocale(Locale.US);
		
		//CPF-------------------------------------------------------------------------------
		System.out.println("Digite apenas os numeros do seu CPF");
		int cpf = input.nextInt();
		String cpfString = String.format("%d", cpf);
		while(cpfString.length()!=9 || (cpf-cpf)!=0) {
			System.out.println("CPF invalido, digite os numeros do seu CPF novamente");
			cpf = input.nextInt();
			cpfString = String.format("%d", cpf);
		}
		pessoa.setCpf(cpf);
		
		//IDADE-----------------------------------------------------------------------------
		System.out.println("Digite a sua idade");
		int idade = input.nextInt();
		while(idade<18 || idade>100 || idade-idade!=0) {
			System.out.println("Idade invalida, digite a sua idade novamente");
			idade = input.nextInt();
		}
		pessoa.setIdade(idade);
		
		//SEXO-------------------------------------------------------------------------------
		System.out.print("Digite o numero que corresponde ao seu sexo\n"
				+ "	1. Masculino\n" + "	2. Feminino\n");
		int sexoNumber = input.nextInt();
		while(sexoNumber<1 || sexoNumber>2) {
			System.out.print("Numero invalido, digite o numero que corresponde ao seu sexo novamente\n"
					+ "	1. Masculino\n	2. Feminino\n");
			sexoNumber = input.nextInt();
		}
		switch(sexoNumber) {
		case 1: pessoa.setSexo(Sexo.MASCULINO);
				break;
		case 2: pessoa.setSexo(Sexo.FEMININO);
				break;
		}
		
		//RACA-------------------------------------------------------------------------------
		System.out.println("Digite o numero que corresponde a sua raca\n"
				+ "	1. Preto\n"
				+ "	2. Pardo\n"
				+ "	3. Branco\n"
				+ "	4. Amarelo\n"
				+ "	5. Indigena\n");
		int racaNumber = input.nextInt();
		while(racaNumber<1 || racaNumber>5) {
			System.out.println("Numero invalido, digite o numero que corresponde a sua raca novamente\n"
					+ "	1. Preto\n"
					+ "	2. Pardo\n"
					+ "	3. Branco\n"
					+ "	4. Amarelo\n"
					+ "	5. Indigena\n");
			racaNumber = input.nextInt();
		}
		switch(racaNumber){
		case 1: pessoa.setRaca(Raca.PRETO);
				break;
		case 2: pessoa.setRaca(Raca.PARDO);
				break;
		case 3: pessoa.setRaca(Raca.BRANCO);
				break;
		case 4: pessoa.setRaca(Raca.AMARELO);
				break;
		case 5: pessoa.setRaca(Raca.INDIGENA);
				break;
		}
		
		//ESCOLARIDADE------------------------------------------------------------------------
		System.out.println("Digite o numero que corresponde a sua escolaridade\n"
				+ "	1. Ensino Fundamental Completo\n"
				+ "	2. Ensino Medio Incompleto\n"
				+ "	3. Ensino Medio Completo\n"
				+ "	4. Ensino Superior Incompleto\n"
				+ "	5. Ensino Superior Completo");
		int escolaridadeNumber = input.nextInt();
		while(escolaridadeNumber<1 || escolaridadeNumber>5) {
			System.out.println("Numero invalido, digite o numero que corresponde a sua escolaridade novamente\n"
					+ "	1. Ensino Fundamental Completo\n"
					+ "	2. Ensino Medio Incompleto\n"
					+ "	3. Ensino Medio Completo\n"
					+ "	4. Ensino Superior Incompleto\n"
					+ "	5. Ensino Superior Completo");
			escolaridadeNumber = input.nextInt();
		}
		switch(escolaridadeNumber){
		case 1: pessoa.setEscolaridade(Escolaridade.FUNDAMENTAL_COMPLETO);
				break;
		case 2: pessoa.setEscolaridade(Escolaridade.MEDIO_INCOMPLETO);
				break;
		case 3: pessoa.setEscolaridade(Escolaridade.MEDIO_COMPLETO);
				break;
		case 4: pessoa.setEscolaridade(Escolaridade.SUPERIOR_INCOMPLETO);
				break;
		case 5: pessoa.setEscolaridade(Escolaridade.SUPERIOR_COMPLETO);
				break;
		}
		//PROFISSAO---------------------------------------------------------------------------
		String getChar = input.nextLine();
		System.out.println("Digite sua profissao\n");
		String profissao = input.nextLine();
		pessoa.setProfissao(profissao);
		
		//SALARIO-----------------------------------------------------------------------------
		System.out.println("Digite seu salario separando os centavos com um ponto\n");
		float salario = input.nextFloat();
		while((salario-salario)!=0) {
			System.out.println("Valor invalido, digite seu salario novamente\n");
			salario = input.nextFloat();
		}
		pessoa.setSalario(salario);
		
		//NUMERO DE VIAGENS AO EXTERIOR--------------------------------------------------------
		System.out.println("Digite o numero de viagens que voce ja fez ao exterior\n");
		int numViagens = input.nextInt();
		while((numViagens-numViagens)!=0) {
			System.out.println("Numero invalido, digite o numero de viagens que voce ja fez ao exterior novamente\n");
			numViagens = input.nextInt();
		}
		pessoa.setNumViagensAoExterior(numViagens);
		
		//NUMERO DE VIAGENS AO EXTERIOR--------------------------------------------------------
		System.out.println("Digite o numero de filhos que voce tem\n");
		int numFilhos = input.nextInt();
		while((numFilhos-numFilhos)!=0) {
			System.out.println("Numero invalido, digite o numero de filhos que voce tem novamente\n");
			numFilhos = input.nextInt();
		}
		pessoa.setNumFilhos(numFilhos);
		
		//ALTURA-------------------------------------------------------------------------------
		System.out.println("Digite sua altura separando os centimetros com um ponto\n");
		float altura = input.nextFloat();
		while((altura-altura)!=0) {
			System.out.println("Altura invalida, digite sua altura novamente\n");
			altura = input.nextFloat();
		}
		pessoa.setAltura(altura);
		
		//PESO---------------------------------------------------------------------------------
		System.out.println("Digite seu peso separando as gramas com um ponto\n");
		float peso = input.nextFloat();
		while((peso-peso)!=0) {
			System.out.println("Peso invalido, digite seu peso novamente\n");
			peso = input.nextFloat();
		}
		pessoa.setPeso(peso);
		
		System.out.println(pessoa.toString());
		
	}

	public static void main(String[] args) {
		
		RepositorioPessoas repositorioPessoas = new RepositorioPessoas("repositorio-pessoas");
		Scanner input = new Scanner(System.in);
		boolean whileCondicional = true;
		
		while(whileCondicional) {
			System.out.println("");
			Pessoa p = new Pessoa();
			formulario(p, input);
			try {
				repositorioPessoas.adicionarPessoa(p);
			} catch (PessoaJaExisteException e) {
				e.printStackTrace();
			}
			System.out.println("Digite 1 para cadastrar outra pessoa\n");
			int num = input.nextInt();
			if(num!=1)whileCondicional = false;
		}
		input.close();
				
		File repositoriotxt = new File("repositorio.txt");
		RepositorioFileUtil.criarArquivoStrings(repositoriotxt, repositorioPessoas);
		System.out.println(RepositorioFileUtil.lerArquivoStrings(repositoriotxt));
		
		
		/*DEBUG///////////////////////////////////////////////////////////////////////////////////////
		 
		RepositorioPessoas repositorioPessoas = new RepositorioPessoas("repositorio-pessoas");
		File repositoriotxt = new File("repositorio.txt");
		
		Pessoa p1 = new Pessoa(18, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
								"jogador", 1500, 2, 0, 2, 69);
		Pessoa p2 = new Pessoa(7, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
								"programador", 1500, 2, 0, 1, 68);
		Pessoa p3 = new Pessoa(1, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
								"Desenvolvedor", 1500, 2, 0, 1, 70);
		Pessoa p4 = new Pessoa(2, 10, Sexo.MASCULINO, Raca.INDIGENA, Escolaridade.SUPERIOR_COMPLETO,
								"Padeiro", 1500, 2, 0, 2, 65);
		
		try {
			repositorioPessoas.adicionarPessoa(p1);
			repositorioPessoas.adicionarPessoa(p2);
			repositorioPessoas.adicionarPessoa(p3);
			repositorioPessoas.adicionarPessoa(p4);
		} catch (PessoaJaExisteException e) {
			e.printStackTrace();
		}
		
		for(Pessoa p : repositorioPessoas.listar()) {
			System.out.println(p.toString());
		}
		System.out.println("\n///////////////////////////////////////\n");
		RepositorioFileUtil.criarArquivoStrings(repositoriotxt, repositorioPessoas);
		System.out.println(RepositorioFileUtil.lerArquivoStrings(repositoriotxt));
	*/
		
	}

}
