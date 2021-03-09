package interfaces;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	//추상메소드(구현x)
	void turnOn(); 
	void turnOff();
	void setVolume(int volume);
}
