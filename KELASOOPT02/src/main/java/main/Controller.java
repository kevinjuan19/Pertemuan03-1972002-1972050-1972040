package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Student> table1;
    @FXML
    private TableColumn<String,Student> column1;
    @FXML
    private TableColumn<String,Student> column2;
    @FXML
    private TableColumn<String,Student> column3;
    @FXML
    private TableColumn<String,Student> column4;
    @FXML
    private TableColumn<String,Student> column5;



    public ObservableList<Student>sList= FXCollections.observableArrayList();

    @FXML
    private void inputData() throws IOException {
       Stage new_stage = new Stage();
       FXMLLoader loader = new FXMLLoader(getClass().getResource("view2.fxml"));
       Parent root = loader.load();
       Controller2 c2 = loader.getController();
       c2.setController(this);
       Scene new_scene = new Scene(root);
       new_stage.setScene(new_scene);
       new_stage.setTitle("halaman input");
       new_stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        table1.setItems(sList);
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));
        column2.setCellValueFactory(new PropertyValueFactory<>("kat"));
        column3.setCellValueFactory(new PropertyValueFactory<>("uts"));
        column4.setCellValueFactory(new PropertyValueFactory<>("uas"));
        column5.setCellValueFactory(new PropertyValueFactory<>("na"));
        column1.setText("Nama");
        column2.setText("kat");
        column3.setText("uts");
        column4.setText("uas");
        column5.setText("na");

    }

    public ObservableList<Student> getStudents() {
        return sList;
    }
}
