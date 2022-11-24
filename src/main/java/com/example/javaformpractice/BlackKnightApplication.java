package com.example.javaformpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BlackKnightApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BlackKnightApplication.class.getResource("black-knight.fxml"));
        //Stage object create scene to set fxml into
        Scene scene = new Scene(fxmlLoader.load());
        //set title of stage


        primaryStage.setTitle("Black Knight");
        //set created scene into stage
        primaryStage.setScene(scene);
        //show stage
        primaryStage.show();
    }



    }

