
// uma superClasse -> Figura -> nome, cor -> calcularArea()
// subclasses -> retangulo
// 			     triangulo
// 			     circulo


// Interface -> FiguraInterface -> CalcularArea()
package Matematica;

public abstract class Figura implements FiguraInterface {
	
	
// figura é a superclass	
	
	private String nome;
	private String cor;
	
	public Figura(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}

// SuperClasse -> Animal
//			- cachorro; (subclasse)
//			- gato;
//			- pássaro


//SuperClasse -> ContaBancária - titular, numeroConta, numAg, saldo, etc
//							   - depositar(), sacar ()
//			- ContaCorrente
//			- ContaEspecial
//			- ContaPoupança
// TODAS as subclasses herdam os atributos e os métodos da superclasse,
// porem podem reescrever os metodos de acordo com suas caracteristicas especiais


// Interface - contrato assinado pela classe, onde sao listados todos os metodos que a classe
//é obrigada a implementar