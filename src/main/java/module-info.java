module com.example.testmnp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testmnp to javafx.fxml;
    exports com.example.testmnp;
}