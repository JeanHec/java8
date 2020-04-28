package pkgJava.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamApp {
	
	private List<String> list;
	private List<String> numbers;
	
	public StreamApp(){
		list = new ArrayList<>();
		list.add("JAVA");
		list.add("PYTHON");
		list.add("KOTLIN");
		list.add("PHP");
		
		numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
	}
	
	public void filter() {
		System.out.println("[Filter]");
		
		for (String element : list) {
			if(element.startsWith("P")) {
				System.out.println(element);
			}
		}
	}
	
	public void order() {
		System.out.println("\n[Order]");
		
		Collections.sort(list);
		for (String element : list) {
			System.out.println(element);
		}
	}
	
	public void transform() {
		System.out.println("\n[Transform - String]");

		for (String element : list) {
			System.out.println(element.toLowerCase());
		}
	}
	
	public void limit() {
		System.out.println("\n[Limit]");
		
		int i = 0;
		for (String element : list) {
			if(i < 2) {
				System.out.println(element);
			}
			i ++;
		}
	}
	
	public void count() {
		System.out.println("\n[Count]");

		System.out.println(list.size());
	}

	public static void main(String[] args) {
		StreamApp app = new StreamApp();
		app.filter();
		app.order();
		app.transform();
		app.limit();
		app.count();
	}

}
