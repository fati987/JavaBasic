package cl.generation.F20221102.interfaces;

public class Leon extends Carnivoro implements Generico {

	@Override
	public void metodoEnAnimal() {
		// TODO Auto-generated method stub
		System.out.println("Este es un animal CARNIVORO");
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void comer() {
		System.out.println("Come carne");

	}

	@Override
	public String toString() {
		return "Leon [getAltura()=" + getAltura() + ", getPeso()=" + getPeso() + "]";
	}

}
