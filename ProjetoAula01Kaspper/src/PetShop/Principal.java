package PetShop;

public class Principal {

	public static void main(String[] args) {

// cadastrar um animal para o petshop
// instanciar um objeto da classe animal

		Animal a1 = new Animal("Otto", "gato", 2);
		Animal a2 = new Animal("Tot�", "cachorro", 5);
		Animal a3 = new Animal("Psiu", "passarinho", 2);
		System.out.println("O animal: " + a1.getNome() + " � um " + a1.getEspecie());
		System.out.println("O animal: " + a2.getNome() + " � um " + a2.getEspecie());
		System.out.println("O animal: " + a3.getNome() + " � um " + a3.getEspecie());
		
		a1.vacinar();
		a2.consultar();
		a3.fazeraniversario();
		
		a1.setIdade(-2);
//		a1.idade = -3;

	}

}
