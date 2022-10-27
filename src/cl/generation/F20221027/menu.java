package cl.generation.F20221027;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// menu de opciones
		menu();

		/*
		 * Calculadora xon las 4 operaciones basicas solicitar y capturar 2 numeros
		 * float imprimir los resultados y guardar en una variable ofrecer opciones
		 * definir los metodos validaciones terminar la ejecucion
		 */

	}

	public static void menu() {
		System.out.println("**************");
		System.out.println("***  MENU  ***");
		System.out.println("**************");
		System.out.println("1)  SUMA  ****");
		System.out.println("2)  RESTA  ***");
		System.out.println("3) MULTIPLICAR");
		System.out.println("4)  DIVICION  ");
		System.out.println("0)  SALIR  ***");

		int opciones = 0;
		Scanner sc = new Scanner(System.in);
		int contadorErrores = 4;

		do {
			System.out.println("* Seleccione una opcion *");
			opciones = sc.nextInt();

			// salir del DoWhile
			if (opciones == 0) {
				System.out.println("* Usted a salido del programa *");
				break; // termina la ejecucion de manera brusca
			}

			if (opciones < 0 || opciones > 4) {// condicion de error
				contadorErrores--;
				System.out.println("Te queda " + contadorErrores + " intentos");
			} else if (contadorErrores == 0) {
				System.out.println("* Agoto la cantidad de intentos *");
				break;
			}
		} while (opciones < 0 || opciones > 4);

		/*
		 * if (opciones == 0 || contadorErrores == 0) { System.out.println("Adios");
		 * }else { //solo ingresara para opciones 1,2,3,4
		 * System.out.println("* fuera del while *" + opciones); }
		 */

		// solicitar 2 numeros
		System.out.println("* Ingresa el primer numero *");
		float num1 = sc.nextFloat();
		System.out.println("* Ingresa el segundo numero *");
		float num2 = sc.nextFloat();
		float resultado = 0;
		switch (opciones) {
		case 1:// suma
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
		case 2:// resta
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		case 3:// multiplicacion
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicacion es: " + resultado);
			break;
		case 4:// division
			if (num2 == 0) {
				System.out.println("No se puede dividir por cero");
			} else {
				resultado = num1 / num2;
				System.out.println("El resultado de la suma es: " + resultado);
			}
			break;

		default:
			System.out.println("* Opcion no valida *");
			break;
		}
	}
}
