package aulas;

import java.util.Scanner;

public class Oi {
	
	public static void main(String[]args) {
		
		
		//Em Portugol � escreva("Ol� Mundo ")
		//System.out.println("Ol� Mundo!");
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		System.out.println("Entre com o valor de A:");
		a = ler.nextInt();
		System.out.println("Entre com o valor B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println("A soma foi de: "+soma);
		
	}
}
