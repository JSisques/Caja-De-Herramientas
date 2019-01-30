package Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class LLevarCuentaDiccionario {

	public static void main(String[] args) {
		
		//Los valores se meten en un array
		int[] arr = new int[8];
		int countOccurrence = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter Number [" + i + "]:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter a number which exist in the array:");
		int number = scan.nextInt();

		//Creamos el HashMap
		HashMap<Integer,Integer> miTabla = new HashMap<Integer, Integer>(); 
		
		//Creamos una variable para llevar la cuenta de repeticiones
		Integer anterior;
		for (int i = 0; i < 8; i++) {
			
			//Preguntamos por el valor correspondiente a una key
			anterior = miTabla.get(arr[i]);
			
			//Si el valor no esta en el diccionario
			if (anterior != null)
				//Añadimos la clave mas el valor de anterior
				miTabla.put(arr[i], anterior + 1);
			else
				//Añadimos la clave y como valor el 1
				miTabla.put(arr[i], 1);
		}
		anterior = 0;
		countOccurrence = anterior + miTabla.get(number);
		System.out.println("Occurrence of " + number + " :");
		System.out.println(countOccurrence);
	}

}
