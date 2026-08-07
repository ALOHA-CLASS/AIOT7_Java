package com.aloha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BController implements DataReceiver {

    @FXML
    private TextField input;

    // SceneManager.go() 실행 시 데이터가 주입됩니다.
    @Override
    public void receiveData(Object data) {
        if (data instanceof String text) {
            input.setText(text);
        }
    }

    @FXML
    void to(ActionEvent event) {
        // C 화면으로 이동 예시
        SceneManager.go("C", input.getText());
    }
}