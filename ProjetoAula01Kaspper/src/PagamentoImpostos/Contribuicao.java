package PagamentoImpostos;

import java.util.ArrayList;
import java.util.List;

public class Contribuicao {

	public static void main(String[] args) {

//		instanciar:		

		Pessoa pf1 = new PessoaFisica("Diego", 50000, 1000);
		Pessoa pf2 = new PessoaFisica("Vitor", 80000, 1500);

//		System.out.printf("%s%s%.2f%n", pf1.getNome(), 
//		" vai pagar o valor de: R$", pf1.calcularImposto());
//		System.out.printf("%s%s%.2f%n", pf2.getNome(), 
//		" vai pagar o valor de: R$", pf2.calcularImposto());

		Pessoa pj1 = new PessoaJuridica("Kaspper", 250000, 46);
		Pessoa pj2 = new PessoaJuridica("Almeida SA", 860000, 200);

		System.out.println("--------------------------------------------");

//		System.out.printf("%s%s%.2f%n", pj1.getNome(), 
//		" vai pagar o valor de: R$", pj1.calcularImposto());
//		System.out.printf("%s%s%.2f%n", pj2.getNome(), 
//		" vai pagar o valor de: R$", pj2.calcularImposto());

		List<Pessoa> listaPessoas = new ArrayList<>();

//		String[] = {"casa", "banana", "abacaxi"};

		listaPessoas.add(pf1);
		listaPessoas.add(pf2);
		listaPessoas.add(pj1);
		listaPessoas.add(pj2);
		
		double soma = 0;
		
		for(Pessoa p:listaPessoas) {
			System.out.printf("%s%s%.2f%n", p.getNome(), 
					" vai pagar o valor de: R$", p.calcularImposto());
			soma += p.calcularImposto();
		}
		
		System.out.printf("%s%.2f%n", "O total de impostos vai ser de: R$", soma);

	}

}
