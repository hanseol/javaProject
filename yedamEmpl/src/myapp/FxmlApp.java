package myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("viewPackage/Root.fxml")); //상대경로
		//container를 Scene의 매개값으로.
		Scene scene = new Scene(root);
		//stage의 parameter로 Scene을 달아줌.
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
