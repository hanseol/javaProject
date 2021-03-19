package myapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//컨트롤 - label, button
		Label label = new Label(); 
		label.setText("Hello, JavaFX"); // 라벨에 보여 줄 문구
		label.setFont(new Font(50)); //50 pix
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit();
			}
			
		}); //버튼을 눌렀을 때 이벤트 생성
		
		//컨테이너
		VBox root = new VBox(); 
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		//컨테이너를 scene의 매개값으로.
		Scene scene = new Scene(root);
		//stage의 매개값으로 scene 달아줌.
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args); //Application.launch(메인메소드 매개변수)
	}

}
