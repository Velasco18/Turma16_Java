package Heranca;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	public Operario(){
		super();
	}
	public Operario(String nome,String endereco, String telefone){
		super(nome,endereco,telefone);
	
		//(nome, endereco, telefone);
	} 
	

	
	public double salarioOperario() {
		return valorProducao*(1+(comissao/100));
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
