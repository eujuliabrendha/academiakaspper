package Entities;

public class Product {

// definição da classe
// representa o molde do ovo da pascoa	

	String name;
	private double price;
	private int quantity;

// quando não coloca o modificador ele é apenas acessivel dentro da classe	

// proteger = encapuslamento;	

//	

//	
//	public Product(String name, double price, int quantity) {
//		this.name = name;
//	 	this.price = price;
//	 	this.quantity = quantity;
//	}
// this é referencia para o proprio objeto	 
//	
//	public Product(String name, double price) {
//		this.name = name;
//	 	this.price = price;
//	}
//	 	
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public String getName() {
//			return name;
//		}
//	 	
//	public double getPrice() {
//		return price;
//	}
//	
//	public void setPrice (double price) {
//		this.price = price;
//	}
//	
//	public int getQuantity( ) {
//		return quantity;
//	}

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	// void n retorna nenhum - n tem nenhum tipo de dado

	public void addProducts(int quantity) {
		this.quantity += quantity;
		// palavra reservada para - significa
		// que é uma autoreferencia ao atributo da
		// propria classe;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + price + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());

	}

}
