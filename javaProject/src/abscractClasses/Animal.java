package abscractClasses;

public abstract class Animal {
	String species;
	
	public Animal() {
		
	}
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("종류는 " + this.species);
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드 Animal 클래스를 상속받는 클래스에 꼭 필요한 메소드.
	
	
}
