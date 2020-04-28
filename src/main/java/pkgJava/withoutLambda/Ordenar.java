package pkgJava.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("C");

		System.out.println("Mostrando todos los elementos de un Array ordenado mediante a la soluci�n cl�sica:");
		System.out.print("\tOpci�n 1:\t");
		
		// Mostrando todos los elementos de un Array
		
		// Opci�n 1:
		String temp = "";
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i).compareTo(arrayList.get(j)) > 0) {
					temp = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp);
				}
			}
			System.out.print(arrayList.get(i));
		}
		
		// Opci�n 2:
		System.out.print("\n\tOpci�n 2:\t");
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}

		// Opci�n 3:
		System.out.print("\n\tOpci�n 3:\t");
		Collections.sort(arrayList);
		for (String item : arrayList) {
			System.out.print(item);
		}
	}
}
