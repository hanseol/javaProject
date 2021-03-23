package myapp.buttonControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {
	@FXML
	Button btn1, btn2, btn3;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		방법1.EventHandler 생성
//		btn1.setOnAction(event->handleBtn1Action(event));
//		btn2.setOnAction(event->handleBtn2Action(event));
//		btn3.setOnAction(event->handleBtn3Action(event));
	}
//	방법2. Button 컨트롤을 작성할 때 onAction 속성값으로 #메소드명을 입력 ->해당 메소드만 작성하면 된다.
	public void handleBtn1Action(ActionEvent e) {
		System.out.println("button1 click");
	}
	public void handleBtn2Action(ActionEvent e) {
		System.out.println("button2 click");
	}
	public void handleBtn3Action(ActionEvent e) {
		Platform.exit();
	}
}
