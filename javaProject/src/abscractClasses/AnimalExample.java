package abscractClasses;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal(); //추상클래스는 인스턴스 생성 불가능
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.showInfo();
		animal.sound();
		
		animal = new Cat("포유류");
		animal.breathe();
		animal.showInfo();
		animal.sound();
	}
}
