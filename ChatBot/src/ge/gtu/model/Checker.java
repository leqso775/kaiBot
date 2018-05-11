/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model;

import ge.gtu.model.exceptions.IllegalBirthdayException;
import ge.gtu.model.exceptions.IllegalEmailException;
import ge.gtu.model.exceptions.IllegalFirstnameException;
import ge.gtu.model.exceptions.IllegalNicknameException;
import ge.gtu.model.exceptions.IllegalPasswordException;
import ge.gtu.model.exceptions.IllegalPasswordRepeatException;
import ge.gtu.model.exceptions.IllegalSurnameException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.TextField;

/**
 *BULSHIT! WE DO NOT NEED THIS! DID THIS EVERYTHING IN USERREGISTRATIONFORM!
 * LEFT JUST TO LET YOU KNOW THAT IN OUR CODE YOUR STYLE DOES NOT WORK!
 * WE HAVE DAO HERE, NOT DIFFERED JAVA CLASSES...
 * @author Nana_Lomidze
 */
public abstract class Checker {
    
    public static void validFirstname(String firstname) throws IllegalFirstnameException{
        if (firstname.length() ==0){
            throw new IllegalFirstnameException("ველი შესაავსებად აუცილებელია");
        }else{
             throw new IllegalFirstnameException(" ✔");
        }
    }
    
    public static void vaidSurname(String surname) throws IllegalSurnameException{
        if(surname.length() ==0){
            throw new IllegalSurnameException("ველი შესავლსებად აუცილებელია");
        }else{
            throw new IllegalSurnameException(" ✔");
        }
    }
    
    public static void validBirthday(int date) throws IllegalBirthdayException{
        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Date date = new Date
        LocalDate loc = LocalDate.now();
        System.out.println(format.format(loc));
        
        if(){
            throw new IllegalBirthdayException("Fill Field");
        }else if(loc.getYear() <1950 || loc.getYear()>){

        }else{
            throw new IllegalBirthdayException(" ✔");
        }
        
        if(loc.lengthOfMonth() ==0){
            throw new IllegalBirthdayException("Fill Field");
        }else{
            throw new IllegalBirthdayException(" ✔");
        }
        
        if(day.getText().length()==0){
            throw new IllegalBirthdayException("Fill Field");
        }else{
            throw new IllegalBirthdayException(" ✔");
        }
        
        for(int i=1900; i<=loc.getYear(); i++){
            loc.getYear().setText(Integer.toString(i));
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
        }*/
    }
    
    public static void validNickname(String nickname) throws IllegalNicknameException{
        if (nickname.length() ==0){
            throw new IllegalNicknameException("Fill Field");
        }
        for (int i=0; i<nickname.length(); i++){
            if (nickname.charAt(i) == ' '){
                throw new IllegalNicknameException("Use no space");
            }
        }
        
       
        throw new IllegalNicknameException(" ✔");
    }
    
    public static void validPassword(String password) throws IllegalPasswordException{
        if (password.length() < 8 || password.length() > 15){
            throw new IllegalPasswordException("Unnecessary Password");
        }
        int x = 0;
        for (int i=0; i<password.length(); i++){
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                x++;
                break;
            }
        }
        for (int i=0; i<password.length(); i++){
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                x++;
                break;
            }
        }
        for (int i=0; i<password.length(); i++){
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                x++;
                break;
            }
        }
        if (x!=3){
            throw new IllegalPasswordException("Unnecessary Password");
        }
        
         throw new IllegalPasswordException(" ✔");
        
    }
    
    public static void validPasswordRepeat(TextField password,String RepeatedPassword) throws IllegalPasswordRepeatException{
        
        if(password.getText().equals(RepeatedPassword)==false){
            
            throw new IllegalPasswordRepeatException("შეუსაბამოა პაროლის!");
            
        }else{
             throw new IllegalPasswordRepeatException(" ✔");
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
