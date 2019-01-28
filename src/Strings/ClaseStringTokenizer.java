package Strings;

import java.util.StringTokenizer;

public class ClaseStringTokenizer {

	public static void main(String[] args) {

		StringTokenizer str;
		str = new StringTokenizer("Uno | dos| tres | perico", " |");
		System.out.println("la cadena strtiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
			System.out.println(str.nextToken());

	}

}
