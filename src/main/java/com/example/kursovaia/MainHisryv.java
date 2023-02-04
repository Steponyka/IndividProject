package com.example.kursovaia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainHisryv extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("historyv.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 337, 284);
        stage.setTitle("Больница");
        stage.getIcons().add(new Image("12345.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)  {
        launch();

    }
}
