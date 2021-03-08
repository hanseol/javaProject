package inheritances;

public class Car {
	Tire frontLeft = new Tire("frontLeft",6);
	Tire frontRight = new Tire("frontRight",5);
	Tire backLeft = new Tire("backLeft",3);
	Tire backRight = new Tire("backRight",7);
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeft.roll()==false) {
			stop();
			return 1;
		}
		if(frontRight.roll()==false) {
			stop();
			return 2;
		}
		if(backLeft.roll()==false) {
			stop();
			return 3;
		}
		if(backRight.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
