package cl.generation.F20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arreglos (array) en java
		//(Estaticos, no cambia de tamanp)
		int[] arreglo = new int[3];
		//agregar datos
		arreglo[0]= 4;
		arreglo[1]= 8;
		arreglo[2]= 12;
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		
		//{}
		int[] pares = {};//cero
		System.out.println(pares.length);
		
		String[] vocales= {"a","e","i","o","u"};
		System.out.println("CANTIDAD DE ELEMENTOS "+vocales.length);
		vocales[1]="o";
		vocales[3]="e";
		vocales[2]="y";
		System.out.println(Arrays.toString(vocales));
		
		int[] sinNumeros = {};
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78; //para un arreglo vacio NO SE PUEDE
		System.out.println(Arrays.toString(sinNumeros));
		
		//crear un array de numeros flotantes de tamano 6
		float[]tarea = new float [6];
		tarea[0]= 33;
		tarea[1]=(float) Math.random()+1;
		tarea[2]=-0.6f;
		System.out.println(Arrays.toString(tarea));
		
		/*
		 * crear un arreglo de enteros tamano 100 y 
		 * agregar valores dinamicamente
		 * desde el 1 al 100
		 */
		int[] dinamic = new int [100];
		for (int i=1; i<=100; i++) {
			dinamic[i-1]= i;
		}
		System.out.println(Arrays.toString(dinamic));
		
		//del 100 al 1
		int[] del100al1 = new int [100];
		for (int i=1; i<=100; i++) {
			del100al1[100-i]= i;
		}
		System.out.println(Arrays.toString(del100al1));
		
	}

}