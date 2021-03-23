package myapp.viewPackage;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	
	//문자열값으로 속성값을 지정가능.
	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}

	public String getSmartPhone() {
		return smartPhone.get();
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}

	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image.set(image);
	}
	
	//Callback의 ObservableValue값을 위한 함수.
	public SimpleStringProperty smartPhoneProperty() {
		return smartPhone;
	}
	public SimpleStringProperty imageProperty() {
		return image;
	}
	
}
