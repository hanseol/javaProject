package inheritances;

public class SmartPhone extends DmbPhone {

	@Override
	void powerOn() {
		System.out.println("SmartPhone 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("SmartPhone 전원을 끕니다.");
	}

	@Override
	public String toString() {
		return "SmartPhone => model :" + model + "color :" + color + " channel :" + channel;
	}

}
