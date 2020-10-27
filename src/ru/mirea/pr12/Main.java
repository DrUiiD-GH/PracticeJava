package ru.mirea.pr12;

import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    private int accumulator1, accumulator2, numberOfOperation;

    private boolean checkInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){return false;}
    }

    private String signOfOperation(int num){
     switch (num){
         case 1: return " + ";
         case 2: return " - ";
         case 3: return " * ";
         case 4: return " / ";
         default: return "";
     }
    }

    private int operationByNumber(int num, int first, int second){
        switch (num){
            case 1: return first+second;
            case 2: return first-second;
            case 3: return first*second;
            case 4: if(second!=0) return first/second;
                    else return 0;
            default: return 0;
        }
    }



    @Override
    public void start(Stage stage) {



        Text expression = new Text();
        //Creating Text Filed for email
        TextField textField1 = new TextField();


        //Creating Buttons
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiplication = new Button("*");
        Button buttonDivision = new Button("/");
        Button buttonResult = new Button("=");
        Button buttonClear = new Button("clear");


        buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(checkInt(textField1.getText())){
                    accumulator1 = Integer.parseInt(textField1.getText());
                    numberOfOperation = 1;
                    expression.setText(accumulator1+signOfOperation(numberOfOperation));
                }else {
                    expression.setText("Ошибка ввода!");
                }
                textField1.clear();
            }
        });

        buttonMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(checkInt(textField1.getText())){
                    accumulator1 = Integer.parseInt(textField1.getText());
                    numberOfOperation = 2;
                    expression.setText(accumulator1+signOfOperation(numberOfOperation));
                }else {
                    expression.setText("Ошибка ввода!");
                }
                textField1.clear();
            }
        });

        buttonMultiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(checkInt(textField1.getText())){
                    accumulator1 = Integer.parseInt(textField1.getText());
                    numberOfOperation = 3;
                    expression.setText(accumulator1+signOfOperation(numberOfOperation));
                }else {
                    expression.setText("Ошибка ввода!");
                }
                textField1.clear();
            }
        });

        buttonDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(checkInt(textField1.getText())){
                    accumulator1 = Integer.parseInt(textField1.getText());
                    numberOfOperation = 4;
                    expression.setText(accumulator1+signOfOperation(numberOfOperation));
                }else {
                    expression.setText("Ошибка ввода!");
                }
                textField1.clear();
            }
        });

        buttonResult.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(checkInt(textField1.getText())){
                    accumulator2 = Integer.parseInt(textField1.getText());
                    int result=operationByNumber(numberOfOperation, accumulator1, accumulator2);
                    expression.setText(accumulator1+signOfOperation(numberOfOperation)+accumulator2+" = "+result);
                    textField1.setText(result+"");
                }else {
                    expression.setText("Ошибка ввода!");
                }
            }
        });

        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                accumulator1=accumulator2=numberOfOperation=0;
                textField1.clear();
                expression.setText(" ");
            }
        });


        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(expression, 0, 0, 5 ,1);
        gridPane.add(textField1, 0, 1, 5, 1);
        gridPane.add(buttonPlus, 0, 2);
        gridPane.add(buttonMinus, 1, 2);
        gridPane.add(buttonMultiplication, 2, 2);
        gridPane.add(buttonDivision, 3, 2 );
        gridPane.add(buttonResult, 4, 2);
        gridPane.add(buttonClear, 5, 1);


        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Кулькулятор");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        Application.launch(args);
    }
}
