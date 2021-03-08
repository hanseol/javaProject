package inheritances;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //부모클래스의 생성자를 호출
		
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HanKookTire 수명 : "
					+ (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "HankkokTire 펑크 ***");
			return false;
		}
	}
	
	
	
}
