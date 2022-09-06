package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {
	
// porta de entrada do sistema - o java entende q é
// onde vai começar o sistema
// metodo principal
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Product p1 = new Product();
//		Product p2 = new Product("Computador", 15000.00);
//		Product p3 = new Product ("Teclado", 80.00, 5);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
//		Product product = new Product();
//		
//		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
//		System.out.println(product.name + ", " + product.price + ", " + product.quantity);		
//		System.out.println(product.toString());
		
		Product product = new Product(name, price);
		
		
		product.setName("Computer)");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Product data: " + product.getPrice());	

		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		

	
		sc.close();
		
	}

}