/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.dao;

import ge.gtu.model.enums.GenderEnum;
import ge.gtu.model.Bot;
import ge.gtu.model.Checker;
import ge.gtu.model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Nana_Lomidze
 */
public abstract class UserDAOImpl implements UserDAO{
    
    private static Connection conn;
    
    private static PreparedStatement pstmt;

    public void addUser(User user) {
        
     //   if(user.getFirstname()!=null && user.getSurname()!=null && user.getGender()!=null && user.getBirthday()!=null
     //           && user.getPassword().length()>=8 && user.getPassword().length()<=16 && user.getEmail()!=null ){
            try{
                String sql = "INSERT INTO system_user(id, firstname, surname, gender, birthday, password, email) VALUES (?,?,?,?,?,?,?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, user.getId());
                if(user.getFirstname()!=null){
                    pstmt.setString(2, user.getFirstname());
                }if(user.getSurname()!=null){
                    pstmt.setString(3, user.getSurname());
                }if(user.getGender()!= null){
                    pstmt.setCursorName(GenderEnum.values().toString());
                }if(user.getBirthday()!=null){
                    pstmt.setDate(5, user.getBirthday());
                }if(user.getPassword().length()>8 && user.getPassword().length()<20){
                    pstmt.setString(6, user.getPassword());
                }if(user.getEmail()!=null){
                    pstmt.setString(7, user.getEmail());
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    //}
    
  

    @Override
    public void AddBot(Bot bot) {
        //Bot bot = new Bot();
    }

    public static User GetUser1(String id, String password) {
        try{
            String sql = "SELECT * FROM system_user WHERE id = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            int i = Integer.parseInt(id);
            pstmt.setInt(1, i);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String firstname = rs.getString("firstname");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("birthday");
                String nickname = rs.getString("nickname");
                String email = rs.getString("email");
                User user = new User(i, firstname, surname, GenderEnum.OTHER, birthday, nickname, password, email);
                return user;
            }else {
                return null;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public String doPasswordRec(int id, String email) {
        return null;
    }

    @Override
    public User GetUser2(String email, String password) {
        try{
            String sql = "SELECT * FROM system_user WHERE id = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Integer id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("birthday");
                String nickname = rs.getString("nickname");
                User user = new User(id, firstname, surname, GenderEnum.OTHER, birthday, nickname, password, email);
                return user;
            }else {
                return null;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    
      public User editUser(String id1 ,String password1 ,TextField id, TextField firstname, TextField surname, ComboBox gender, 
           Date birthday, TextField nickname, PasswordField password, TextField email){
        User user = UserDAOImpl.GetUser1(id1, password1);
        
        return null;
          

    }
    
    
}
