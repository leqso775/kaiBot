/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;


import ge.gtu.enums.GenderEnum;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
   private Label errorSurname;
   @FXML
 private  TextField email;
   @FXML
   private Label errorEmail;
   
   
      @FXML
   private PasswordField Pass;
    @FXML
private   Label errorPass;
      @FXML
   private TextField RepPassword;
    @FXML
private   Label errorRepPass;
    
    
     @FXML
private   ComboBox gender ;
 
    @FXML 
    private ComboBox year;
    @FXML
    private ComboBox month;
    @FXML
    private ComboBox day;
     
     
     
     
  
        
       
        
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      gender.setStyle("-fx-font-family:sylfaen; -fx-font-size:15; -fx-alignment:CENTER;");
       gender.getItems().addAll(GenderEnum.MALE,GenderEnum.FEMALE,GenderEnum.OTHER);
        
          DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate loc = LocalDate.now();
        System.out.println(format.format(loc));
        
        for(int i=1900; i<=loc.getYear(); i++){
            year.getItems().addAll(Integer.toString(i));
        }
        for(int i=1;i<=12;i++){
            month.getItems().addAll(Integer.toString(i));
        }
        
        if(Integer.parseInt(month.getValue().toString())==2 && Integer.parseInt(year.getValue().toString())%4!=0){
            for(int i=1; i<=28; i++){
                day.getItems().addAll(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getValue().toString())==2 && Integer.parseInt(year.getValue().toString())%4==0){
            for(int i=1; i<=29; i++){
                day.getItems().addAll(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getValue().toString())==1 ||
            Integer.parseInt(month.getValue().toString())==3 ||
            Integer.parseInt(month.getValue().toString())==5 ||
            Integer.parseInt(month.getValue().toString())==7 ||
            Integer.parseInt(month.getValue().toString())==8 ||
            Integer.parseInt(month.getValue().toString())==10 ||
            Integer.parseInt(month.getValue().toString())==12 ){
            for(int i=1; i<=31; i++){
                day.getItems().addAll(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getValue().toString())==4 ||
            Integer.parseInt(month.getValue().toString())==6 ||
            Integer.parseInt(month.getValue().toString())==9 ||
            Integer.parseInt(month.getValue().toString())==11 ){
            for(int i=1; i<=30; i++){
                day.getItems().addAll(Integer.toString(i));
            }
        }
     
       
    }
    
      
       public void Registration(){
           String Name = firstnameTextField.getText();
           String Surname = surnameTextField.getText();
           String Password = Pass.getText();
           String Email = email.getText();
           GenderEnum Genum = (GenderEnum) gender.getValue();
        ///dasaweria "Date date"  
           
       }
       
    
    
    
    
   
   
        
        
        
    
}
