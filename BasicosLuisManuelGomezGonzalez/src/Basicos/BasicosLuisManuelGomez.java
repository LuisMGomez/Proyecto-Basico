package Basicos;

public class BasicosLuisManuelGomez {
	
	/* Tarea : Proyecto Basico
	 * Entornos de Desarrollo
	 * 
	 * @author Luis Manuel Gomez Gonzalez
	 */

	public static void main(String[] args) {
		
		// Ejemplo de tipo String
		cadena();

	}
	
	/**
	 * Ejemplos de tipo Cadena
	 */

	public static void cadena() {

		// Declaracion de tipo String

		String cadena_1;
		String cadena_2;
		String cadena_3;

		// Asignacion de valores de tipos String

		cadena_1 = "HOLA MUNDO !!!";
		cadena_2 = new String(cadena_1);
		cadena_3 = cadena_1 + cadena_2;

		// Mostrar en pantalla el contendido de tipos String

		System.out.println("Ejemplos de tipo String:");
		System.out.println("-----------------------------------");
		System.out.println("Valor cadena 1....................................: " + cadena_1);
		System.out.println("Valor cadena 2....................................: " + cadena_2);
		System.out.println("Valor cadena 2 en minusculas......................: " + cadena_2.toLowerCase());
		System.out.println("Valor union cadena 1 y cadena 2...................: " + cadena_3);
		System.out.println("Valor longitud cadena 3...........................: " + cadena_3.length());

	}

}
