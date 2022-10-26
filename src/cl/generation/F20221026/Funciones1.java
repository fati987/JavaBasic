package cl.generation.F20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// funciones o metodo

		// llamar a un metodo
		nombreMetodo();
		metodo2("Fatima");
		metodo2("Sebastian");
		metodo3(22);
		metodo4(4, 6.9F);
		String[] arreglito = { "1", "2", "3" };
		metodo5(arreglito);
		retorno1();// no hace nada
		System.out.println(retorno1());// validar que el metodo entrege la informacion
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado + 35);
		String nombreCompleto = obtenerNom("Fatima", "Requena", "Canepa");
		System.out.println("El nombre completo es: " + nombreCompleto);
		//swagger
		llamadaOtroMetodo();
	}

	// definicion o estructura de un metodo
	// void > no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial");
	}

	public static void metodo2(String nombre) {
		System.out.println("Hola soy " + nombre);
	}

	public static void metodo3(Integer numero) {
		System.out.println("Tengo " + numero + " anos");
	}

	public static void metodo4(Integer numero1, Float numero2) {// se puede agregar la cantidad que necesotemos
		System.out.println("Hola soy el numero " + numero1);
		System.out.println("Hola soy el numero " + numero2);
	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));
	}

	// funciones con retorno
	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos;
	}

	/**
	 * metodo que une todos los datos
	 * 
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nomCompleto
	 */
	public static String obtenerNom(String nombre, String apePaterno, String apeMaterno) {
		String nomCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nomCompleto;// retornamos el contenido de la variable
	}
	//metodo que llama a otro metodo
	public static void llamadaOtroMetodo() {
		System.out.println("Llamada a otro metodo desde un metodo");
		metodo4(1234,54.3f);
	}

}
