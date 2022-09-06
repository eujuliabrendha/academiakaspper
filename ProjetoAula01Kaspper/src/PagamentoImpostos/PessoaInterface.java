package PagamentoImpostos;

public interface PessoaInterface {
	
	public double calcularImposto();

}


// 1 criar o pessoainterface;
// 2 criar pessoa, implements pessoainterface;
// a classe q implementa a interface escreve os metodos 
// mas a superclasse pessoa vai utilizar o abstract 
//pra tirar a responsabilidade dela e passar 
//para as suas subclasses;
// 3 fazer o construct da subclasse pessoa;
// 4 gerar gettters and setters;
//	superclasse pronta;
// 5 criar primeira subclass; 
// 6 extender ela a superClass;
// 7 fazer o constructer e adicionar o atributo gastosComSaude;
// 8 sobrepor o calculo implementando o metodo calculando o imposto;
// 9 gerar o gett and sett;
// subclass pronta;
// 10 gerar subclass seguinte
// 11 adicionar o constructer
// 12 adicionar atributo numeroFuncionarios;
// 13 sobrepor o calculo implementando o metodo calculando o imposto;
// 14 gerar o gett and sett;
// subclass pronta;
// 11 gerar classe com metodo main;
// 