package pkgJava.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
		for (String element : lista) {
			System.out.println(element);
		}
	}
	
	public void useRemoveIf(){
		/*for (String element : lista) {
			if(element.equalsIgnoreCase("KOTLIN")){
				lista.remove(element);
			}
		}*/
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("KOTLIN")){
				it.remove();
			}
		}
	}
	
	public void useSort(){
		Collections.sort(lista);
	}

	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		
		app.load();
		//app.useRemoveIf();
		app.useSort();
		app.useForEach();
	}

}
