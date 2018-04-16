/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.runner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Nana_Lomidze
 */
public class BotRegistrationForm extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        BotRegistrationFormPane root = new BotRegistrationFormPane();
        TextField firstnameTextField = new TextField();
        TextField surnameTextField = new TextField();
        MenuButton genderMenuButton = new MenuButton();
        MenuButton ageMenuButton = new MenuButton();
        Button button = new Button();
        
        
        
        
        
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
