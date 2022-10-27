package cl.generation.F20221026;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		String nombreCompleto = obtenerNom();
		System.out.println("Su Nombre completo es: " + nombreCompleto);
		Float IMC = calculoIMC();
		System.out.println("Su IMC es: " + IMC);
		nivelIMC(IMC);

	}

	public static String obtenerNom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su Nombre");
		String nombre = sc.next();
		System.out.println("Ingrese su Apellido Paterno");
		String apePaterno = sc.next();
		String nomCompleto = nombre + " " + apePaterno;
		sc.close();
		return nomCompleto;
	}

	public static Float calculoIMC() {
		// capturar datos ingresados por el usuario
		Scanner sc = new Scanner(System.in);
		// calculo del IMC; IMC = KG/(estatura*estatura)
		System.out.println("Ingrese su peso en KG: ");
		Float KG = sc.nextFloat();
		System.out.println("Ingrese su estatura en MTS: ");
		Float MTS = sc.nextFloat();
		Float IMC = KG / (MTS * MTS);

		sc.close();

		return IMC;
	}

	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
		 * mas Obeso
		 */
		if (IMC < 18.5F) {
			System.out.println("El paciente esta bajo de peso");
		} else if (IMC >= 18.5F && IMC < 25F) {
			System.out.println("El paciente esta en peso normal");
		} else if (IMC >= 25F && IMC < 30F) {
			System.out.println("El paciente esta con sobre peso");
		} else {
			System.out.println("El paciente esta con obesidad");
		}
	}

}
