package pkgJava.withLambda;

import java.util.ArrayList;
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
		list.stream().filter(x -> x.startsWith("P")).forEach(System.out::println);
	}
	
	public void order() {
		System.out.println("\n[Order - Asc]");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n[Order - Desc]");
		list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transform() {
		System.out.println("\n[Transform - String]");
		list.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
		
		System.out.println("\n[Transform - number]");
		numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limit() {
		System.out.println("\n[Limit]");
		list.stream().limit(2).forEach(System.out::println);
	}
	
	public void count() {
		System.out.println("\n[Count]");
		long x = list.stream().count();
		System.out.print(x);
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
