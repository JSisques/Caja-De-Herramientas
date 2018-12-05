package Algoritmos;
	
public class SucesionFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num1 = 0;
		long num2 = 1;
		long num3 = 0;
		boolean ciclo = false;
		/*
		while (ciclo != true) {
			num3 = num1 + num2;

			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		*/
		for (int i = 0; i < 100; i++) {
			num3 = num1 + num2;

			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
