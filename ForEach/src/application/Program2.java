package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Arthur");

//		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);	
		System.out.println(name);
		
		
		System.out.println("----------------");
//		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'A'); 
		// aqui
		// esta definindo fun��o lambda.
		
		for (String x : list) {
			System.out.println(x);
	}
		

		
		System.out.println("----------------");
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Bob " + list.indexOf("Ju"));
		
		System.out.println("----------------");
		
		List<String> result = list.stream().filter(x-> x.charAt(0) == 'B').collect(Collectors.toList());
		// stream aceita opera�oes da especie lambda	
		
		for (String x : result ) {
			System.out.println(x);
		}
		
}
}