package Entidades;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		ContaBancaria contaB = new ContaBancaria(0263,"Itau",59333);
		 
			
			System.out.printf("\nAgencia: "+contaB.agencia + ""+"\nInstituição: "+contaB.titular+ ""+"\nNumero Conta: "+contaB.numeroConta);
			

	}

}
