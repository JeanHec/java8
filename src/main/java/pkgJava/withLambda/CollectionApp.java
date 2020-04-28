package pkgJava.withLambda;

import java.util.ArrayList;
import java.util.List;

public class CollectionApp {
	
	private List<String> lista;
	
	public void load(){
		lista = new ArrayList<>();
		
		lista.add("JAVA");
		lista.add("PYTHON");
		lista.add("KOTLIN");
	}
	
	public void useForEach(){
		lista.forEach(x -> System.out.println(x));
		lista.forEach(System.out::println);
	}
	
	public void useRemoveIf(){
		lista.removeIf(x -> x.equalsIgnoreCase("KOTLIN"));
	}
	
	public void useSort(){
		lista.sort((x,y) -> x.compareTo(y));
	}

	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		
		app.load();
		//app.useRemoveIf();
		app.useSort();
		app.useForEach();
	}

}
