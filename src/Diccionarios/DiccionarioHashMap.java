package Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DiccionarioHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		notas.put("Antonio", 7);
		notas.put("Pedro", 9);
		notas.put("Luis", 10);
		notas.put("Marco", 7);
		notas.put("María", 4);
		notas.put("Ana", 10);
		// Obtener la nota de Pedro con get
		System.out.println("Ejercicio 1:");
		System.out.println(notas.get("Pedro"));
		System.out.println();
		
		// Preguntar si el alumno María está en lista
		System.out.println("Ejercicio 2:");
		System.out.println(notas.containsKey("María"));
		System.out.println();
		
		// Sacar la nota media de la clase
		System.out.println("Ejercicio 3:");
		double resultado = 0;
		for (Integer nota : notas.values()) {
			resultado += nota;
		}
		System.out.println("La media es: " + resultado / notas.size());
		
//		double resultado2 = 0;
//		Set<Map.Entry<String, Integer>> notasEntrySet = notas.entrySet();
//		for (Entry<String, Integer> elemento : notasEntrySet) {
//			resultado += elemento.getValue();
//		}
//		System.out.println(resultado / notas.size());
		System.out.println();
		
		// Listado de todos los alumnos -> Alumno: Nota
		//Forma 1
		Set<Map.Entry<String, Integer>> notasEntrySet = notas.entrySet();
		System.out.println("Ejercicio 4:");
		for (Entry<String, Integer> elemento : notasEntrySet) {
			System.out.println(elemento.getKey() + ": " + elemento.getValue());
		}
		
		//Forma 2 (más comoda y sencilla)
		
		for (Entry<String, Integer> nota : notas.entrySet()) {
			System.out.println(nota.getKey() + ": " + nota.getValue());
		}
		
	}

}
