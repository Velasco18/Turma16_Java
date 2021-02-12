package Tarefa1;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int ano, mes, dia, soma;
	System.out.print("Digite sua idade Atual: ");
	ano = scan.nextInt();
	System.out.print("Digite Meses: ");
	mes = scan.nextInt();
	System.out.print("Digite os dias: ");
	dia = scan.nextInt();
	soma =(ano* 365 + mes*30 + dia);
	System.out.println("\n Sua idade em dias é de: " + soma + "dias");
		
	}
	
	

}
