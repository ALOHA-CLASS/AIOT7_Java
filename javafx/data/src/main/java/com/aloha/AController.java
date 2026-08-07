package com.aloha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AController {

    @FXML
    private TextField input;

    // B 화면으로 이동하며 데이터 전달
    @FXML
    void to(ActionEvent event) {
        String data = input.getText();
        SceneManager.go("B", data);
    }

    // C 화면으로 이동하며 데이터 전달
    @FXML 
    public void toC() {
        String data = input.getText();
        SceneManager.go("C", data);
    }
}