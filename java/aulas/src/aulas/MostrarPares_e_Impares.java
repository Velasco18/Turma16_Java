package aulas;

import java.util.Scanner;

public class MostrarPares_e_Impares {
	/*
	 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
		System.out.println("Os numeros Pares s�o: " + contPares);
		System.out.println("Os numeros Impares s�o: " + contImpares);
	}

}
