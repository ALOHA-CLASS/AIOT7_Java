module com.aloha {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    opens com.aloha to javafx.fxml;
    exports com.aloha;
}
