package Arrays;

import java.util.Arrays;

public class IntercambiarArrayMitad {

	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9,7 };
		int[] arrayAuxiliar = new int[numeros.length];

		int puntoMedio = 0;

		// Utiliza este for para realizar el intercambio tal y como muestra el grafico

		// Primero diferenciamos si la longitud del array es par o impar

		if (numeros.length % 2 == 0) { // Par
			
			/*
			 * Calculamos el punto medio del array que seria la longitud entre 2 (10 / 2 =
			 * 5)
			 */
			puntoMedio = (numeros.length / 2);

			/*
			 * Creamos un bucle para que el array auxiliar tenga los mismos datos pero sea
			 * independiente del primero
			 */

			// Creamos un contador para llevar el indice del array
			int contador = 0;
			for (int j : numeros) {
				arrayAuxiliar[contador] = j;
				contador++;
			}

			/*
			 * Al dividir la longitud del array entre 2 hemos creado dos bloques ahora lo
			 * primero sera crear un bucle para ir asignando los valores del array auxiliar
			 * al array "numeros" por lo que al primero (el 0) le asignaremos el valor que
			 * tenga el array auxiliar en la posicion 5 (0 + 5) y asi sucesivamente
			 */
			
			for (int j = 0; j < puntoMedio; j++) {
				numeros[j] = arrayAuxiliar[j + puntoMedio];
			}

			/*
			 * Una vez tenemos el primer bloque de numeros asignado el siguiente paso es
			 * hacer lo mismo pero empezando por atras por lo que se ira recorriendo hacia
			 * atras el array hasta el punto medio Ejemplo practico para un array de 10
			 * numeros: numeros[9] = arrayAuxiliar[9-5] por lo que numeros[9] contendra lo
			 * mismo que el array auxiliar en la posicion 4
			 */
			for (int j = puntoMedio; j <= arrayAuxiliar.length - 1; j++) {
				numeros[j] = arrayAuxiliar[j - puntoMedio];
			}

		} else { // Impar
			/*
			 * Calculamos el punto medio del array que seria la longitud entre 2 (10 / 2 =
			 * 5) pero como es impar se le suma 1 para que haga de punto medio
			 */

			puntoMedio = (numeros.length / 2) + 1;

			/*
			 * Creamos un bucle para que el array auxiliar tenga los mismos datos pero sea
			 * independiente del primero
			 */

			// Creamos un contador para llevar el indice del array
			int contador = 0;
			for (int j : numeros) {
				arrayAuxiliar[contador] = j;
				contador++;
			}

			/*
			 * Creamos un bucle de tal manera que va recorriendo el indice hasta el numero anterior al punto medio
			 * de tal manera que numeros[0] corresponde a arrayAuxiliar[0 + puntoMedio]
			 */
			for (int j = 0; j < puntoMedio - 1; j++) {
				numeros[j] = arrayAuxiliar[j + puntoMedio];
			}

			/*
			 * Este bucle va desde despues del punto medio hasta el final por lo que asignaria al numero el valor del arrayAuxiliar menos
			 * el punto medio
			 * Ejemplo practico:
			 * aqui el punto medio vale 6 por lo que el indice iria desde el 6 hasta el final
			 * numero[6] = arrayAuxiliar[6 - 6 (puntoMedio)]
			 */
			for (int j = puntoMedio; j <= arrayAuxiliar.length - 1; j++) {
				numeros[j] = arrayAuxiliar[j - puntoMedio];
			}

		}

		System.out.println(Arrays.toString(numeros));
	}
}
