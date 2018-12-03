package ArraysBidimensionales;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double[][] prices = new double [3][2];
		// Al crear arrays de 2 dimensiones el primero indica la fila y el 2 la columna
		double[][] prices = {
				
				{3.979, 4.099},
				{4.199, 4.299},
				{4.599, 4.499}	
		};
		//System.out.println(prices[prices.length][1]);
		
		//Mostrar el numero de filas de un Array bidimensional
		System.out.println("El numero de filas es: " + (prices.length));
		//Mostrar el numero de columnas de un Array bidimensional
		//Solo en matrices cuadradas o rectangulares
		System.out.println("El numero de columnas es: " + prices[0].length);
	}

}
