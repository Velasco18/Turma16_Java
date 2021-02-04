package Heranca;

public class Fornecedor extends Pessoa {
	private double  valorCredito; //(correspondente ao crédito máximo atribuído 
	private double valorDivida; //montante da dívida para com o fornecedor

	public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String telefone) {
		super(nome, telefone);
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	

}
