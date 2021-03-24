package myapp.score;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class RootController implements Initializable {
	@FXML TableView<Student> tableView;
	@FXML Button addBtn;
	@FXML TextField korean, math, english;
	
	private Stage primaryStage;
	
	public void setprimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	ObservableList<Student> studentList = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		if(this.tableView!=null) {
			TableColumn<Student, String> tcName = (TableColumn<Student, String>) tableView.getColumns().get(0);
			tcName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));

			TableColumn<Student, Integer> tcKorean = (TableColumn<Student, Integer>) tableView.getColumns().get(1);
			tcKorean.setCellValueFactory(new PropertyValueFactory<Student, Integer>("korean"));

			TableColumn<Student, Integer> tcMath = (TableColumn<Student, Integer>) tableView.getColumns().get(2);
			tcMath.setCellValueFactory(new PropertyValueFactory<Student, Integer>("math"));

			TableColumn<Student, Integer> tcEnglish = (TableColumn<Student, Integer>) tableView.getColumns().get(3);
			tcEnglish.setCellValueFactory(new PropertyValueFactory<Student, Integer>("english"));

			tableView.setItems(studentList);
			}
	}

	public void addBtnAction(ActionEvent e) {
		Stage stage = new Stage(StageStyle.DECORATED);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		
		try {
			BorderPane bp = FXMLLoader.load(getClass().getResource("Form.fxml"));
			Scene scene = new Scene(bp);
			stage.setScene(scene);
			stage.show();

			Button btnSave =(Button) bp.lookup("#btnSave");
			btnSave.setOnAction(new EventHandler<ActionEvent>() {
				//저장클릭시 윈도우의 TableView에 행이 추가되도록.
				@Override
				public void handle(ActionEvent arg0) {
					Student student = new Student();
					
					TextField txtName = (TextField) bp.lookup("#name");
					TextField txtKorean = (TextField) bp.lookup("#korean");
					TextField txtMath = (TextField) bp.lookup("#math");
					TextField txtEnglish = (TextField) bp.lookup("#english");

					
					student.setName(txtName.getText());
					student.setKorean(Integer.parseInt(txtKorean.getText()));
					student.setMath(Integer.parseInt(txtMath.getText()));
					student.setEnglihs(Integer.parseInt(txtEnglish.getText()));
					
					studentList.add(student);
					System.out.println();
					tableView.setItems(studentList);
				}
			});
			
			Button btnCancle = (Button) bp.lookup("#btnCancel");
			btnCancle.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					stage.close();
				}
			});
	
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
