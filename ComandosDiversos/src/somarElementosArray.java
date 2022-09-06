
public class somarElementosArray {

	public static void main(String[] args) {

//		soma dos elementos dentro do array

		int[] array = { 5, 6, 7, 45, 89, 34, 23, 30 };

		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}

		System.out.println("A soma dos elementos foi: " + total);

	}
}
