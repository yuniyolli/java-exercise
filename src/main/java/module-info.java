module com.example.javaexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java.exercise to javafx.fxml;
    exports com.example.java.exercise;
}