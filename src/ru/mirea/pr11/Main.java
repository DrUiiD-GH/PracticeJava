package ru.mirea.pr11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class Main extends Application {
    public static void main(String args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text("Hello world!");
        text.setLayoutX(250);
        text.setLayoutY(125);

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("It's my first programme on JavaFX!");
        stage.setWidth(600);
        stage.setHeight(300);
        stage.show();
    }
}
