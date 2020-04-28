package pkgJava.withLambda;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); 
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("C");
	  
		arrayList.forEach(n -> System.out.print(n + " ")); 
	}
}
