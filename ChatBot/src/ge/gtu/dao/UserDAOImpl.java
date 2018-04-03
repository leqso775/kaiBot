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
import java.sql.PreparedStatement;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User GetUser(int id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String doPasswordRec(int id, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
