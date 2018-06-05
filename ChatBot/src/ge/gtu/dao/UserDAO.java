/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.dao;

import ge.gtu.model.Bot;
import ge.gtu.model.User;
import java.sql.Date;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Nana_Lomidze
 */
public interface UserDAO {
    
   public static void addUser (User user){};
    
   public static void editUser (String id1 ,String password1 ,TextField id, TextField firstname, TextField surname, ComboBox gender, 
           Date birthday, TextField nickname, PasswordField password, TextField email){};
    
   public void AddBot (Bot bot);
    
   public User GetUser1 (int id, String password);
    
   public User GetUser2 (String email, String password);
    
   public String doPasswordRec(int id, String email);
    
}
