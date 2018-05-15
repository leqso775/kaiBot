/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;


import ge.gtu.enums.GenderEnum;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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

 @FXML 
 private  TextField firstnameTextField ;
  @FXML
private   Label errorFirstName;
   @FXML
 private  TextField surnameTextField ;
    @FXML
private   Label errorSurName ;
     @FXML
private   MenuButton genderMenuButton ;
 

    
    
  @FXML
 private  Label errorGender; 
   @FXML
   private  MenuButton year ;
    @FXML
  private   Label errorYear;
     @FXML
  private   MenuButton month;
      @FXML
   private  Label errorMonth; 
       @FXML
  private   MenuButton day ;
        @FXML
  private   Label errorDay ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       genderMenuButton.setText(GenderEnum.OTHER.toString());
       
       
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
        
        
        
    
}
