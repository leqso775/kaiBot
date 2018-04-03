/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model;

import ge.gtu.enums.EmotionEnum;
import java.sql.Date;
import ge.gtu.enums.GenderEnum;
import ge.gtu.enums.RelationEnum;

/**
 *
 * @author Archil
 */
public class User extends Bot{
    
    //Сделать бота вообще нехависимым и сделать так чтобы вы узнали друг друга по мере общения
    //Если нет Юзера родных, научить бота их распознавать и сказать ему об их
    private int id;
    private String firstname;
    private String surname;
    private GenderEnum gender;
    private Date birthday;
    private String nickname;
    private String specialnickname;
    private String lovelyname;
    private String lovelynickname;
    private String password;
    private String email;
    private EmotionEnum emotion;

    public User() {
    }

    public User(int id, String firstname, String surname, GenderEnum gender, Date birthday, String nickname, String specialnickname, String lovelyname, String lovelynickname, String password, String email, EmotionEnum emotion) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.nickname = nickname;
        this.specialnickname = specialnickname;
        this.lovelyname = lovelyname;
        this.lovelynickname = lovelynickname;
        this.password = password;
        this.email = email;
        this.emotion = emotion;
    }

    public User(String firstname, String surname, GenderEnum gender, Date birthday, String nickname, String password, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
