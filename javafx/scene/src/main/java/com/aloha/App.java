package com.aloha;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    // 화면 A, B 객체 선언
    private static Scene sceneA, sceneB;

    @Override
    public void start(Stage stage) throws IOException {
        // Scene A 생성
        // 컨테이너 생성 (StackPane)
        StackPane containerA = new StackPane();
        // 컨테이너를 지정하여 sceneA 생성
        sceneA = new Scene(containerA, 300, 200);
        // 버튼 생성
        Button switchButton = new Button("B 화면으로 이동");
        // 컨테이너 아래 버튼 지정
        containerA.getChildren().add(switchButton);
        // 버튼 클릭 이벤트 정의 : B 화면으로 이동
        switchButton.setOnAction( e -> stage.setScene(sceneB) );

        // Scene B 생성
        Button backButton = new Button("A 화면으로 이동");       // 버튼 생성
        backButton.setOnAction( e -> stage.setScene(sceneA) );  // 화면A 로 이동하는 클릭이벤트
        StackPane containerB = new StackPane(backButton);       // 컨테이너 버튼 지정
        sceneB = new Scene(containerB, 300, 200);               // 컨테이너 지정하여 sceneB 생성
        
        // 시작 화면 Scene 설정
        stage.setScene(sceneA);                             // 화면 A 로 시작
        stage.setTitle("Java FX - Scene 화면 이동");         // 윈도우 타이틀 지정
        stage.show();                                       // 윈도우 출력
    }

    public static void main(String[] args) {
        launch();
    }

}