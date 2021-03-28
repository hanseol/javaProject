package myapp.viewPackage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class RootController implements Initializable{
	@FXML private ListView<String> listView; //ListView<아이템타입>
	@FXML private TableView<Phone> tableView; //TableView<모델클래스>
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/* listView 보여주는 컬럼이 1개 */
//		ObservableList<String> list1 = FXCollections.observableArrayList();
//		list1.add("GalaxyS8");
//		listView.setItems(list1);
		listView.setItems(FXCollections.observableArrayList(
			"갤럭시S1",
			"갤럭시S2", 
			"갤럭시S3",
			"갤럭시S4", 
			"갤럭시S5",
			"갤럭시S6",
			"갤럭시S7"
		));
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});
		
		ObservableList<Phone> phoneList = FXCollections.observableArrayList(
			new Phone("갤럭시S1","phone01.png"),
			new Phone("갤럭시S2","phone02.png"),
			new Phone("갤럭시S3","phone03.png"),
			new Phone("갤럭시S4","phone04.png"),
			new Phone("갤럭시S5","phone05.png"),
			new Phone("갤럭시S6","phone06.png"),
			new Phone("갤럭시S7","phone07.png")
		);
		
		/*table view - 컬럼에 매치되는 값이 무엇인지 정의필요 */
		//TableColumn<Phone, String> tcSmartPhone = new TableColumn<Phone,String>(); // getColumns 메소드 사용
		TableColumn<Phone, String> tcSmartPhone = (TableColumn<Phone,String>)tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory<Phone,String>("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");
		//Callback을 정의하여 smartPhoneProperty()를 리턴해주는 방법.
//		tcSmartPhone.setCellValueFactory(new Callback<CellDataFeatures<Phone,String>,ObservableValue<String>>(){
//			@Override
//			public ObservableValue<String> call(CellDataFeatures<Phone, String> arg0) {
//				return arg0.getValue().smartPhoneProperty();
//			}
//		});
		
		
		TableColumn<Phone,String> tcImage = (TableColumn<Phone, String>) tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image")); //매개값으로 속성컬럼 이름을 넣어주는 방법 -**질문
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(phoneList);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				if(newValue!=null) {
					imageView.setImage(new Image(getClass().getResource("/images/" + newValue.getImage()).toString()));
				}
			}
		});
	}
	
	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView 스마트폰: "+item);
		
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println(phone.getSmartPhone());
		System.out.println(phone.getImage());
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
