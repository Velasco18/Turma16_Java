package aulas;

import java.util.Scanner;

public class Media_multiplo3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero =0;
		int somatorio =0;
		int contador =0;
		double mediaNumerosM3 =0.00;
		
		do {
			System.out.println("Digite o numero inteiro positivo: ");
			numero = teclado.nextInt();
			if(numero%3 ==0) {
				somatorio =somatorio + numero;
				contador++;
				
			}
		}
		while(numero !=0);
		if(contador!=0) {
		//	med
			
		}

	}

}
