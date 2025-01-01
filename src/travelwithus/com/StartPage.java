/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package travelwithus.com;
import controller.UserController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Sabin Adhikari
 */
public class StartPage extends javax.swing.JFrame {

    private Timer timer; // Timer to handle progress updates
    private int progress = 0; // Progress variable

    public StartPage(UserController userController) {
        initComponents();
        startLoading(); // Start the loading process when the frame is created
    }

    private void setValue(int progress) {
        jprogress1.setValue(progress); // Update the progress bar value
    }

    private void startLoading() {
        timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 1;
                setValue(progress);
                load.setText(progress + "%");
                System.out.println("Progress: " + progress); // Debug: Check progress increments

                if (progress >= 100) {
                    timer.stop();
                    dispose(); // Close the StartPage window
                    UserController userController = new UserController();
                    HomeView homeView = new HomeView(userController);
                    homeView.setVisible(true);
                   
                }
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jprogress1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 171, 235));
        setForeground(new java.awt.Color(80, 171, 235));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Travel with Us");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 360, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("We Make Your Plan, a Trip");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 250, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/welcome-3347467_640.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 580, 130));

        jprogress1.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jprogress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 400, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Please Wait, its Loading . . . .");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 260, -1));

        load.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        load.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 60, 20));
        load.getAccessibleContext().setAccessibleName("load");
        load.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TREKKING_AND_HIKING.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserController userController = null;
                new StartPage(userController).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jprogress1;
    private javax.swing.JLabel load;
    // End of variables declaration//GEN-END:variables
}
