/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelwithus;

import controller.UserController;
import travelwithus.com.StartPage;

/**
 *
 * @author Sabin Adhika
 */
public class Travelwithus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 UserController userController = new UserController();
    java.awt.EventQueue.invokeLater(() -> new StartPage(userController).setVisible(true));
    }
    
}
