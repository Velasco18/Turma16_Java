package Heranca;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;
	
	private Administrador() {
		super();
		
	}
	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
