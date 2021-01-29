package aulas;

import java.util.Scanner;

public class MostrarPares_e_Impares {
	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		int contPares = 0;
		int contImpares = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um numero :");
			numero = leia.nextInt();
			if (numero % 2 == 0 && numero != 0) {
				contPares++;
			}
			if (numero % 2 != 0) {
				contImpares++;
			}

		}
		System.out.println("Os numeros Pares são: " + contPares);
		System.out.println("Os numeros Impares são: " + contImpares);
	}

}
