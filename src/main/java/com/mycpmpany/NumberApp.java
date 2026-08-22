package com.mycpmpany;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Random;





public class NumberApp extends Application 
        implements EventHandler<ActionEvent> {
    private TextField txGuess, txHint;
    private Button bnReset;
    private int secretNumber;
    private Random rNumber;
    
    
    public void start(Stage topWin){
        rNumber = new Random();
        createUI(topWin);
        reset();
        
    }
    private void createUI(Stage topWin){
        // GUI components
        txGuess = new TextField();
        txHint = new TextField();
        bnReset = new Button("Reset");
        // Layout manager 
        GridPane lMgr = new GridPane();
        lMgr.addRow(0, new Label());
        lMgr.addRow(0, txGuess);
        lMgr.addRow(1, new Label("Hint"));
        lMgr.addRow(1, txHint);
        lMgr.add(bnReset, 1, 2);
        // Put the layout manager inside Scene
        Scene onePage = new Scene(lMgr);
        //Scene must go into a Sage
        topWin.setScene(onePage);
        topWin.show();
        // Add event handler to TextField and Button
        txGuess.setOnAction(this);
        bnReset.setOnAction(this);
    }
    private void reset(){
        secretNumber = rNumber.nextInt(100);
        txGuess.setText("");
        txHint.setText("");
    }
    public void handle(ActionEvent e){
        if(e.getSource() == txGuess){
            checkAnswer();
        } 
        else {
            reset();
        }
    }
    private void checkAnswer(){
        String inputStr = txGuess.getText();
        int userGuess = Integer.parseInt(inputStr);
        if (userGuess == secretNumber){
            txHint.setText("Correct");
        }
        else if(userGuess > secretNumber){
            txHint.setText("Too High");
        }
        else{
            txHint.setText("Too Low");
        }
    }    
    public static void main(String[] args){
        launch();
    }
    
}
