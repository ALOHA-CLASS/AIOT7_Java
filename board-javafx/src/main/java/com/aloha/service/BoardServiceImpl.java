
package com.aloha.service;

import java.util.List;

import com.aloha.dao.BoardDAO;
import com.aloha.dto.Board;

public class BoardServiceImpl implements BoardService {

    private BoardDAO boardDAO = new BoardDAO();

    @Override
    public List<Board> list() {
        // DAO 객체로 게시글 목록을 요청
        List<Board> boardlist = boardDAO.list();
        // 게시글 목록 데이터 반환
        return boardlist;
    }

    @Override
    public Board select(int no) {
        // 게시글 번호 no 를 DB 로 넘겨주고 게시글 정보 요청
        Board board = boardDAO.select(no);
        // 게시글 정보 반환
        return board;
    }

    @Override
    public int insert(Board board) {
        // 게시글 정보를 전달하여 DB 에 데이터 등록 요청
        int result = boardDAO.insert(board);
        // - result(결과)       : 0 --> 데이터 등록 실패
        //                        1 --> 데이터 등록 성공
        if( result > 0 ) System.out.println("데이터 등록 성공!");
        else System.out.println("데이터 등록 실패!");
        return result;
    }

    @Override
    public int update(Board board) {
        int result = boardDAO.update(board);
        if( result > 0 ) System.out.println("데이터 수정 성공!");
        else System.out.println("데이터 수정 실패!");
        return result;
    }

    @Override
    public int delete(int no) {
        int result = boardDAO.delete(no);
        if( result > 0 ) System.out.println("데이터 삭제 성공!");
        else System.out.println("데이터 삭제 실패!");
        return result;
    }
    
}
