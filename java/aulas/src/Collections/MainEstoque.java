package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEstoque {
	
		public static void main(String[] args) {
			List <Estoque> lista = new ArrayList<>();
			Scanner leia = new Scanner(System.in);
			int op = 1;
			int indice;
			int estoque;
			String produto;
			double preco;
			while(op!=0) {
				System.out.println("[INDICE][PRODUTO][PREÇO][ESTOQUE]");
				for(Estoque prod : lista) {
					System.out.printf("%d\t%s\t%.2f\t%d\n", lista.indexOf(prod),prod.getNome(), prod.getPreco(), prod.getEstoque());
				}
				System.out.printf("Escolha uma opção:\n"
						+ "1 - Adicionar\n"
						+ "2 - Alterar\n"
						+ "3 - Remover\n"
						+ "0 - Sair\n");
				op = leia.nextInt();

				switch(op) {
				case 1: 
					System.out.print("Produto: ");
					leia.nextLine();
					produto = leia.nextLine();
					System.out.print("Preço: ");
					preco = leia.nextDouble();
					System.out.print("Estoque: ");
					estoque = leia.nextInt();
					lista.add(new Estoque(produto, preco, estoque));
					break;
				case 2:
					if(!lista.isEmpty()) {
						System.out.println("Selecione um indice da lista para alterar:");
						indice = leia.nextInt();
						lista.remove(indice);
						System.out.print("Produto: ");
						leia.nextLine();
						produto = leia.nextLine();
						System.out.print("Preço: ");
						preco = leia.nextDouble();
						System.out.print("Estoque: ");
						estoque = leia.nextInt();
						lista.add(new Estoque(produto, preco, estoque));
						break;
					}else {
						System.out.println("O estoque está vazio.");
					}
				case 3:
					if(!lista.isEmpty()) {
						System.out.println("Selecione um indice da lista para remover:");
						indice = leia.nextInt();
						lista.remove(indice);					
					}else {
						System.out.println("A lista esta vazia.");
					}
				case 0:
					System.out.println("[INDICE][PRODUTO][PREÇO][ESTOQUE]");
					for(Estoque prod : lista) {
						System.out.printf("%d\t%s\t%.2f\t%d\n", lista.indexOf(prod),prod.getNome(), prod.getPreco(), prod.getEstoque());
					}
				}
			}
		}
	}
