
public class Aula02 {

	
	public static void main(String[] args) {
		
// 		revisão switch case ( = verificar o conteudo dentro de uma variavel);	
// 		sintaxe do case é :		
		
		int posicao = 1;
		switch(posicao) {
			case 1: 
				System.out.println("Você chegou em 1º lugar");
				break;
			case 2: 
				System.out.println("Você chegou em 2º lugar");
				break;
			case 3: 
				System.out.println("Você chegou em 3º lugar");
				break;
			case 4: case 5: case 6: 
				System.out.println("Você vai ganhar um prêmio de participação");
				break;
			default:
				System.out.println("Nenhuma premiação");
			
		}

	}
}
