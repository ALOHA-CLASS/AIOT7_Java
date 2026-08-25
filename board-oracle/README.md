# 게시판 프로그램 만들기

## 오라클 연결 확인
1. ojdbc11.jar 드라이버 찾기
    - [오라클홈]\jdbc\lib
    - ~\WINDOWS.X64_213000_db_home\jdbc\lib
2. 자바 프로젝트 생성
    - 프로젝트 타입 : NO BUILD TOOLS
    - 프로젝트 명   : board-oracle
3. 라이브러리 추가하기
    - lib 폴더에 ojdbc11.jar 파일을 복사한다.
4. 라이브러리 확인하기
    - Java Projects 를 열어서 Referecned Library 에 있는지 확인
    - 없으면 [+] 눌러서 추가해준다.
5. 데이터베이스 접속 확인
    - JDBConnection.java 파일에서 접속정보를 수정한다.
        * 호스트 : localhost
        * 포트 : 1521
        * SID : orcl
        * 아이디 : aloha
        * 비밀번호 : 123456
    - 연결성공! 메시지 확인


## 프로젝트 파일 구조
1. 패키지 생성
    - DTO
    - DAO
    - Service
2. 클래스 파일 생성
    - DTO/Board.java
    - DAO/BoardDAO.java
    - Service
        - BoardService.java         (인터페이스)
        - BoardServiceImpl.java
    - Main.java


## 라이브러리 추가
- lombok.jar 


## DB 테이블 및 시퀀스 생성
- board 테이블 생성
- BOARD_SEQ 시퀀스 생성

## DAO 데이터 접근 객체 정의
* BoardDAO.java
1. 목록, 단일 조회 메소드 - list(), select()
2. 등록 메소드 - insert()
3. 수정 메소드 - update()
4. 삭제 메소드 - delete()

* 주요 작업 내용
- DB에 요청할 SQL 코드 작성
- SQL 요청 메소드 호출
- 결과 확인 

* JDBConnection 클래스를 상속하여 연결 객체들을 재사용한다.

## Service 로직 작성
- BoardService 인터페이스에 기능별로 추상 메소드 정의
- BoardServiceImpl 구현 클래스에서 BoardService 인터페이스를 구현
- 인터페이스의 모든 추상메소드를 오버라이딩해서 로직 작성
* 정의할 기능 메소드
    - 목록
    - 조회
    - 등록
    - 수정
    - 삭제

## 콘솔 화면 작성
```
    :::::::::: 게시판 ::::::::::
    1. 게시글 목록
    2. 게시글 조회
    3. 게시글 등록
    4. 게시글 수정
    5. 게시글 삭제
    0. 프로그램 종료
    :::::::::: 번호 입력 : 
```

1. 메뉴판 출력  - menu()
2. 게시글 목록  - list(), print(), printAll()
    - BoardService 의 list() 메소드 호출
    - List<Board> 를 가져와서 전체 반복하여 출력
3. 게시글 조회  - select(), print()
    - (입력) 글 번호 : 
    - BoardService 의 select(no) 에 글번호를 전달하여 호출
    - Board 를 가져와서 출력
4. 게시글 등록  - insert()
    - (입력) 제목 :  / 작성자 : / 내용 : 
    - Board 객체를 생성하여 입력한 정보를 초기화
    - BoardService 의 insert(board) 메소드로 전달하여 호출
5. 게시글 수정  - update()
    - (입력) 번호 :  / 제목 :  / 작성자 : / 내용 : 
    - Board 객체를 생성하여 입력한 정보를 초기화
    - BoardService 의 update(board) 메소드로 전달하여 호출
6. 게시글 삭제  - delete()
    - (입력) 번호 :  
    - BoardService 의 delete(no) 메소드로 전달하여 호출


## 한글 입력 문제 해결
- 터미널에서 아래 코드를 입력해서 UTF-8 인코딩으로 설정해준다
```
    chcp 65001
```