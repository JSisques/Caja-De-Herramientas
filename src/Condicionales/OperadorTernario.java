package Condicionales;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// resultado = (condicion)?valor1:valor2;
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		int mayor = num1;

		mayor = mayor > num2 ? mayor : num2;
		mayor = mayor > num3 ? mayor : num3;
	}

}
