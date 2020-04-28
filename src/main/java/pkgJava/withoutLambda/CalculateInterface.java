package pkgJava.withoutLambda;

public class CalculateInterface {

	public interface Calc {
		void suma(int a, int b);
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc() {

			@Override
			public void suma(int a, int b) {
				System.out.println("Result: " + (a+b));
			}
		};
		
		calc.suma(3,4);
	}

}
