package Strings;

public class MetodoSplit {

	public static void main(String[] args) {

		String str1 = "Hola amigo mio";
		// La expresión regular indica que es " " 
		String [] partes1 = str1.split(" ");
		for (int i = 0; i < partes1.length; i++) {
			System.out.println(partes1[i]);
		}
		String str2 = "Qué * tal / estás | hola";
		// La expresión regular indica que es " * " ó " / " 
		String [] partes2 = str2.split(" [*|/] ");
		for (int i = 0; i < partes2.length; i++) {
			System.out.println(partes2[i]);
		}
	}

}
