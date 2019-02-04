package Excepciones;

public class LanzaExcepcion2 {

	//El throws sirve para indicar los errores posibles
	private void metodoExcepcion() throws RuntimeException {
		RuntimeException miError = new RuntimeException("Error inventado por mi");
		throw miError;
	}

	public static void main(String[] args) {
		LanzaExcepcion2 miPrograma = new LanzaExcepcion2();
		try {
			miPrograma.metodoExcepcion();
		} catch (Exception e) {
			System.out.println("El programa fall� con el mensaje: " + e.getMessage());
		}
		System.out.println("A pesar del error anterior, la ejecuci�n continua");

	}

}