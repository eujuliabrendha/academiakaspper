package Biblioteca;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Livro l1 = new Livro("Kafka", "Franz Kafka", 2);
		Livro l2 = new Livro("Meu p� de laranja lima", "Jos� Mauro de Vasconcelos", 3);
		
//		l1.mostrarFicha(); 
		l2.mostrarFicha();
		
		l1.emprestarLivro();
//		l1.mostrarFicha();
		l1.emprestarLivro();
		l1.emprestarLivro();
		
		System.out.println("Valor do empr�stimo a ser pago: " + "R$" + l1.calcularValor(10));
		l1.devolverLivro();
		l1.devolverLivro();
		l1.devolverLivro();
		
		
	}

}
