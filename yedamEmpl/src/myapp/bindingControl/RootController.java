package myapp.bindingControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML
	private Slider slider;
	@FXML
	private Label label;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//Number속성을 탐색할 수 있는 ObservableValue : Number 값이 바뀔때마다 바뀐값을 읽어올 수 있도록 하는 타입 (?)
				System.out.println(oldValue + "," + newValue);
				label.setFont(new Font(newValue.doubleValue()));//속성이 바뀔때마다 리스너를 이용해서 changed를 호출하여 값을 바꿔줌.
				//슬라이더가 가지고있는 속성값을 읽어와서 setFont메소드를 이용하여 라벨의 크기를 지정.
			}
		});
	}

}
