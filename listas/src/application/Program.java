package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");

		// Tamanho da lista - 5
		System.out.println(list.size());

		// Imprime cada elemento da lista, armazenados na vari�vel "x"
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------");

		// Removendo o indice [1] da lista - Alex
		list.remove(1);

		// Removendo elementos da lista com o predicado "M"
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		/*
			System.out.println("-----------------");
			List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
			for (String x : result) {
				System.out.println(x);
			}
		*/
		
		System.out.println("--------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}