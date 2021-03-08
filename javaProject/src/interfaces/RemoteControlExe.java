package interfaces;

public class RemoteControlExe {
	public static void main (String[] agrs) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//익명구현객체
		rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("dvd on");
			}

			@Override
			public void turnOff() {
				System.out.println("dvd off");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("dvd 볼륨 " + volume);
			} 
		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}
}
