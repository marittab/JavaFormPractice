package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField input;

    @FXML
    private Text inputText;

    @FXML
    void onButtonClick(ActionEvent event) {
        inputText.setText(input.getText());
    //create alert using java fx
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Value of text has been changed");//izveidot alert ziņojumu
        alert.show(); //parādīt alertziņojumu
    }
}
//create a simple user registration form with fields
//first name, last name, gender, age
//when user submits, check to make sure all fields have been filled
//if not, display an error alert showing what fields are required
//if all fields are provided. display the user into in an alert
/**
 * name: John Bee
 * gender: male
 * age: 39
 */