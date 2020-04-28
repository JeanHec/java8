package pkgJava.withLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {

	public void order(){
		List<String> lista = new ArrayList<>();
		lista.add("python");
		lista.add("java");
		lista.add("kotlin");
		
        System.out.println("Option #1");
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("\nOption #2");
		Collections.sort(lista, (p1, p2) -> p1.compareTo(p2));
		lista.forEach(n -> System.out.print(n + "\n"));
		
		System.out.println("\nOption #3");
		lista.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach(System.out::print);
	}
	
	public static void main(String []args) {
		SortApp app = new SortApp();
		app.order();
	}
}
