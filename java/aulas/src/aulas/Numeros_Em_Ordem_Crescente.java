package aulas;

import java.util.Scanner;

public class Numeros_Em_Ordem_Crescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1,numero2, numero3;
		int auxiliar;
		System.out.println("Digite o 1 numero: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o 2 numero: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o 3 numero: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2) {
			auxiliar = numero1;
			auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
			
		}
		if (numero2 > numero3) {
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;

        }
         
     
        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }
        System.out.println("Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);
      
			
		
			
		

	}

}
