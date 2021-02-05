package Enterface_Polimorfismo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe matricula: ");
		int matricula = ler.nextInt();
		System.out.println("informe seu nome: ");
		String nome = ler.next();
		System.out.println("Horas trabalhadas: ");
		int horas = ler.nextInt();
		System.out.println("Valor por horas trabalhadas: ");
		double valorHora = ler.nextDouble();
		System.out.println("vc é terceiro? S/N");
		char opcao = ler.next().toUpperCase().charAt(0);
		 	if(opcao == 'S') {
		 		System.out.println("Digite o valor de acrescimo: ");
		 		double acrescimo = ler.nextDouble();
		 		Empregado func1 = new Terceiro(nome,matricula,horas,valorHora, acrescimo);
		 		System.out.println("Matricula:"+ func1.getMatricula());
		 		System.out.println("Nome:"+ func1.getNome());
		 		System.out.println("Salário:"+ func1.salario());
		 		
		 		
		 		
		 		/*Terceiro info = new Terceiro(nome, matricula, horas, valorHora);
		 		info.salario();
		 		System.out.printf("Olá %s, sua matricula é %d , você trabalhou %d hora então seu salário é %f",info.getNome(),info.getMatricula(),info.getHoras(),info.salario());
		 		*/
		 	}
		 	else if(opcao == 'N') {
		 		Empregado func1 = new Empregado(nome, matricula, horas, valorHora);
		 		System.out.println("Matricula:"+ func1.getMatricula());
		 		System.out.println("Nome:"+ func1.getNome());
		 		System.out.println("Salário:"+ func1.salario());
		 		
		 	}
		
		
		

	}

}
