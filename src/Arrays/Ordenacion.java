package Arrays;

import java.util.*;

public class Ordenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] listado3 = { 1, 2, 3, 4, 5, 6, 7,8654,45,345,24,1,13 };
		Ordenacion test = new Ordenacion();
		// Implementa una forma de saber si el array está ordenado o no
		// Almacena el resultado en la variable isSort
		test.estaOrdenado(listado1);
		test.estaOrdenado(listado2);
		test.estaOrdenado(listado3);

	}
	
	/**
	 * Este metodo compara un array con otro array clonado pero ordenado, si esta ordenado devuelve true y si no devuelve false
	 * @param array
	 * @return devuelve un boolean indicando si esta ordenado o no
	 */

	public boolean estaOrdenado(int[] array) {
		boolean isSort = true;
		int[] auxiliar;
		auxiliar = array.clone();
		Arrays.sort(auxiliar);

		int a = 0;
		int b = 0;

		for (int i = 0; i < auxiliar.length-1; i++) {
			a = array[i];
			b = auxiliar[i];
			if (a + 1 != b + 1) {
				isSort = false;
			}
		}

		if (isSort)
			System.out.println("El vector está ordenado");
		else

			System.out.println("El vector NO está ordenado");
		return isSort;

	}
}
