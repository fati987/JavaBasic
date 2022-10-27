package cl.generation.F20221026;

import java.util.Scanner;

public class BucleDOWhileTest {

	public static void main(String[] args) {
		// doWhile
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		Float KG = 0F;
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();

		} while (edad < 18 || edad > 120);
		System.out.println("Con " + edad + " anos, puedes ingresar al sitio web");

		// KG
		do {
			System.out.println("Ingrese su peso");
			KG = sc.nextFloat();

		} while (KG < 40 || KG > 200);
		System.out.println("Su peso es de " + KG + " KG");
		sc.close();
	}

}
