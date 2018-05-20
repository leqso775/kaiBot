/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.oop;

import ge.gtu.Exceptions.IllegalNameException;
import ge.gtu.Exceptions.IllegalPasswordException;
import ge.gtu.Exceptions.IllegalPasswordException1;
import ge.gtu.Exceptions.IllegalSurnameException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public abstract class RegCheck {
    
       public static void validName(String name) throws IllegalNameException{
        if (name.length() < 2){
            throw new IllegalNameException("სახელი უდნა იყოს მინიმუმ 2 სიმბოლო!");
        }else{
             throw new IllegalNameException(" ✔");
        }
    
    }
       
         public static void validSurname(String surname) throws IllegalSurnameException{
        if (surname.length() < 2){
            throw new IllegalSurnameException("გვარი უნდა იყოს მინიმუმ 2 სიმბოლო!");
        }else{
            throw new IllegalSurnameException(" ✔");
        }
    
        }
     public static void validPasswordRepeat(PasswordField password,String RepeatedPassword) throws IllegalPasswordException1{
        
        if(password.getText().equals(RepeatedPassword)==false){
            
            throw new IllegalPasswordException1("შეუსაბამოა პაროლის!");
            
        }else{
             throw new IllegalPasswordException1(" ✔");
        }
        
        
        
    }
         
         
         
         
         
         
         
         
    
    
}
