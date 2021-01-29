import java.util.Scanner;

public class Soma_Até_Numero {
	/*
	 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos
	 * os números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28,
	 * pois 1+2+3+4+5+6+7=28. do while faça enquanto
	 * 
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, contador = 0, soma = 0;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		contador = numero;
		soma = numero;
		do {
			contador --;
			numero =numero + contador;
			soma = numero;
		} while (contador != 0);
		System.out.println("A soma é:" +soma);

	}

}
