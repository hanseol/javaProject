package study;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
	
	public static class Tire{
		public void run() {
			System.out.println("normal tire @@@");
		}
	}
	public static class SnowTire extends Tire {
		@Override
		public void run() {
			System.out.println("snow tire !@@@");
		}
	}
	
}
