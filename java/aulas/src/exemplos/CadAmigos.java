package exemplos;

import java.util.Scanner;

import Entidades.Pessoa;

public class CadAmigos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa brother1 = new Pessoa();	
		System.out.println("Digite o nome do brother");
		brother1.nome = leia.next();
		System.out.println("Digite M - Masculino ou F - Femenino: ");
		brother1.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite ano de Nascimento [aaaa]: ");
		brother1.anoNascimento = leia.nextInt();
			
		


	}

}
