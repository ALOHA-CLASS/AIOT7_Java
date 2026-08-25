package com.aloha.controller;

import com.aloha.dto.Board;
import com.aloha.service.BoardService;
import com.aloha.service.BoardServiceImpl;
import com.aloha.util.DataReceiver;
import com.aloha.util.SceneManager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadController implements DataReceiver {

    @FXML private TextField inputTitle;
    @FXML private TextField inputWriter;
    @FXML private TextArea inputContent;

    Integer no;        // 게시글 번호

    BoardService boardService = new BoardServiceImpl();

    @FXML
    void initialize() {
        Platform.runLater(() -> {
            Board board = boardService.select(no);

            inputTitle.setText(board.getTitle());
            inputWriter.setText(board.getWriter());
            inputContent.setText(board.getContent());
        });
    }

    @FXML
    void list(ActionEvent event) {
        // 게시글 목록 화면으로 이동
        SceneManager.go("UI/Main");
    }

    @FXML
    void update(ActionEvent event) {
        // 게시글 번호를 전달하면서 수정 화면으로 이동
        SceneManager.go("UI/Update", this.no);
    }

    @Override
    public void receiveData(Object data) {
        this.no = (Integer) data;
    }
}