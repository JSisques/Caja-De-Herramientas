package Strings;

import java.util.Scanner;

public class EjemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cad1;
		String cad2;
		System.out.print("Ingrese la primer cadena:");
		cad1 = teclado.nextLine();
		System.out.print("Ingrese la segunda cadena:");
		cad2 = teclado.nextLine();
		if (cad1.equals(cad2) == true) {
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			System.out.println(cad1 + " no es exactamente igual a " + cad2);
		}
		if (cad1.equalsIgnoreCase(cad2) == true) {
			System.out.println(cad1 + " es igual a: " + cad2 + ", sin tener en cuenta mayúsculas/minúculas");
		} else {
			System.out.println(cad1 + " no es igual a: " + cad2 + ", sin tener en cuenta mayúsculas/minúculas");
		}
		if (cad1.compareTo(cad2) == 0) {
			System.out.println(cad1 + " es exactamente igual a: " + cad2);
		} else {
			if (cad1.compareTo(cad2) > 0) {
				System.out.println(cad1 + " es mayor alfabéticamente que: " + cad2);
			} else {
				System.out.println(cad2 + " es mayor alfabéticamente que: " + cad1);
			}
		}

		char carac1 = cad1.charAt(0);
		System.out.println("El primer caracter de: " + cad1 + " es: " + carac1);
		int largo = cad1.length();
		System.out.println("El largo del String: " + cad1 + " es: " + largo);
		String cad3 = cad1.substring(0, 3);
		System.out.println("Los primeros caracteres de " + cad1 + " son: " + cad3);
		int posi = cad1.indexOf(cad2);
		if (posi == -1) {
			System.out.println(cad2 + ", no está contenido en: " + cad1);
		} else {
			System.out.println(cad2 + ", está contenido en: " + cad1 + ", a partir de la posición: " + posi);
		}
		System.out.println(cad1 + ", convertido a mayúsculas es: " + cad1.toUpperCase());
		System.out.println(cad1 + ", convertido a minúsculas es: " + cad1.toLowerCase());
	}

}
