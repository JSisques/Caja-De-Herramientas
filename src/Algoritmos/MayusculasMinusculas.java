package Algoritmos;
import java.util.Scanner;

public class MayusculasMinusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese una cadena de caracteres: ");
		MiString test = new MiString();
		System.out.println("El número de mayúsculas es: " + test.getNumMayusculas());
		System.out.println("El número de minúsculas es: " + test.getNumMinusculas());
	}

}

class MiString {

	String chain;
	int numMayusculas;
	int numMinusculas;

	public MiString() {
		Scanner scan = new Scanner(System.in);
		chain = scan.nextLine();
		numMayusculas = contarMayusculas();
		numMinusculas = contarMinusculas();
		scan.close();
	}

	
	private int contarMayusculas() {
		//Contador
		int n = 0;
		for (int i = 0; i < chain.length(); i++) {
			//Sacamos el caracter y decimos si es mayor a 64 y menor a 91 en la tabla ASCII
			if (chain.charAt(i) > 64 && chain.charAt(i) < 91) {
				n++;
			}
		}
		return n;

	}

	private int contarMinusculas() {
		int n = 0;
		//Sacamos el caracter y decimos si es mayor a 96 y menor a 123 en la tabla ASCII
		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) > 96 && chain.charAt(i) < 123) {
				n++;
			}
		}
		return n;

	}

	public int getNumMayusculas() {
		return numMayusculas;
	}

	public int getNumMinusculas() {
		return numMinusculas;
	}

}