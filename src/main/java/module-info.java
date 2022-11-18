module com.example.javaformpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaformpractice to javafx.fxml;
    exports com.example.javaformpractice;
}