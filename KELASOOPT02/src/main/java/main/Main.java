package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle("Table Student");
        stage.setScene(scene);
        stage.show();
    }
}
