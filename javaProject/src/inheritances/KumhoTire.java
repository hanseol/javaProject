package inheritances;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //부모생성자 호출
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumohTire 수명 : "
					+ (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "KumohTire 펑크 ***");
			return false;
		}
	}
	
}
