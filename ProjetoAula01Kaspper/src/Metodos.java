
public class Metodos {
	// ^ modificador de acesso

	public static void main(String[] args) {
		// ^ static: sign q n precisa ser intanciado;
		// void sem retorno

		impressao();
		mensagem("Estamos estudando Programação Orientada a Objeto.");
		System.out.println("O dobro do número é: " + dobro(20));
		System.out.println("O resultado é: " + calcular(2.3, 1.5));
		System.out.println("O resultado é: " + calcular(2, 1));
		System.out.println("O resultado é: " + calcular(2, 1, 5));

		double[] notas = { 8.9, 7.4, 5.6, 9 };
		System.out.println(notas.length);

		System.out.println("A médida das notas é: " + calcular(notas));
		System.out.printf("%s%.1f%s%n", "A média das notas é: ", calcular(notas), ". Parabéns.");
		System.out.println("O fatorial é : " + fatorial(8));
//  	%n troca de linha	
	
	}

	// metodo sem retorno e sem passagem de parâmetro

	// metodo = função

	public static void impressao() {
		System.out.println("Java é lindo!");
		// ^ o metodo precisa ser chamado la no main
	}

	// metodo sem retorno mas com passagem de parâmetro

	public static void mensagem(String msg) {
		System.out.println(msg);
	}

	// metodo com retorno

	public static int dobro(int numero) {
		return numero * 2;
	}

	// sobrecarga de métodos

	public static double calcular(double num1, double num2) {
		return num1 + num2;
	}

	public static int calcular(int num1, int num2) {
		return num1 + num2;
	}
	// polimorfismo no java = assumir formas diferentes

	public static int calcular(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	// array:

	public static double calcular(double[] numeros) {
		double soma = 0;
		
//		numeros =[2,4,6,8,10]
//			       	0 1 2 3 4
//		
//		for(int i=0; i < numeros.length; i++) {
//			soma += numeros[i];
//		}
// 		^ forma comum de usar for
		
		// forma simplificada de usar for no uso de vetor:
			for(double x:numeros) { 
			soma += x;
		}
		return soma/numeros.length;
	
		}
	
//	5! = 5x4x3x2x1 = 120
	public static int fatorial(int numero) {
		int fatorial = 1;
		for(int contador = numero; contador > 0; contador --) 
		fatorial *= contador; {
		
	}
		return fatorial;
	}
}
