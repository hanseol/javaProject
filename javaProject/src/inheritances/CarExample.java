package inheritances;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i<7; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("frontLeft HankookTire replaced");
				car.frontLeft = new HankookTire("frontLeft", 10);
				break;
			case 2:
				System.out.println("frontRight HankookTire replaced");
				car.frontRight = new HankookTire("frontRight", 12);
				break;
			case 3: 
				System.out.println("backLeft KumohTire replaced");
				car.backLeft = new KumhoTire("backLeft", 15);
				break;
			case 4:
				System.out.println("backLeft KumohTire repalced");
				car.backRight = new KumhoTire("backRight", 20);
			}
		}
	}
}
