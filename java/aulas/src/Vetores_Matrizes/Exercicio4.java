package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*4.Crie um programa que receba valores do usuário para preencher uma matriz
		 *  3X3, e em seguida, exiba a soma dos valores dela e 
		 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */

		 
		    {
		        Scanner leitor = new Scanner(System.in);

		        int soma = 0, somaDiagonal = 0;

		        int[][] matrizQuadrada = new int[3][3];

		        for (int linha = 0; linha < 3; linha++)
		        {
		            for (int coluna = 0; coluna < 3; coluna++) 
		            {
		                System.out.print("Matriz[" + linha + "][" + coluna + "]: ");
		                matrizQuadrada[linha][coluna] = leitor.nextInt();

		            }
		            System.out.println();
		        }

		        for (int linha = 0; linha < 3; linha++)
		        {
		            for (int coluna = 0; coluna < 3; coluna++) 
		            {
		                // soma = soma + matrizQuadrada[linha][coluna];
		                soma += matrizQuadrada[linha][coluna];
		            }
		        }

		        for (int i = 0; i < 3; i++)
		        {
		            somaDiagonal += matrizQuadrada[i][i];
		        }

		        System.out.println("A soma de todos os elementos é de: " + soma);
		        System.out.println("A soma de todos os elementos da diagonal é de: " + somaDiagonal);
		    }
	}}
