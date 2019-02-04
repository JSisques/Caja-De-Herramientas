package Excepciones;

public class ProvocarExcepcion2 {

	// Capturando la excepción
	private int metodoExcepcion(int div) {
		int resultado = 0;
		// Poner si se sospecha de un posible error
		try {
			resultado = 10 / div;
			// Se crea la variable x de tipo Exception
		} catch (Exception e) {
			// getMessage() devuelve el texto de la derecha del error que ha ocurrido
			System.out.println("Se ha producido un error: " + e.getMessage());
			//Imprimir la pila de llamadas
			e.printStackTrace();
		}
		return resultado;
	}

	public static void main(String[] args) {
		ProvocarExcepcion2 miPrograma = new ProvocarExcepcion2();
		miPrograma.metodoExcepcion(0);
		System.out.println("Ahora s� se imprime");
	}
}
