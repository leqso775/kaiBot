/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;


import ge.gtu.enums.GenderEnum;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author alex
 */
public class UserRegFXMLController implements Initializable {

 
   TextField firstnameTextField = new TextField();
   Label errorFirstName = new Label();
   TextField surnameTextField = new TextField();
   Label errorSurName = new Label();
   MenuButton genderMenuButton = new MenuButton();

    public MenuButton getGenderMenuButton() {
        return genderMenuButton;
    }
 
   Label errorGender = new Label(); 
   MenuButton year = new MenuButton();
   Label errorYear = new Label();
   MenuButton month = new MenuButton();
   Label errorMonth = new Label();
   MenuButton day = new MenuButton();
   Label errorDay = new Label();
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
