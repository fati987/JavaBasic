package cl.generation.F20221027;

public class UsoObejto {

	public static void main(String[] args) {
		// instacia de clase
		Auto auto1 = new Auto();
		//asigar valores a los atributos priv
		//solo a traves del metodo setter
		auto1.setColor("Rojo"); 
		auto1.setMarca("Susuki");
		
		//consultar los atributos (contenido)
		System.out.println(auto1.getMarca());
		
		//saber el contenido de los atributos 
		System.out.println(auto1.toString());
		
		Auto car = new Auto("Nissan", "Negro","Qashqai0", 1.6f,10f,240f);
		System.out.println(auto1.getModelo());
		
		auto1.setRendimiento(80f);
		
		System.out.println(car.toString());
		
	}
}
