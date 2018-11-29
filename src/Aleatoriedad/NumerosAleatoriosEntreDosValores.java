package Aleatoriedad;

import java.util.Scanner;

public class NumerosAleatoriosEntreDosValores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * La formula que he usado es (NumMaximo - NumMinimo + 1) + NumMinimo
		 * Esto permite sacar numeros aleatorios entre esos dos valores en concreto
		 */
		int num  = (int) Math.round(Math.random() * (90-65+1)+65);
		char valor = (char) num;
		
		System.out.println("El numero es : " + num);
		System.out.println("La letra correspondiente es: " + valor);
	}

}
