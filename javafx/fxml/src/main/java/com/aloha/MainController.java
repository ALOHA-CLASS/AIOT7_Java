package com.aloha;

import javafx.event.Event;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void main(Event e) {
        System.out.println("메인 화면!");
        SceneManager.go("Main");
    }

    @FXML
    void login(Event e) {
        System.out.println("로그인 화면!");
        SceneManager.go("Login");
    }

    @FXML
    void join(Event e) {
        System.out.println("회원가입 화면!");
        SceneManager.go("Join");
    }

    @FXML
    void menu(Event e) {
        System.out.println("메뉴 화면!");
        SceneManager.go("Menu");
    }

    @FXML
    void board(Event e) {
        System.out.println("게시판 화면!");
        SceneManager.go("Board");
    }
    
}
