package BANK16;

public class Poupanca extends Conta{
	private int diaAniversario;

	public Poupanca(String numero, String cpf) {
		super(numero, cpf);
		
	}

	public int getDataAniversario() {
		return diaAniversario;
	}

	public void setDataAniversario(int dataAniversario) {
		this.diaAniversario = dataAniversario;
	}
	public void aniversario(int dia) {
		
		double correcao = super.getsaldo()*0.005;
		if(dia == diaAniversario) {
			
			super.Creditar();
			System.out.println();
			
		}
		
	}

}
