package Excepciones;

public class LanzaExcepcion3 {

	//En este metodo se captura el error
	private void metodoInicial() {
		try {
			metodoExcepcionOrigen();
		} catch (Exception e) {
			System.out.println("El programa fall� con el mensaje: " + e.getMessage());
			//El bloque finally siempre se ejecuta
		} finally {
			System.out.println("Bloque final");
		}
	}

	//En este netodo se genera el error
	private void metodoExcepcionOrigen() throws RuntimeException {
		RuntimeException miError = new RuntimeException("Error inventado por mi");
		throw miError;
	}

	public static void main(String[] args) {
		LanzaExcepcion3 miPrograma = new LanzaExcepcion3();
		miPrograma.metodoInicial();
		System.out.println("A pesar del error anterior, la ejecuci�n continua");
	}

}