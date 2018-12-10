package Arrays;

public class MetodoArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int[] c = new int[primes.length];
		/*
		 * ES OBLIGATORIO DIMENSIONAR EL ARRAY DE DESTINO ANTES DE HACER NADA
		 * Metodo arraycopy(fuente, indice fuente, destino, indice destino, longitud)
		 * Fuente: Indica el array de donde cogeremos los datos
		 * Indice fuente: Indica el indice (la posicion) donde empezaremos a coger los datos
		 * Destino: Indica el array donde depositaremos los datos
		 * Indice destino: Indica el indice (la posicion) donde empezaremos a depositar los datos
		 * Longitud: Indica la cantidad de datos que vamos a coger
		 */
		System.arraycopy(primes, 1, c, 3, 6); // copy array primes to array c
		for (int j = 0; j < c.length; j++)
			System.out.print(" " + c	[j]);
	}

}
