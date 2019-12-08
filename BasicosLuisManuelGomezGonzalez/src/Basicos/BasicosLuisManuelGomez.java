package Basicos;

public class BasicosLuisManuelGomez {
	
	/* Tarea : Proyecto Basico
	 * Entornos de Desarrollo
	 * 
	 * @author Luis Manuel Gomez Gonzalez
	 */

	public static void main(String[] args) {
		

		// Ejemplos de tipos numericos
		numericos();
		
		System.out.println();
		
		//Ejemplo de tipo String
		cadena();
		
	}
	
	
	/**
	 * Ejemplos de tipos numericos
	 */
	
	public static void numericos() {


		// Declaracion de tipos numericos
		
		byte v_byte;
		short v_short;
		int v_int;
		long v_long;
		float v_float;
		double v_doble;

		// Asignacion de valores de tipos numericos
		
		v_byte = 126;
		v_short = 500;
		v_int = 25451;
		v_long = 12541255;
		v_float = 4.7333434f;
		v_doble = 4.3554535124532;

		// Mostrar en pantalla el contendido de tipos numericos
		
		System.out.println("Ejemplos de tipos Basicos numericos:");
		System.out.println("-----------------------------------");
		System.out.println("Valor byte     "+ v_byte);
		System.out.println("Valor short    "+ v_short);
		System.out.println("Valor entero:  "+ v_int);
		System.out.println("Valor long     "+ v_long);
		System.out.println("Valor float    "+ v_float);
		System.out.println("Valor double   "+ v_doble );
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
