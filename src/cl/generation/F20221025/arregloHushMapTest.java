package cl.generation.F20221025;

import java.util.HashMap;

public class arregloHushMapTest {

	public static void main(String[] args) {
		// HashMap
		// llave, valor(key,value)
		HashMap<Integer, String> grupo3 = new HashMap<Integer, String>();
		grupo3.put(11, "Sebastian");
		grupo3.put(2, "Barbara");
		grupo3.put(33, "Brisa");
		grupo3.put(4, "Gerald");
		grupo3.put(55, "Fatima");
		grupo3.put(6, "kk");
		grupo3.put(6, "Squirr3l"); // si existe esa key sobre escribe le value
		System.out.println("map " + grupo3);
		// tamano map
		System.out.println(grupo3.size());
		// acceder al dato
		System.out.println(grupo3.get(33));
		// eliminar un par de datos
		grupo3.remove(6);
		System.out.println("map " + grupo3);
		// recorre un map
		/*for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
			
		}*/
		for (Integer clave : grupo3.keySet()) {
			System.out.println("clave: "+ clave + " / valor: " + grupo3.get(clave));
		}
	}

}
