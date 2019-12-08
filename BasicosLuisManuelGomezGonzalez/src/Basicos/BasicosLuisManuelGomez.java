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

}
