/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rmj.ghostrider.ui;

import java.awt.Insets;
import java.util.Optional;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *
 * @author user
 */
public class GRiderDialog {
    private Alert dialog;
    
    public void initDialog(Alert.AlertType type, String title, String headerText, String content){
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

       ButtonType goodButton = new ButtonType("Okay");
       dialog = new Alert(Alert.AlertType.ERROR);
       dialog.setTitle(title);
       dialog.setHeaderText(null);
       dialog.setContentText(content);
  
    }
    public void show(){
        if(!dialog.isShowing()){
            dialog.initStyle(StageStyle.UTILITY);
            dialog.showAndWait();
        }
    }
                        
}
