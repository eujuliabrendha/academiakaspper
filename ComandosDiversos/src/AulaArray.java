
public class AulaArray {

	/*
	 * Desafio 1: registrar 4 alunos e 3 notas. Calcular a média final e situação
	 * final (aprovado ou reprovado).
	 */

	public static void main(String[] args) {

//		vetor = array --> []

//		int[] outroArray;
//		outroArray = new int[10];
//		String[] a = new String [100], b = new String [40];

		int[] array = new int[5]; // inicializa o array o tipo int com 10 posições;

		array[0] = 12;
		array[1] = 8;
		array[2] = 4;
		array[3] = 7;
		array[4] = 5;

		System.out.printf("%s%8s%n", "Indice", "Valor");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
//			System.out.println(i+"\t"+array[i]);

		}

//		int i=0; while (i<=4) { System.out.println("nome"); i++;}
//		// incremento i=i+1 
//		
//		
//		System.out.println(array[0]);
//		
//		quando a array ta vazia: string = null, int = 0 e boolean = false

	}

}
