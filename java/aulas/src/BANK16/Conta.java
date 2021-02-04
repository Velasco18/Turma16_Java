package BANK16;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;
	//public double valor;
	
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	public String getnumero() {
		return numero;
		
	}
	public String getcpf() {
		return cpf;
	}
	public double getsaldo() {
		return saldo;
	}
	public void Debitar(double valor) {
		
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println(saldo);
			
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void Creditar() {
		System.out.println(saldo);
	}
	

}
