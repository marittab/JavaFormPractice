module com.example.javaformpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaformpractice to javafx.fxml;
    exports com.example.javaformpractice;
    exports com.example.javaformpractice.exceptions;
    opens com.example.javaformpractice.exceptions to javafx.fxml;
}