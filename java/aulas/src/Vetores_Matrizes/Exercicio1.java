package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1.Fa�a um programa que crie um vetor por leitura com 5 valores
		 *  de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s 
		 *  a maior pontua��o e a apresente. 
		 */
			Scanner leia = new Scanner(System.in);
			int valores[] = new int[5];
			int maiorValor =0;
			
			for(int i = 0; i < 5; i++) {
				System.out.print("Digite o valor da pontua��o: ");
				valores[i] = leia.nextInt();
				if(maiorValor < valores[i]) {	// se caso o maior valor estiver como principal
					maiorValor = valores[i];	//nenhum outro menor que ele � aceito na fun��o
				}
			}
			System.out.print("Os numeros digitados foram: ");
				for(int i =0; i <5; i ++) {
					System.out.print(" " + valores[i]);
					
				}
				System.out.println("\nO maior numero digitado foi o: " + maiorValor);
	}

}
