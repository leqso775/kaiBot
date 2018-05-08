/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model;

import ge.gtu.model.enums.EmotionEnum;
import ge.gtu.model.enums.GenderEnum;
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
    private String nickname;
    private String specialnickname;
    private String lovelyname;
    private String lovelynickname;
    private String email;
    private EmotionEnum emotion;

    public Bot() {
    }

    public Bot(String firstname, String surname, GenderEnum gender, int age, Date birthday, String nickname, String specialnickname, String lovelyname, String lovelynickname, String email, EmotionEnum emotion) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
        this.nickname = nickname;
        this.specialnickname = specialnickname;
        this.lovelyname = lovelyname;
        this.lovelynickname = lovelynickname;
        this.email = email;
        this.emotion = emotion;
    }

    public Bot(String firstname, String surname, GenderEnum gender, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecialnickname() {
        return specialnickname;
    }

    public void setSpecialnickname(String specialnickname) {
        this.specialnickname = specialnickname;
    }

    public String getLovelyname() {
        return lovelyname;
    }

    public void setLovelyname(String lovelyname) {
        this.lovelyname = lovelyname;
    }

    public String getLovelynickname() {
        return lovelynickname;
    }

    public void setLovelynickname(String lovelynickname) {
        this.lovelynickname = lovelynickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmotionEnum getEmotion() {
        return emotion;
    }

    public void setEmotion(EmotionEnum emotion) {
        this.emotion = emotion;
    }

    
    
    
    
}
