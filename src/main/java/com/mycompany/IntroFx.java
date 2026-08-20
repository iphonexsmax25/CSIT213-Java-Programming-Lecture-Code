package com.mycompany;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.event.*;

public class IntroFx extends Application 
                    implements EventHandler<ActionEvent>{
    private TextField txMesg;
    private Button bnGo;
    private TextArea txResult;
    
    public void start(Stage topWindow){
        //Build the GUI
        txMesg = new TextField();
        bnGo = new Button("Go");
        txResult = new TextArea();
        // GridPane - Layout manager
        GridPane lMgr = new GridPane();
        // Add GUI components to the GridPane
        lMgr.add(txMesg, 0,0); // first column, first row
        lMgr.add(bnGo, 0, 1); // first column, second row
        lMgr.add(txResult, 0, 2); // first column third row'
        // Need a scene(page) to contain the GridPane
        Scene thisPage = new Scene(lMgr);
        // Place the scene inside the top level window
        topWindow.setScene(thisPage);
        
        // Add event handler to txMesg and bnGo
        txMesg.setOnAction(this);
        bnGo.setOnAction(this);
        
        // Make it visible
        topWindow.show();
    }
    
    public void handle (ActionEvent e){
        if(e.getSource() == txMesg){
            String inputMesg =txMesg.getText();
            String currMesg =txResult.getText();
            String newMesg= currMesg + "\n" +inputMesg;
            txResult.setText(newMesg);
        }
        else{
            String newMesg = "Button " +txMesg.getText();
            txResult.setText(newMesg);
        }
    }
    public static void mmain(String[] args){
        launch(); // Start the application
    }
    
    
    
}
