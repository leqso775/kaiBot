/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.oop;

import ge.gtu.exception.IllegalEmailException;
import ge.gtu.exception.IllegalNameException;
import ge.gtu.exception.IllegalPasswordException;
import ge.gtu.exception.IllegalPasswordException1;
import ge.gtu.exception.IllegalSurnameException;
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
             public static void validEmail(String email) throws IllegalEmailException{
         String arr1[] = email.split("@");
        if (arr1.length != 2){
            throw new IllegalEmailException("შეუსაბამო მეილი!");
        }
        String s = arr1[1];
        String arr2[] = s.split("\\.");
        if (arr2.length < 2){
            throw new IllegalEmailException("შეუსაბამო მეილი!");
        }
        for (int i=0; i<arr2.length; i++){
            if (arr2[i].equals("")){
                throw new IllegalEmailException("შეუსაბამო მეილი!");
            }
        }
        
        
        throw new IllegalEmailException(" ✔");
    }
         
         
         
         
         
         
         
    
    
}
