package Arrays;

import java.util.Arrays;

public class OdenarVectoresCompletos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sueldos = { 1200, 750, 820, 550, 490, };
		// Implementa el algoritmo que acabas de ver en la parte teórica
		
		//Con este algoritmo unicamente sacaremos el ultimo elemento que será el mayor
		for (int f = 0; f < sueldos.length - 1; f++) {
			if (sueldos[f] > sueldos[f + 1]) {
				int aux = sueldos[f];
				sueldos[f] = sueldos[f + 1];
				sueldos[f + 1] = aux;
			}
		}
		
		// Con este algoritmo ordenaremos por completo un array
		for (int i = 0; i < sueldos.length -1; i++) {
			for (int f = 0; f < (sueldos.length - 1) - i; f++) {
				if (sueldos[f] > sueldos[f + 1]) {
					int aux = sueldos[f];
					sueldos[f] = sueldos[f + 1];
					sueldos[f + 1] = aux;
				}
			}
		}
		
		System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);
		System.out.println(Arrays.toString(sueldos));
	}

}
