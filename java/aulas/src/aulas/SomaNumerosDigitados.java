package aulas;

import java.util.Scanner;

public class SomaNumerosDigitados {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados. (DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma = soma + numero;
			// soma += numero;

		} while (numero != 0);
		System.out.println("A soma dos numeros é: "+soma);
	}

}
