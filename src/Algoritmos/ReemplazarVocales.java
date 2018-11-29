package Algoritmos;

import java.util.Scanner;

//Codigo para sacar las vocales y eliminarlas de cualquier cadena de caracteres

public class ReemplazarVocales {

	/**
	 * Shortens and returns long posts by removing vowels
	 * 
	 * @param longPost the post whos vowels need to be removed
	 *
	 * @return a version of the post without vowels
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce una palabra: ");
		System.out.println(shorten(scan.nextLine()));

	}

	public static String shorten(String longPost) {
		// YOUR CODE HERE

		// int count = 0;
		String shortPost = "";

		for (int i = 0; i < longPost.length(); i++) {

			String letter = longPost.substring(i, i + 1);

			if ("aeiouAEIOU".contains(letter)) {
				letter.replace(letter, "");
				// count++;
			} else {
				shortPost = shortPost + letter;
			}

		}
		
		//Reemplazar vocales por vocales
		
//		for (int i = 0; i < longPost.length(); i++) {
//
//			String letter = longPost.substring(i, i + 1);
//
//			if ("aeiouAEIOU".contains(letter)) {
//				shortPost = shortPost + letter.replace(letter, "e");
//				// count++;
//			} else {
//				shortPost = shortPost + letter;
//			}
//
//		}
		
		// Otra forma de hacerlo que ocupa menos

//		for (int i = 0; i < longPost.length(); i++) {
//
//			if (!"aeiouAEIOU".contains(longPost.substring(i, i + 1))) {
//				shortPost = shortPost + longPost.substring(i, i + 1);
//				// count++;
//			}
//
//		}

		return shortPost;
	}
}
