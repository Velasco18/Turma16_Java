package Enterface_Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		
		return "Relinchar";
	}
	public void corre() {
		
	}
	
}
