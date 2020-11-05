package ru.mirea.pr13_14;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private int[][] field = new int[3][3];
    private int numberPlayer = 1;

    private String setSign(int player){
        if(player==1) return "X";
        else if(player==2) return "O";
        else return "  ";
    }
    private String setProgress(int player){
        if(player==1) return "Ход первого игрока.";
        else if(player==2) return "Ход второго игрока.";
        else return "Начните игру заново.";

    }
    private boolean checkOnWin(int player){
        boolean flag = false;
        for(int i=0; i<3; i++){
            if((field[i][0]==field[i][1])&&(field[i][1]==field[i][2])&&(field[i][2]==player)){flag=true;};
            if((field[0][i]==field[1][i])&&(field[1][i]==field[2][i])&&(field[2][i]==player)){flag=true;};
        }
        if((field[0][0]==field[1][1])&&(field[1][1]==field[2][2])&&(field[2][2]==player)){flag=true;};
        if((field[0][2]==field[1][1])&&(field[1][1]==field[2][0])&&(field[2][0]==player)){flag=true;};
        return flag;
    }
    private String setWin(int player){
        if(player == 1) return "Победа первого игрока.";
        else if(player == 2) return "Победа второго игрока.";
        else return "  ";
    }







    public static void main(String args){Application.launch(args);};

    @Override
    public void start(Stage stage) throws Exception {

        Text label = new Text(setProgress(numberPlayer));

        Button button1_1 = new Button("  ");
        Button button1_2 = new Button("  ");
        Button button1_3 = new Button("  ");
        Button button2_1 = new Button("  ");
        Button button2_2 = new Button("  ");
        Button button2_3 = new Button("  ");
        Button button3_1 = new Button("  ");
        Button button3_2 = new Button("  ");
        Button button3_3 = new Button("  ");
        Button button_reset = new Button("Reset");


        button1_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button1_1.getText()!="X"&&button1_1.getText()!="O") {
                    button1_1.setText(setSign(numberPlayer));
                    field[0][0] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button1_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button1_2.getText()!="X"&&button1_2.getText()!="O") {
                    button1_2.setText(setSign(numberPlayer));
                    field[0][1] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button1_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button1_3.getText()!="X"&&button1_3.getText()!="O") {
                    button1_3.setText(setSign(numberPlayer));
                    field[0][2] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button2_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button2_1.getText()!="X"&&button2_1.getText()!="O") {
                    button2_1.setText(setSign(numberPlayer));
                    field[1][0] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button2_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button2_2.getText()!="X"&&button2_2.getText()!="O") {
                    button2_2.setText(setSign(numberPlayer));
                    field[1][1] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button2_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button2_3.getText()!="X"&&button2_3.getText()!="O") {
                    button2_3.setText(setSign(numberPlayer));
                    field[1][2] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button3_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button3_1.getText()!="X"&&button3_1.getText()!="O") {
                    button3_1.setText(setSign(numberPlayer));
                    field[2][0] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button3_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button3_2.getText()!="X"&&button3_2.getText()!="O") {
                    button3_2.setText(setSign(numberPlayer));
                    field[2][1] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });
        button3_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button3_3.getText()!="X"&&button3_3.getText()!="O") {
                    button3_3.setText(setSign(numberPlayer));
                    field[2][2] = numberPlayer;
                    if (!checkOnWin(numberPlayer)) {
                        if (numberPlayer == 1) numberPlayer = 2;
                        else numberPlayer = 1;
                        label.setText(setProgress(numberPlayer));
                    } else label.setText(setWin(numberPlayer));
                }
            }
        });

        button_reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                button1_1.setText("  ");
                button1_2.setText("  ");
                button1_3.setText("  ");
                button2_1.setText("  ");
                button2_2.setText("  ");
                button2_3.setText("  ");
                button3_1.setText("  ");
                button3_2.setText("  ");
                button3_3.setText("  ");

                numberPlayer = 1;
                field = new int[3][3];
                label.setText(setProgress(numberPlayer));
            }
        });


        GridPane gridPane = new GridPane();
        gridPane.setMinSize(200, 200);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(label, 0, 0, 4, 1);

        gridPane.add(button1_1, 0 ,1);
        gridPane.add(button1_2, 1,1);
        gridPane.add(button1_3, 2,1);
        gridPane.add(button2_1, 0,2);
        gridPane.add(button2_2, 1,2);
        gridPane.add(button2_3, 2,2);
        gridPane.add(button3_1, 0,3);
        gridPane.add(button3_2, 1,3);
        gridPane.add(button3_3, 2,3);

        gridPane.add(button_reset, 3, 3, 2, 2);


        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("Крестики-Нолики");
        stage.show();
    }

}
