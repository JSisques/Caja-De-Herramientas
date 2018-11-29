package Comparaciones;

public class CompararString {

	public static void main(String[] args) {
		
		String first = "Uda";
		String second = "city";
		String firstAndSecond = first + second;
		String third = "Udacity";
		
		//Asi no se hace
		if (firstAndSecond == third) {
			System.out.println("They are de same");
		} else {
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
		
		//Se necesita utilizar el metodo equals() para comparar dos cadenas de caracteres
		if (firstAndSecond.equals(third)) {
			System.out.println("They are the same");
		} else {
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
		
		//Para comparar sin que importen las mayusculas se usa el metodo equalsIgnoreCase()
		if (firstAndSecond.equalsIgnoreCase(third)) {
			System.out.println("They are the same");
		} else {
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
	}

}
