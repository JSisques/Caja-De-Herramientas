package Elecciones;
import java.util.Scanner;
import java.io.*;

public class Eleccion {

	public static void main(String[] args) throws IOException {
		//Cuando solo se quiere elegir una opción utilizar esto
		System.out.print("Hola señor usuario, introduzca una letra (a,b,c): ");
		char eleccion = (char) System.in.read();
		
		System.out.printf("Has seleccionado la opcion %s. Gracias", eleccion);


	}

}
