package Heranca;

public class MainH {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("António","Avenida Ministro","11111-9999");
		Fornecedor fornecedor1 = new Fornecedor("Osvaldo","Praça da Repubrica","9999-0000", 0, 0);
		Empregado empregado1 = new Empregado("Ana","Rua Consolação","77777-7777");
		Administrador administrador1 = new Administrador("Mourinho","Rua da Massa","2222-6292");
		Operario operario1 = new Operario("Daniel","Rua jaquey","11113-9990");
		Vendedor vendedor1 = new Vendedor("Osvaldo","Rua Oswaldo Aranha","9090-44111S");
		
		fornecedor1.setValorCredito(50000);
		fornecedor1.setValorDivida(4000);
		
		empregado1.setCodigoSetor(1);
		empregado1.setSalarioBase(21000);
		empregado1.setImposto(30);
		
		administrador1.setAjudaDeCusto(10000);
		
		operario1.setValorProducao(50000);
		operario1.setComissao(50);
		
		
		
		vendedor1.setValorVendas(40000);
		vendedor1.setComissao(20);
		
		System.out.println(pessoa1.getNome()+" - "+pessoa1.getEndereço()+" - "+pessoa1.getTelefone());
		System.out.println();
		System.out.println(fornecedor1.getNome()+" - "+fornecedor1.getEndereço()+" - "+fornecedor1.getTelefone());
		System.out.println(fornecedor1.obterSaldo());
		System.out.println();
		System.out.println(empregado1.getNome()+" - "+empregado1.getEndereço()+" - "+empregado1.getTelefone());
		System.out.println(empregado1.calcularSalario());
		System.out.println();
		System.out.println(administrador1.getNome()+" - "+administrador1.getEndereço()+" - "+administrador1.getTelefone());
		System.out.println(administrador1.getAjudaDeCusto());
		System.out.println();
		System.out.println(operario1.getNome()+" - "+operario1.getEndereço()+" - "+operario1.getTelefone());
		System.out.println(operario1.salarioOperario());
		System.out.println();
		System.out.println(vendedor1.getNome()+" - "+vendedor1.getEndereço()+" - "+vendedor1.getTelefone());
		System.out.println(vendedor1.salarioVendedor());
		
	}

}
