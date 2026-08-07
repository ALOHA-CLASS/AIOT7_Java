package com.aloha;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("A.fxml"));
        scene = new Scene(root);
        SceneManager.setScene(scene);
        stage.setScene(scene);
        stage.setTitle("FXML - 컨트롤러, 화면이동");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}