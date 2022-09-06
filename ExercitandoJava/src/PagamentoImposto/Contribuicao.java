package PagamentoImposto;

import java.util.ArrayList;
import java.util.List;

public class Contribuicao {

	public static void main(String[] args) {

		Pessoa pf1 = new PessoaFisica("Matilda", 65800, 1200);
		Pessoa pf2 = new PessoaFisica("Jorge", 36500, 1200);

		Pessoa pj1 = new PessoaJuridica("Riot Games", 2500000, 250);
		Pessoa pj2 = new PessoaJuridica("Kaspper", 1250000, 185);

		List<Pessoa> listaPessoas = new ArrayList<>();

		listaPessoas.add(pf1);
		listaPessoas.add(pf2);
		listaPessoas.add(pj1);
		listaPessoas.add(pj2);

		double soma = 0;

		for (Pessoa p:listaPessoas) {
			System.out.printf("%s%s%.2f%n", p.getNome(), " vai pagar o valor de: R$", p.calcularImposto());
			soma += p.calcularImposto();

		}

		System.out.printf("%s%.2f%n", "O total de imposto de renda vai ser de: R$", soma);
	}

}
