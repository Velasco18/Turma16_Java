package Entidades;

import java.util.Scanner;


public class Adega {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		Pessoa cliente = new Pessoa();	
		System.out.println("Informe seu nome ");
		cliente.nome = leia.next();
		System.out.println("Informe ano de Nascimento [aaaa]: ");
		cliente.anoNascimento = leia.nextInt();
		
			if(cliente.anoNascimento < 18) {
				System.out.println("\nDesculpe não podemos vender bebidas a menores de 18 naos!");
			}
			else if(cliente.anoNascimento > 18){
				System.out.println(" Escolhe suas  bebidas");
				
			}
	}

}
/*if(sexo=='M'||sexo=='m'){
	tratamento = "Sr.";
		 }
else if( sexo=='F'|| sexo=='f'){
	tratamento="Sra.";
}
else
{
	tratamento="Srx.";	
}
*/