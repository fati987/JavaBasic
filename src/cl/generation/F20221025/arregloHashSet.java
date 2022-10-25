package cl.generation.F20221025;

import java.util.HashSet;

public class arregloHashSet {

	public static void main(String[] args) {
		// set o HashSet
		// agrega datos unicos y no sigue un orden de ingreso, sensible a mayus y minus
		// HashSet<tipodedato> nombre_array = new HashSet<tipodedato>();
		HashSet<String> grupo3 = new HashSet<String>();
		// agregar elementos
		grupo3.add("Sebastian");
		grupo3.add("Barbara");
		grupo3.add("Brisa");
		grupo3.add("Gerald");
		grupo3.add("Fatima");
		grupo3.add("Barbara");
		grupo3.add("kk");
		System.out.println(grupo3);
		// verificar el contenido
		boolean verificarNombre = grupo3.contains("Sebastian");
		System.out.println("Existe el integrante? " + verificarNombre);
		// eliminar un elemento
		grupo3.remove("kk");
		System.out.println(grupo3);
		// tamano arreglo
		System.out.println("Tamano del HashSet: " + grupo3.size());
		//recorrer el HushSet
		System.out.println("***********************");
		for (String integrante : grupo3) {
			System.out.println("Nombre del integrante: " + integrante);
		}
	}

}
