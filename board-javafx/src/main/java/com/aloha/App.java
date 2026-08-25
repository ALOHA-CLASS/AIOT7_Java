package com.aloha;

import java.io.IOException;

import com.aloha.util.SceneManager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       SceneManager.initialize(stage, "UI/Main");
    }

    public static void main(String[] args) {
        launch();
    }

}