package Heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
		
	
	public Pessoa() {
		super();
	}
	
	
	//* CONSTRUTOR PADR�O */
	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endere�o;
		this.telefone = telefone;
		/* CONSTRUTOR COM 2 PAR�METROS */
	}
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.endereco = telefone;
		
	}
	
	
		//Encapsulamento
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endereco;
	}
	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	//Metodos
	


}
