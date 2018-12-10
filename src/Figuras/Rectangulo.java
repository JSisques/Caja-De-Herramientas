package Figuras;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String simbolo = "*";
		String espacio = "";

		for (int i = 0; i < num-2; i++) {
			espacio += " ";
		}

		for (int i = 1; i <= num; i++) {
			
			if (i == 1 || i == num) {
				for (int j = 1; j <= num; j++) {
					if (j == num) {
						System.out.println(simbolo);
					} else {
						System.out.print(simbolo);
					}

				}
			} else {
				System.out.println(simbolo + espacio + simbolo);
			}
		}
	}

}
