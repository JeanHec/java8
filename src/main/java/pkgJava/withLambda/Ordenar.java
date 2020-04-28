package pkgJava.withLambda;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("C");

		System.out.println("Mostrando todos los elementos de un array ordenados con Lambda:");
		
		// Ordenando los elementos de un Array con Lambda
		
		// Opción 1:
		System.out.print("\tOpción 1:");

		Collections.sort(arrayList, (String s1, String s2) -> s1.compareTo(s2));
		arrayList.forEach(n -> System.out.print(n));

		System.out.println();
		
		// Opción 2:
		System.out.print("\tOpción 2:");

		arrayList.sort((p1, p2) -> p1.compareTo(p2));
		arrayList.forEach(System.out::print);

		System.out.println();
		
		// Opción 3:
		System.out.print("\tOpción 3:");

		arrayList.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach(System.out::print);
	}
}
