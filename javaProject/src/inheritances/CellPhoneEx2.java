package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone(); // 부모클래스는 자식클래스의 인스턴스를 담는다.

		// cp = (CellPhone) new DmbPhone(); // int = byte;

		if (cp instanceof DmbPhone) { //인스턴스 여부 체크
			DmbPhone dp = (DmbPhone) cp; // 강제형변환
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("casting 할 수 없습니다.");
		}
		
		//다형성.
		//부모 = 자식들...
		// 부모.메소드 = 자식.메소드;
		
		cp = new DmbPhone();
		cp.powerOn();
		cp = new SmartPhone();
		cp.powerOn();
		
	}
}
