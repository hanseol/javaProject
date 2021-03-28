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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML
	TableView<Student> tableView;
	@FXML
	Button addBtn, barchartBtn;
	@FXML
	TextField korean, math, english;

	private Stage insertStage,barchartStage,piechartStage;

	ObservableList<Student> list = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		TableColumn<Student, String> tcName = (TableColumn<Student, String>) tableView.getColumns().get(0);
		tcName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		tcName.setStyle("-fx-alignment: CENTER;");
		TableColumn<Student, Integer> tcKorean = (TableColumn<Student, Integer>) tableView.getColumns().get(1);
		tcKorean.setCellValueFactory(new PropertyValueFactory<Student, Integer>("korean"));
		tcKorean.setStyle("-fx-alignment: CENTER;");
		TableColumn<Student, Integer> tcMath = (TableColumn<Student, Integer>) tableView.getColumns().get(2);
		tcMath.setCellValueFactory(new PropertyValueFactory<Student, Integer>("math"));
		tcMath.setStyle("-fx-alignment: CENTER;");
		TableColumn<Student, Integer> tcEnglish = (TableColumn<Student, Integer>) tableView.getColumns().get(3);
		tcEnglish.setCellValueFactory(new PropertyValueFactory<Student, Integer>("english"));
		tcEnglish.setStyle("-fx-alignment: CENTER;");

		tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getClickCount()>1) {
					Stage stage = new Stage(StageStyle.DECORATED);
					stage.initModality(Modality.WINDOW_MODAL);
					stage.initOwner(piechartStage);
					
					try {
						BorderPane bp = FXMLLoader.load(getClass().getResource("Piechart.fxml"));
						
						PieChart pieChart = (PieChart) bp.lookup("#pieChart");
						
						pieChart.setData(FXCollections.observableArrayList(
								new PieChart.Data("국어", tableView.getSelectionModel().getSelectedItem().getKorean()),
								new PieChart.Data("수학", tableView.getSelectionModel().getSelectedItem().getMath()),
								new PieChart.Data("영어", tableView.getSelectionModel().getSelectedItem().getEnglish())
						));
						
						Button closeBtn = (Button) bp.lookup("#closeBtn");
						closeBtn.setOnAction(e -> stage.close());
						
						Scene scene = new Scene(bp);
						stage.setScene(scene);
						stage.show();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	public void showBtnAction(ActionEvent event) {

		Stage stage = new Stage(StageStyle.DECORATED);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(barchartStage);

		try {
			BorderPane bp = FXMLLoader.load(getClass().getResource("Barchart.fxml"));
			

			BarChart barChart = (BarChart) bp.lookup("#barChart");

			XYChart.Series<String, Integer> series1 = new XYChart.Series<String, Integer>();
			ObservableList<XYChart.Data<String, Integer>> data1 = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				data1.add(new XYChart.Data<String, Integer>(list.get(i).getName(), list.get(i).getKorean()));
			}
			series1.setData(data1);
			series1.setName("국어");

			XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>();
			ObservableList<XYChart.Data<String, Integer>> data2 = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				data2.add(new XYChart.Data<String, Integer>(list.get(i).getName(), list.get(i).getMath()));
			}
			series2.setData(data2);
			series2.setName("수학");

			XYChart.Series<String, Integer> series3 = new XYChart.Series<String, Integer>();
			ObservableList<XYChart.Data<String, Integer>> data3 = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				data3.add(new XYChart.Data<String, Integer>(list.get(i).getName(), list.get(i).getEnglish()));
			}
			series3.setData(data3);
			series3.setName("영어");

			barChart.getData().add(series1);
			barChart.getData().add(series2);
			barChart.getData().add(series3);
			
			Scene scene = new Scene(bp);
			stage.setScene(scene);
			stage.show();
			
			Button closeBtn = (Button) bp.lookup("#closeBtn");
			closeBtn.setOnAction(e -> stage.close());
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void addBtnAction(ActionEvent e) {
		Stage stage = new Stage(StageStyle.DECORATED);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(insertStage);

		try {
			BorderPane bp = FXMLLoader.load(getClass().getResource("Form.fxml"));
			Scene scene = new Scene(bp);
			stage.setScene(scene);
			stage.show();

			Button btnSave = (Button) bp.lookup("#btnSave");
			btnSave.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					TextField txtName = (TextField) bp.lookup("#name");
					TextField txtKorean = (TextField) bp.lookup("#korean");
					TextField txtMath = (TextField) bp.lookup("#math");
					TextField txtEnglish = (TextField) bp.lookup("#english");

//					Student student = new Student(txtName.getText(),
//								Integer.parseInt(txtKorean.getText()),
//								Integer.parseInt(txtMath.getText()),
//								Integer.parseInt(txtEnglish.getText()));

					Student student = new Student();
					student.setName(txtName.getText());
					student.setKorean(Integer.parseInt(txtKorean.getText()));
					student.setMath(Integer.parseInt(txtMath.getText()));
					student.setEnglish(Integer.parseInt(txtEnglish.getText()));

					list.add(student);
					tableView.setItems(list);
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
