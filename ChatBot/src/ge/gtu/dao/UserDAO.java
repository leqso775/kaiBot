/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.dao;

import ge.gtu.model.Bot;
import ge.gtu.model.User;

/**
 *
 * @author Nana_Lomidze
 */
public interface UserDAO {
    
    void addUser (User user);
    
    void AddBot (Bot bot);
    
    User GetUser1 (int id, String password);
    
    User GetUser2 (String email, String password);
    
    String doPasswordRec(int id, String email);
    
    
}
