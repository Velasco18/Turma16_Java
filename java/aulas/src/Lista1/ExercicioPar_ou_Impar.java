package Lista1;

import java.util.Scanner;

public class ExercicioPar_ou_Impar {

	public static void main(String[] args) {
	 int numero;
	 Scanner ler = new Scanner(System.in);
	 System.out.println("Digite um numero: ");
	 numero = ler.nextInt();
	 //
	 if(numero < 0) {
		 System.out.println("O numero que você digitou é negativo!");
		 
	 }
	 else if(numero ==0) {
		 System.out.println("O numero que você digitou é neutro!");
	 }
	 else if(numero % 2 ==0) {
		 System.out.println("O numero que você digitou é Par!");
		 
	 }
	 else {
		 System.out.println("O numero que você digitou é Impar!");
		 
	 }

	}

}
