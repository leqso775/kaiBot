/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model;

import ge.gtu.model.enums.EmotionEnum;
import ge.gtu.model.enums.GenderEnum;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Archil
 */
public class Bot {
    
    private String firstname;
    private String surname;
    private GenderEnum gender;
    private int age;
    private Date birthday;
    private String email = "thisiskaibot@gmail.com";
    private ArrayList<EmotionEnum> emotion;

    public Bot() {
    }

    public Bot(String firstname, String surname, GenderEnum gender, int age, Date birthday, String email, ArrayList<EmotionEnum> emotion) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.emotion = emotion;
    }

    

    public Bot(String firstname, String surname, GenderEnum gender, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmotion(ArrayList<EmotionEnum> emotion) {
        this.emotion = emotion;
    }
    
}
