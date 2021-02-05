package Enterface_Polimorfismo;

public class Terceiro extends Empregado{
	private double acrescimo;

	public Terceiro(String nome, int matricula, int horas, double valorHora) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
		
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	@Override
	public double salario() {
		return super.salario()* acrescimo+ super.salario();// 0.1
	}
	

}
