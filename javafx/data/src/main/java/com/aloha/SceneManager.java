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
        go(fxml, null);
    }

    /**
     * FXML 화면 전환
     * @param fxml
     */
    public static void go(String fxml, Object data) {
        try {
            // FXMLoader 생성
            FXMLLoader loader = getFXMLLoader(fxml);
            Parent root = loader.load();

            // Controller 가져오기
            Object controller = loader.getController();
            // 데이터가 있고, DataReceiver 인터페이스를 구현한 클래스면, 데이터 전달 메소드 실행
            if( data != null && controller instanceof DataReceiver receiver) {
                receiver.receiveData(data);
            }

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
     * FXMLLoader 객체 생성 Helper 메소드
     * @param fxml
     * @return
     */
    private static FXMLLoader getFXMLLoader(String fxml) {
        return new FXMLLoader( SceneManager.class.getResource(fxml + ".fxml") );
    }

    /**
     * FXML 파일 로드
     * @param fxml : FXML  파일명
     * @return : FXML 의 Root 컨테이너
     * @throws IOException 
     */
    private static Parent loadFXML(String fxml) throws IOException {
        return getFXMLLoader(fxml).load();
    }

    
}
