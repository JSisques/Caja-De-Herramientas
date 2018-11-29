package EntradaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerFormal {
	static String nombre;

	public static void main(String[] args) throws IOException {

		// Metodo formal para el input de datos
		// Consume menos recursos que Scanner
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escribe tu nombre: ");
		nombre = br.readLine();
		System.out.println("Hola " + nombre + ", ¿co�?mo esta�?s?");
		System.out.print("Escribe tu edad: ");
		String edad = br.readLine();
		
		// Para pasar de String a Int se usa Integer.parseInt(String);
		int edadInt = Integer.parseInt(edad);
		System.out.printf("El próximo año cumples %d años", ++edadInt);
	}

}
