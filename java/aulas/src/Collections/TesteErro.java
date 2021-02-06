package Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		try {

			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");// {"ed","rafao","milton"}
			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � " + vetor[posicao]);
			
			} 
		catch (java.lang.ArrayIndexOutOfBoundsException erro1) {
			System.out.println("Amig�o, tu digitou um tamanho de indice errado!!!");

		} 
		catch (InputMismatchException erro) {
			System.out.println("Voc� n�o digitou a variavel certa!");
		} 
		finally {
			System.out.println("Voce precisa tratar bem suas informa��es.");
		}

		System.out.println("Fim de programa!!!!");
	}

}
