/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.LinkedList;
import model.User;

/**
 *
 * @author Sabin Adhikari
 */
public class UserController {
    private final LinkedList<User>users=new LinkedList<>();
    
    public boolean signup(String username, String password){
        
        for (User u : users){ //iterating through each user in the linkedlist
            if(u.getUsername().equals(username)){ // if the passed username is present in the linkedlist
                return false; //the username already exists
            }
        }
        users.add(new User(username, password));
        return true;
    }
    
    
    public boolean login(String username, String password){
        for (User u : users){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
     public LinkedList<User> getAllUsers() {
        return users;
    }
}
