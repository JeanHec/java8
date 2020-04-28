package pkgJava.withLambda;

import java.util.Optional;

public class OptionalApp {

	public void prove(String valor) {

		try {
			Optional<String> op = Optional.empty();
			op.get();
		} catch (Exception e) {
			System.out.println("No hay elemento");
		}
	}

	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
//		app.prove(null);
		app.orElse(null);
//		app.orElseThrow(null);
//		app.isPresent(null);
	}

}
