package Entidades;

public class Pessoa {
	public String nome;
	public double cpf;
	public char sexo;
	public int anoNascimento;
	public String endereco;
	public boolean estaVivo;
	
	public int idade() {
		
			return 2021 - anoNascimento;
	
	}
	public void mostarIdade() {
		System.out.println(2021 - anoNascimento);
	}
	public String statusIdade()
	{
		int idade;
		String mensagem;
		idade = 2021 - anoNascimento;
		if (idade <18) 
		{
			mensagem = "pessoa menor de 18 anos";
		} else
		{
			mensagem = "pessoa maior de 18 anos";
		}
		return mensagem;
	}
	
}
