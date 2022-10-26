package cl.generation.F20221025;

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
		System.out.println(retorno1());
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado + 35);
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
}
