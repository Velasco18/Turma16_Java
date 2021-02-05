package Enterface_Polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
		
	}

	@Override
	public String emitirSom() {
		
		return "Latir";
	}
	public void correr() {
		
	}
	
	

}
