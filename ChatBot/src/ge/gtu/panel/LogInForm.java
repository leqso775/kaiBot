/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Nana_Lomidze
 */
public class LogInForm extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();
        Label forgotpasswordLabel = new Label();
        Button loginButton = new Button();
        
        
        LogInFormPane root = new LogInFormPane();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
