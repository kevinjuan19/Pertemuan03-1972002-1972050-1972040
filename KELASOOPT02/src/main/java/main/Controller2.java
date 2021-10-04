package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class Controller2 {

    @FXML
    private TextField name;

    @FXML
    private TextField kat;

    @FXML
    private TextField uts;

    @FXML
    private TextField uas;

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    void inputData(ActionEvent event) {
        String nama=name.getText();
        double  n1= Double.parseDouble(kat.getText());
        double  n2= Double.parseDouble(uts.getText());
        double  n3= Double.parseDouble(uas.getText());
        Student student = new Student(nama,n1,n2,n3);
        controller.getStudents().add(student);
        ((Node) event.getSource()).getScene().getWindow().hide();
    }


}
