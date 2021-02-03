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
	
}
