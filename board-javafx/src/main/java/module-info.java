module com.aloha {

    // JavaFX 컨트롤 UI 기능을 사용하기 위한 모듈
    requires javafx.controls;

    // FXML 기능을 사용하기 위한 모듈
    requires javafx.fxml;

    // Lombok 기능을 사용하기 위한 모듈
    requires lombok;

    // JDBC 등 Java의 데이터베이스 기능을 사용하기 위한 모듈
    requires java.sql;


    // com.aloha 패키지의 클래스를 FXML에서 접근할 수 있도록 열어준다.
    opens com.aloha to javafx.fxml;

    // Controller 패키지를 FXML에서 Reflection으로 접근할 수 있도록 열어준다.
    opens com.aloha.controller to javafx.fxml;

    // DTO 패키지를 JavaFX의 Property/Bean 기능에서 접근할 수 있도록 열어준다.
    opens com.aloha.dto to javafx.base;


    // 외부 모듈에서 com.aloha 패키지를 사용할 수 있도록 공개한다.
    exports com.aloha;
}