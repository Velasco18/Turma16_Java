package aulas;

import java.util.Scanner;

public class Exercicio_Idade {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos.Total de pessoas com mais de 50 anos. O programa termina quando idade
		 * for =-99. (WHILE)
		 */
		Scanner ler = new Scanner(System.in);
		int idade = 0, totalPessoasJovens = 0, totalPessoasAdulta = 0;

		while (idade <= 99) {
			System.out.println("Digite a Idade :");
			idade = ler.nextInt();
			if (idade < 21) {
				totalPessoasJovens++;
			}
			if (idade > 50) {
				totalPessoasAdulta++;

			}

		}
		System.out.println("O total de pessoas com menos de 21 anos são: " + totalPessoasJovens);
		System.out.println("O total de pessoas com mais de 50 anos são: " + totalPessoasAdulta);
	}

}
