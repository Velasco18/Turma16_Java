package aulas;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1,numero2,numero3;
		System.out.print("Digite primeiro numero:");
		numero1 = ler.nextInt();
		
		System.out.print("Digite segundo numero:");
		numero2 = ler.nextInt();
		
		System.out.print("Digite Terceiro numero:");
		numero3= ler.nextInt();
		
		if(numero1 > numero2 && numero1> numero3){
		System.out.print("O primeiro numero é o Maior ");
	
		}
		else if(numero2 > numero1 && numero2 > numero3){
			System.out.print("O Segundo numero é o Maior " );

		}
		else {
			System.out.println("O Terceiro numero é o Maior " );
		}
		//(numero3 > numero1 && numero3> numero2) 
			
		
}

	

}
