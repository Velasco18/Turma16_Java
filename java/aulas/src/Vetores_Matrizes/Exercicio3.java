package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		int matriz1[][] = new int[4][6];
		int matriz2[][] = new int[4][6];
		int matriz3[][] = new int[4][6];

		for (int m = 0; m < 2; m++) {//fazer os dois laços de matriz duas vezes

			for (int l = 0; l < 4; l++) {
				for (int c = 0; c < 6; c++) {
					System.out.printf(" Insira o valor da matriz N%d, linha %d, coluna %d:",(m+1),l,c);
					if(m ==0) {
						matriz1[l][c] = leia.nextInt();
					}
					 if(m ==1) {
						matriz2[l][c] = leia.nextInt();
					}
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
				}

			}
		}
		for(int l=0;l<4;l++)
        {
            System.out.println();
            for(int c=0;c<6;c++)
            {
            System.out.printf(" | %d |",matriz3[l][c]);
            }
        }
	}

}
