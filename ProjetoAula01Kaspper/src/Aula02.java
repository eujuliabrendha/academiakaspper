
public class Aula02 {

	
	public static void main(String[] args) {
		
// 		revis�o switch case ( = verificar o conteudo dentro de uma variavel);	
// 		sintaxe do case � :		
		
		int posicao = 1;
		switch(posicao) {
			case 1: 
				System.out.println("Voc� chegou em 1� lugar");
				break;
			case 2: 
				System.out.println("Voc� chegou em 2� lugar");
				break;
			case 3: 
				System.out.println("Voc� chegou em 3� lugar");
				break;
			case 4: case 5: case 6: 
				System.out.println("Voc� vai ganhar um pr�mio de participa��o");
				break;
			default:
				System.out.println("Nenhuma premia��o");
			
		}

	}
}
