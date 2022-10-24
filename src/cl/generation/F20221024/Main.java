package cl.generation.F20221024;

public class Main {

	public static void main(String[] args) {
		//las variables primitivas
		int numero = 2; //varible numerica
		float decimal = 2.5f;
		float decimal2 = (float)2.5;//castear
		long numero3 = 65344l;
		double decimal3 = 9.8d;
		
		char caracter = 'a';//siempre comillas simples
		
		boolean respuesta = true;
		
		System.out.println(numero+" "+numero3+" "+decimal);
		
		//variables de tipo objeto
		Integer numero2 = 2;
		String palabra = "blablabla";
		Long numero4 = 77546856L;
		Float decimal4 = 3.6F;
		Double decimal5 = 65465.56D;
		Boolean presente = false;
		
		//conversion a otros tipos de datos numericos
		int a = 693;
		float b = (float)a;
		double c = (long)b;
		Integer d = 58;
		
		System.out.println(a+ " "+b+ " "+c);
		System.out.println(d.longValue());
		System.out.println(d.valueOf(a));//retorna una variable no primitiva
	}

}
