package pkgJava.withoutLambda;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("C");
		
		System.out.print("Opción 1:\t");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		System.out.print("\nOpción 2:\t");
		for (String item : arrayList) {
			System.out.print(item);
		}
	}
}
