package Collections;

import java.util.Locale;
import java.util.Scanner;

import Enterface_Polimorfismo.Empregado;
import Enterface_Polimorfismo.Terceiro;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionarios {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Empregado> lista = new ArrayList<>();

		System.out.println("Digite o numero de empregados");
		int numero = leia.nextInt();
		for (int x = 1; x <= numero; x++) {
			System.out.println("Funcionario : " + x);

			System.out.print("Terceiro S/N :");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite a matricula :");
			int matricula = leia.nextInt();
			leia.nextLine();// limpeza do buffer de teclado
			System.out.print("Digite o nome :");
			String nome = leia.nextLine();
			System.out.print("Digite as horas trabalhadas: ");
			int horas = leia.nextInt();
			System.out.print("Digite o valor por hora trabalhada :");
			double valorHora = leia.nextDouble();

			if (op == 'S') {
				System.out.println("Digite o valor do acrescimo : ");
				double acrescimo = leia.nextDouble();
				lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));

			} else if (op == 'N') {
				lista.add(new Empregado(nome, matricula, horas, valorHora));
			}
		}
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregado emp : lista) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.salario()));
		}

	}

}
