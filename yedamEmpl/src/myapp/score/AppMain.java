package myapp.score;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import myapp.viewPackage.BoardController;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Root.fxml"));
//		Parent root = loader.load();
//		BoardController controller = loader.getController();
//		controller.setprimaryStage(primaryStage);
//		Scene scene = new Scene(root);
//		primaryStage.setScene(scene);
//		primaryStage.show();
		
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); //상대경로
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
