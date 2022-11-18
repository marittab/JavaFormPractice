package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UserController {
    @FXML
    private TextField age;

    @FXML
    private TextField gender;

    @FXML
    private TextField lastName;

    @FXML
    private TextField name;

    @FXML
    private Text qAge;

    @FXML
    private Text qGender;

    @FXML
    private Text qLastName;

    @FXML
    private Text qName;

    @FXML
    private Text registration;

    @FXML
    void submitButton(ActionEvent event) {
        age.getText();
        gender.getText();
        lastName.getText();
        name.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Alert alert1 = new Alert(Alert.AlertType.ERROR);

        if (age.getText().isEmpty() || gender.getText().isEmpty() || lastName.getText().isEmpty() || name.getText().isEmpty()) {
            alert1.setContentText("Please fill in all fields");
            alert1.show();
        } else {
            alert.setContentText("Name: " + name.getText() + " " + lastName.getText() + "\n" +
                    "Gender: " + gender.getText() + "\n" +
                    "Age: " + age.getText());
            alert.show();

        }
    }


}
