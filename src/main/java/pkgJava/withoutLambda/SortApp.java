package pkgJava.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortApp {

	public void ordenar(){
		List<String> lista = new ArrayList<>();
		lista.add("python");
		lista.add("java");
		lista.add("kotlin");
		
		System.out.println("Option #1");
		Collections.sort(lista, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for (String element : lista) {
			System.out.println(element);
		}
		
		System.out.println("\nOption #2");
		Collections.sort(lista);
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	public static void main(String []args) {
		SortApp app = new SortApp();
		app.ordenar();
	}
}
