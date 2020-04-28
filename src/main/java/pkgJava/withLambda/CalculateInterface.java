package pkgJava.withLambda;

public class CalculateInterface {

	public interface Calc {
		int suma(int a, int b);
	}
	
	public static void main(String[] args) {
	 	Calc calc = (a, b) -> a + b;	
		System.out.println("Result : " + calc.suma(3, 4));
	}

}
