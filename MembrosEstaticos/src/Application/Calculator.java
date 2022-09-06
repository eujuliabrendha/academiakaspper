package Application;

public class Calculator {

	public static final double PI = 3.14;	
	// nome de constantes é sempre em letra maiuscula	
	// se for mais de uma palavra coloca _ entre elas
		

	public static  double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius /3;
	}
	
}
