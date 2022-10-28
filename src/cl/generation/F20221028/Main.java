package cl.generation.F20221028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar estudiante
		/*
		 * Estudiante estudiante = new Estudiante("Faatima","Requena","21962584-0");
		 * System.out.println(estudiante.toString()); estudiante.setEdad(22);
		 * estudiante.setCorreo("m@m.cl"); estudiante.setCurso("6A");
		 * System.out.println(estudiante.toString());
		 */
		menu();
	}

	public static void menu() {
		System.out.println("***** MENU *****");
		System.out.println("1.-Agregar estudiante"); // todos los datos de una
		System.out.println("2.-Salir");

		int opciones = 0;
		int errorContador = 3;
		Scanner sc = new Scanner(System.in);
		Estudiante estudiante = new Estudiante();
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		int lista =0;

		do {
			System.out.println("Seleccione una opcion");
			opciones = sc.nextInt();
			if (opciones == 2) {
				System.out.println("Usted a salido del programa");
				break;
			} else if (opciones == 1) {
				errorContador--;
				System.out.println("Agrege la informacion del estudiante");
			} else {
				System.out.println("Adios");
				break;
			}
		} while (opciones < 1 || opciones > 2);

		do {
		switch (opciones) {
		case 1:
			System.out.println("Ingrese su nombre");
			String nombre = sc.next();
			estudiante.setNombre(nombre);
			System.out.println("Ingrese su apellido");
			estudiante.setApellido(sc.next());
			System.out.println("Ingrese su edad");
			estudiante.setEdad(sc.nextInt());
			System.out.println("Ingrese su telefono");
			estudiante.setRut(sc.next());
			System.out.println("Ingrese su curso");
			estudiante.setCurso(sc.next());
			System.out.println("Ingrese su correo");
			estudiante.setCorreo(sc.next());
			
			listaEstudiantes.add(estudiante);
			System.out.println(listaEstudiantes);
			break;

		default:
			break;
		} 
		
		}while (opciones ==1);
}
}
