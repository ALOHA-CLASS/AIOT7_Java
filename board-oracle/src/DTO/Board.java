package DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

// 게시글 정보 객체 정의하기
// 글번호, 제목, 작성자, 내용, 등록일자, 수정일자
@Data
@AllArgsConstructor
public class Board {

    private int no;
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    public Board() {
        this("[제목없음]", "[작성자없음]", "");
    }

    public Board(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }
    
}
