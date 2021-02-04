package Heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
		
	
	public Pessoa() {
		super();
	}
	
	
	//* CONSTRUTOR PADRÃO */
	public Pessoa(String nome, String endereço, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereço;
		this.telefone = telefone;
		/* CONSTRUTOR COM 2 PARÂMETROS */
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
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	//Metodos
	


}
