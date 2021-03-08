package interfaces;

public class Television implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("tv on");
	}

	@Override
	public void turnOff() {
		System.out.println("tv off");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은 " + volume );
	}

}
