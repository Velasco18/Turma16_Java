package aulas;

import java.util.Scanner;

public class ExercioMaior_Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua Idade: ");
		idade = ler.nextInt();
		
		if(idade <= 10 || idade  <=14) {
			System.out.println(" Pertence a categoria Infantil");
			
		}
		else if(idade <= 15 || idade  <=17) {
			System.out.println(" Pertence a categoria Juvenil");
			
		}
		else if(idade <= 18 || idade  <=25) {
			System.out.println(" Pertence a categoria Adulto");
		}
		
		else {
			System.out.println(" Sem categoria");
		}

	}

}
