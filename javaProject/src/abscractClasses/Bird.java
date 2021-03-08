package abscractClasses;

public class Bird extends Animal {

	public Bird() {
		
	}
	public Bird(String species) {
		this.species = species;
	}

	@Override
	public void sound() {
		System.out.println("짹짹짹");
	}

}
