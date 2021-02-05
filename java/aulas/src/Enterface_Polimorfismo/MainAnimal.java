package Enterface_Polimorfismo;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro("Boyka", 0);
		Cavalo cavalo1 = new Cavalo("Drâgo", 9 );
		Preguica preguica1 = new Preguica("Sid", 10);

		Animal[] animais = new Animal[3];
		animais[0] = cao1;
		animais[1] = cavalo1;
		animais[2] = preguica1;

		for(Animal animal:animais) {
			System.out.println(animal.emitirSom() );
		}
	}
		
		

	

}
