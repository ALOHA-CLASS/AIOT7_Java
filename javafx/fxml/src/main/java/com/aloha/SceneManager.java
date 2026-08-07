package com.aloha;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneManager {

    // 현재 사용중인 Scene
    private static Scene scene;

    /**
     * Scene 등록
     * @param scene
     */
    public static void setScene(Scene scene) {
        SceneManager.scene = scene;
    }

    /**
     * FXML 화면 전환
     * @param fxml
     */
    public static void go(String fxml) {
        try {
            // FXML 파일 로드
            Parent root = loadFXML(fxml);
            // Scene 의 Root 변경
            scene.setRoot(root);
            // FXML 에 지정된 크기로 Stage 크기 변경
            scene.getWindow().sizeToScene();
        } catch (Exception e) {
            System.err.println(fxml + ".fxml 파일을 불러올 수 없습니다.");
            e.printStackTrace();
        }
    }

    /**
     * FXML 파일 로드
     * @param fxml : FXML  파일명
     * @return : FXML 의 Root 컨테이너
     * @throws IOException 
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            SceneManager.class.getResource(fxml + ".fxml")
        );
        return loader.load();
    }

    
}
