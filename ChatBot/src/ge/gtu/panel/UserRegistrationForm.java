/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.panel;

import com.sun.javafx.scene.control.skin.ComboBoxPopupControl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Nana_Lomidze
 */
public class UserRegistrationForm extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        TextField firstnameTextField = new TextField();
        Label errorFirstName = new Label();
        if(firstnameTextField.getText().length()==0){
            errorFirstName.setText("Fill Field");
        }
        
        TextField surnameTextField = new TextField();
        Label errorSurName = new Label();
        if(surnameTextField.getText().length()==0){
            errorSurName.setText("Fill Field");
        }
        
        MenuButton genderMenuButton = new MenuButton();
        Label errorGender = new Label();
        if(genderMenuButton.getText().length()==0){
            errorFirstName.setText("Fill Field");
        }
        
        MenuButton year = new MenuButton();
        Label errorYear = new Label();
        if(year.getText().length()==0){
            errorYear.setText("Fill Field");
        }
        
        MenuButton month = new MenuButton();
        Label errorMonth = new Label();
        if(month.getText().length()==0){
            errorMonth.setText("Fill Field");
        }
        
        MenuButton day = new MenuButton();
        Label errorDay = new Label();
        if(day.getText().length()==0){
            errorDay.setText("Fill Field");
        }
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate loc = LocalDate.now();
        System.out.println(format.format(loc));
        
        for(int i=1900; i<=loc.getYear(); i++){
            year.setText(Integer.toString(i));
        }
        for(int i=1;i<=12;i++){
            month.setText(Integer.toString(i));
        }
        
        if(Integer.parseInt(month.getText())==2 && Integer.parseInt(year.getText())%4!=0){
            for(int i=1; i<=28; i++){
                day.setText(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getText())==2 && Integer.parseInt(year.getText())%4==0){
            for(int i=1; i<=29; i++){
                day.setText(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getText())==1 ||
            Integer.parseInt(month.getText())==3 ||
            Integer.parseInt(month.getText())==5 ||
            Integer.parseInt(month.getText())==7 ||
            Integer.parseInt(month.getText())==8 ||
            Integer.parseInt(month.getText())==10 ||
            Integer.parseInt(month.getText())==12 ){
            for(int i=1; i<=31; i++){
                day.setText(Integer.toString(i));
            }
        }else if(Integer.parseInt(month.getText())==4 ||
            Integer.parseInt(month.getText())==6 ||
            Integer.parseInt(month.getText())==9 ||
            Integer.parseInt(month.getText())==11 ){
            for(int i=1; i<=30; i++){
                day.setText(Integer.toString(i));
            }
        }
        
        TextField nicknameTextField = new TextField();
        Label errorNickname = new Label();
        if(nicknameTextField.getText().length()==0){
            errorNickname.setText("Fill Field");
        }
        
        TextField passwordTextField = new TextField();
        Label errorPassword = new Label();
        if(passwordTextField.getText().length()==0){
            errorPassword.setText("Fill Field");
        }
        
        TextField emailTextField = new TextField();
        Label errorEmail = new Label();
        if(emailTextField.getText().length()==0){
            errorEmail.setText("Fill Field");
        }
        
        UserRegistrationFormPane root = new UserRegistrationFormPane();
        
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
