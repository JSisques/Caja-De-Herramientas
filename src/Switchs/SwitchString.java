package Switchs;

import java.io.IOException;
import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
/*
		menu();
		

		System.out.print("Hola señor usuario, introduzca una letra (A,B,C,D): ");
		char j = (char) System.in.read();
		String resultado = "";

		switch (j) {
		case 'A':
		case 'a':
			resultado = "Imprimir";
			break;
		case 'B':
		case 'b':
			resultado = "Borrar";
			break;
		case 'C':
		case 'c':
			resultado = "Añadir";
			break;
		case 'D':
		case 'd':
			resultado = "Salir";
			break;
		default:
			resultado = "Opción incorrecta";
			break;
		}

		System.out.println("Seleccionaste la opción: " + resultado);
		
*/
		System.out.print("Hola señor usuario, introduzca una letra (A,B,C,D): ");
		String j = scan.nextLine().toUpperCase();
		String resultado = "";

		switch (j) {
		case "A":
			resultado = "Imprimir";
			break;
		case "B":

			resultado = "Borrar";
			break;
		case "C":
			resultado = "Añadir";
			break;
		case "D":
			resultado = "Salir";
			break;
		default:
			resultado = "Opción incorrecta";
			break;
		}

		System.out.println("Seleccionaste la opción: " + resultado);
	}

	private static void menu() {
		System.out.println("(A) Imprimir");
		System.out.println("(B) Borrar");
		System.out.println("(C) Añadir");
		System.out.println("(D) Salir");
	}
}
