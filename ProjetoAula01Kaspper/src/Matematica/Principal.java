package Matematica;

public class Principal {

	public static void main(String[] args) {


		Figura r1 = new Retangulo ("Ret�ngulo", "verde", 10, 20);
		System.out.println("Eu sou um " + r1.getNome());
//		System.out.println("Minha �rea �: " + r1.calcularArea());
		System.out.printf("%s%.1f%n", "Minha �rea �: ", r1.calcularArea());
		
		
		Figura t1 = new Triangulo ("Tri�ngulo", "azul", 10, 20);
		System.out.println("Eu sou um " + t1.getNome());
//		System.out.println("Minha �rea �: " + t1.calcularArea());
		System.out.printf("%s%.2f%n", "Minha �rea �: ", t1.calcularArea());

		Figura c1 = new Circulo("C�rculo", "vermelho", 10);
		System.out.println("Eu sou um " + c1.getNome());
//		System.out.println("Minha �rea �: " + t1.calcularArea());
		System.out.printf("%s%.2f%n", "Minha �rea �: ", c1.calcularArea());
		
	}

}
