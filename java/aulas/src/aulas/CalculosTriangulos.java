package aulas;

import java.util.Locale;
import java.util.Scanner;

public class CalculosTriangulos {
	public static void main(String[] args)  	{ 
		
		Locale.setDefault(Locale.US); //define o tipo de padronização 
		//area = base * altura / 2 		
		Scanner leia = new Scanner(System.in);//instaciar = criar 	
		double base, altura, area;
		double base2, altura2, area2;
		double base3, altura3, area3;
		System.out.println("Digite a base do 1 triangulo: "); 
		base = leia.nextDouble(); 	
		System.out.println("Digite a altura do  1triangulo: "); 
		altura = leia.nextDouble(); 
		area = ((base * altura) / 2 ); 	
		System.out.printf("A area do triangulo informado é %.2f", area);
		System.out.println("\n---------------------------------------");
		System.out.println("Digite a base do 2 Trinagulo ");
		base2 = leia.nextDouble(); 
		System.out.println("Digite a altura do  2triangulo: "); 
		altura2 = leia.nextDouble();
		area2 = ((base2 * altura2) / 2 ); 
		System.out.printf("A area do triangulo informado é %.2f", area);
		
		//System.out.printf("A area do triangulo informado é %.2f", area);  	  
	}
}


