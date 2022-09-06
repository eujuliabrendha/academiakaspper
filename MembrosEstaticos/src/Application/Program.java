package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
// VERSÃO 1	
	
	public static final double PI = 3.14;	
// nome de constantes é sempre em letra maiuscula	
// se for mais de uma palavra coloca _ entre elas
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
//		double c = calc.circunference(radius);
//		double v = calc.volume(radius);
		
		double c = Calculator.circunference(radius);
		double v = Calculator.volume(radius);
// metodo estatico = usar a classe diretamente
		
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value: %.2f%n", PI);
		
		
		sc.close();
	}

}
