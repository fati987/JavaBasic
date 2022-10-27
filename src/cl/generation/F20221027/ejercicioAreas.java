package cl.generation.F20221027;

import java.util.Scanner;

public class ejercicioAreas {

	public static void main(String[] args) {
		// Realizar un programa que realice el cálculo de las áreas y perímetros de
		// triángulos, rectángulos y circunferencias
		menu1();
	}

	public static void menu1() {
		System.out.println("*****  MENU  *****");
		System.out.println("******************");
		System.out.println("1)  TRINGULO  ****");
		System.out.println("2)  RECTANGULO  **");
		System.out.println("3)  CIRCUNFERENCIA");
		System.out.println("0)  SALIR  *******");
		System.out.println("******************");

		int opciones1 = 0;
		Scanner scMenu = new Scanner(System.in);
		int contadorErrores = 3;

		do {
			System.out.println("* Seleccione una opcion *");
			opciones1 = scMenu.nextInt();

			if (opciones1 == 0) {
				System.out.println("* Usted a salido del programa *");
				break;
			}

			if (opciones1 < 0 || opciones1 > 3) {// condicion de error
				contadorErrores--;
				System.out.println("Te queda " + contadorErrores + " intentos");
			} else if (contadorErrores == 0) {
				System.out.println("* Agoto la cantidad de intentos *");
				break;
			}
		} while (opciones1 < 0 || opciones1 > 3);

		System.out.println("*****  MENU  *****");
		System.out.println("******************");
		System.out.println("1)  PERIMETRO  ***");
		System.out.println("2)  AREA  ********");
		System.out.println("0)  SALIR  *******");
		System.out.println("******************");

		int opciones2 = 0;
		do {
			System.out.println("* Seleccione una opcion *");
			opciones2 = scMenu.nextInt();

			if (opciones2 == 0) {
				System.out.println("* Usted a salido del programa *");
				break;
			}

			if (opciones2 < 0 || opciones2 > 2) {// condicion de error
				contadorErrores--;
				System.out.println("Te queda " + contadorErrores + " intentos");
			} else if (contadorErrores == 0) {
				System.out.println("* Agoto la cantidad de intentos *");
				break;
			}
		} while (opciones2 < 0 || opciones2 > 2);
		
		float resultado =0;
		switch (opciones1) {
		case 1:
			System.out.println("Ingresa el valor de la base: ");
			float base = scMenu.nextFloat();
			System.out.println("Ingresa el valor de la altura: ");
			float altura = scMenu.nextFloat();
			switch (opciones2) {
			case 1:
				resultado = (float) (base + altura + (Math.sqrt((altura * altura) + ((base / 2) * (base / 2))) * 2));
				System.out.println("El area es: " + resultado);
				break;
			case 2:
				resultado = (base * altura) / 2;
				System.out.println(("El perimetro es " + resultado));
				break;

			default:
				System.out.println("* Opcion no valida *");
				break;
			}
			break;

		case 2:
			System.out.println("Ingrese el valor del ancho");
			float ancho = scMenu.nextFloat();
			System.out.println("Ingrese el valor del largo");
			float largo = scMenu.nextFloat();
			switch (opciones2) {
			case 1:
				resultado = (ancho + largo) * 2;
				System.out.println(("El perimetro es " + resultado));
				break;

			case 2:
				resultado = ancho * largo;
				System.out.println("El area es: " + resultado);
				break;
				
			default:
				System.out.println("* Opcion no valida *");
				break;
			}
			break;
		case 3:
			break;
			
		default:
			System.out.println("* Opcion no valida *");
			break;

		}
	}

}
