module com.example.javaexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaexercise to javafx.fxml;
    exports com.example.javaexercise;
}