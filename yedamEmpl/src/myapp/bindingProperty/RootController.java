	package myapp.bindingProperty;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML
	private TextArea textArea1;
	@FXML
	private TextArea textArea2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
		//textArea1 의 속성이 변하면 textArea2의 속성도 변경하겠다. (양방향 가능)
	}

}
