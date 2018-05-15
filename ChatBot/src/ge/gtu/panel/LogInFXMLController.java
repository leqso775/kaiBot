/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alex
 */
public class LogInFXMLController implements Initializable {
     // @FXML-ია აქ საჭირო ყველგან სადაც იქმნება რაიმე იმისთვის რომ დიზაინმა კოდი დაინახოს 
     // აგრეთვე ჩასამატებელია ყველგან შექმნის წინ private 
     // ფუნქციები იწერება initialize-ში
     @FXML
     
     private   TextField IdorMail;
     private   PasswordField password;
     private   Label forgotpasswordLabel ;
     private   Button loginButton;
     private    Button registration;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       for(int i=0; i<IdorMail.getLength(); i++){
           if(IdorMail.getText().contains("@")){
               //LOGIN2 FUNC
           }else{
               //LOGIN1 FUNC
           }
       }
        
        
        
    }    
    
}
