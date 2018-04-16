/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.dao;

import ge.gtu.enums.GenderEnum;
import ge.gtu.model.Bot;
import ge.gtu.model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nana_Lomidze
 */
public class UserDAOImpl implements UserDAO{
    
    private Connection conn;
    
    private PreparedStatement pstmt;

    @Override
    public void addUser(User user) {
        try{
            String sql = "INSERT INTO system_user(id, firstname, surname, gender, birthday, password, email) VALUES (?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getFirstname());
            pstmt.setString(3, user.getSurname());
            pstmt.setCursorName(GenderEnum.values().toString());
            pstmt.setDate(5, user.getBirthday());
            pstmt.setString(6, user.getPassword());
            pstmt.setString(7, user.getEmail());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void AddBot(Bot bot) {
        //Bot bot = new Bot();
    }

    @Override
    public User GetUser(int id, String password) {
        try{
            String sql = "SELECT * FROM system_user WERE id = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String firstname = rs.getString("firstname");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("date");
                String nickname = rs.getString("nickname");
                String email = rs.getString("email");
                User user = new User(firstname, surname, GenderEnum.OTHER, birthday, nickname, password, email);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
