package Arrays;

import java.util.*;

public class EnvoltorioArrays {

	public static void main(String a[]) throws Exception {
		// Declaro un vector inicial
		int[] miVector = { 11, 80, 66, 8, 9 };
		
		// Ordenación del vector
		Arrays.sort(miVector);
		
		// Busco un elemento en concreto en un vector ordenado
		//Antes de usar este metodo es obligatorio ordenar con sort
		System.out.println(Arrays.binarySearch(miVector, 66));
		
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
	}
}
