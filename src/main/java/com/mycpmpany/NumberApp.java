package com.mycpmpany;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Random;





public class NumberApp extends Application{
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
        
    }
    private void reset(){
        
    }
    public static void main(String[] args){
        launch();
    }
    
}
