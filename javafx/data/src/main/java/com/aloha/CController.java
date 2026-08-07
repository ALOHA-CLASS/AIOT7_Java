package com.aloha;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CController implements DataReceiver {
    
    private Object receiveData;

    @FXML
    private TextField input;
    
    @FXML
    void initialize() {
        // 1번: loader.load() 순간 실행되므로 아직 receiveData는 null 상태
        System.out.println("# 1. initialize #");
        System.out.println("receiveData : " + this.receiveData);
        
        // 3번: 이벤트 큐에 들어갔다가 receiveData() 호출 이후에 실행됨
        Platform.runLater(() -> {
            System.out.println("# 3. runLater() #");
            System.out.println("receiveData : " + this.receiveData);
        });
    }
    
    // 2번: SceneManager.go() 내부에서 loader.load() 호출 직후 이어서 실행됨
    @Override
    public void receiveData(Object data) {
        if (data instanceof String text) {
            input.setText(text);
        }
        this.receiveData = data;
        System.out.println("# 2. receiveData() #");
        System.out.println("receiveData : " + receiveData);
    }
    
    @FXML
    void to(ActionEvent event) {
        // A 화면으로 돌아가기 예시
        SceneManager.go("A");
    }
}