package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class BlackKnightController {

    private static BlackKnight activeBlackKnight;
    @FXML
    private TextField knightName;
    @FXML
    private Text knightNameInfo;

    @FXML
    private Text knightProps;

    @FXML
    void strikeKnight() {
        if (activeBlackKnight.isAlive()) {
            activeBlackKnight.strike();
            knightProps.setText(activeBlackKnight.toString());
        } else {
            Alert knightDeadAlert = new Alert(Alert.AlertType.ERROR);
            knightDeadAlert.setContentText("Please stop" + activeBlackKnight.getName() + "is dead");
            knightDeadAlert.show();

        }
    }
    @FXML
    void createKnight(ActionEvent event) throws IOException{
        //create a knight and insert in array
        if(knightName.getText().equals("")) {
            BlackKnight.createKnight();
        } else {
            BlackKnight.createKnight(knightName.getText());
        }
        //fetch knight and set
        activeBlackKnight = BlackKnight.getLatestKnight();

        ((Node)event.getSource()).getScene().getWindow().hide();//paslēpt esošo logu
        //show window
        showGameWindow();
    }

    private void showGameWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BlackKnightApplication.class.getResource("black-knight-player.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage primaryStage = new Stage();

        primaryStage.setTitle("Black Knight game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startGame(){
        knightNameInfo.setText("Currently playing with knight:" + activeBlackKnight.getName() );
        knightProps.setText(activeBlackKnight.toString());
    }

    public void endGame(ActionEvent event){
        ((Node)event.getSource()).getScene().getWindow().hide();
    }
}
