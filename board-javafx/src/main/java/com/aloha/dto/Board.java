package com.aloha.dto;

import java.util.Date;

import javafx.scene.control.CheckBox;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// 게시글 정보 객체 정의하기
// 글번호, 제목, 작성자, 내용, 등록일자, 수정일자
@Data
// @NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Board {
	
	private CheckBox check;
	private int no;
	@NonNull private String title;
	@NonNull private String writer;
	@NonNull private String content;
	private Date createdAt;
	private Date updatedAt;
	
	public Board() {
		this.check = new CheckBox();
	}
	
}
