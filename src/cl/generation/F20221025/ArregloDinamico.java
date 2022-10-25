package cl.generation.F20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		//1 definicion
		//ArrayList<tipodedato> nombre_array = new ArrayList<tipodedato>();
		ArrayList<String> grupo3 = new ArrayList<String>();
		//2 agregar valores al arreglo
		grupo3.add("Sebastian");
		grupo3.add("Barbara");
		grupo3.add("Brisa");
		grupo3.add("Gerald");
		grupo3.add("Fatima");
		grupo3.add("kk");
		System.out.println(grupo3);
		//3 tamano del arraylis
		System.out.println(grupo3.size());//arreglos dinamicos
		//4 obtener un elemento dentro del arreglo
		System.out.println(grupo3.get(4));
		//System.out.println(grupo3.get(6));// fuera de indice
		//5 eliminar un elemento
		grupo3.remove(5);
		System.out.println(grupo3);
		//5.1 agregar un elemento
		grupo3.add("Squirr3l");
		//6 recorrer el ArrayList
		for(int i = 0; i<grupo3.size();i++) {
			System.out.println("Integrante N"+ (i+1) + ": "+ grupo3.get(i));
		}
		
		//for iterador o de objeto
		System.out.println("***********************");
		for (String integrante: grupo3) {
			System.out.println(integrante);
		}
	}

}
