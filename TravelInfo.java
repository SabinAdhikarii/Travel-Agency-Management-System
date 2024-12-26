/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelwithus.com;
/**
 *
 * @author Sabin Adhikari
 */
import controller.CustomerController;
import controller.UserController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;


public class TravelInfo extends javax.swing.JFrame {
private final String username;
private final CustomerController customerController;

    /**
     * Creates new form DashboardView
     * @param username
     * @param customerController
     */
    public TravelInfo(String username, CustomerController customerController) {
        this.username=username;
        this.customerController = customerController;
        initComponents();
        greetingLabel.setText("Welcome, " + username + "!");
    populateCustomerTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        TravelBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        greetingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        newCusName = new javax.swing.JTextField();
        newCusPhone = new javax.swing.JTextField();
        newCusEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addCusBtn = new javax.swing.JButton();
        updateCusBtn = new javax.swing.JButton();
        deleteCusBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        newCusLocation = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TravelWithUs");

        HomeBtn.setBackground(new java.awt.Color(0, 0, 0));
        HomeBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        TravelBtn.setBackground(new java.awt.Color(0, 115, 0));
        TravelBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TravelBtn.setForeground(new java.awt.Color(255, 255, 255));
        TravelBtn.setText("Travel Info");
        TravelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelBtnActionPerformed(evt);
            }
        });

        aboutBtn.setBackground(new java.awt.Color(0, 0, 0));
        aboutBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutBtn.setText("About Us");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TravelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TravelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        greetingLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        greetingLabel.setText("Manage Customers");

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Email", "Phone No.", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        customersTable.setGridColor(new java.awt.Color(188, 213, 228));
        customersTable.setRowHeight(30);
        customersTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customersTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Phone:");

        addCusBtn.setBackground(new java.awt.Color(0, 102, 51));
        addCusBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addCusBtn.setForeground(new java.awt.Color(255, 255, 255));
        addCusBtn.setText("Add");
        addCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCusBtnActionPerformed(evt);
            }
        });

        updateCusBtn.setBackground(new java.awt.Color(0, 102, 204));
        updateCusBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateCusBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateCusBtn.setText("Update");
        updateCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCusBtnActionPerformed(evt);
            }
        });

        deleteCusBtn.setBackground(new java.awt.Color(153, 51, 0));
        deleteCusBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteCusBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteCusBtn.setText("Delete");
        deleteCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCusBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Location");

        newCusLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCusLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(greetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newCusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newCusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(updateCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(deleteCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newCusLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newCusLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new DashboardView(username, customerController).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void TravelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TravelBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new AboutView(username, customerController).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void addCusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCusBtnActionPerformed
        // TODO add your handling code here:
    String name = newCusName.getText().trim();
    String email = newCusEmail.getText().trim();
    String phone = newCusPhone.getText().trim();
    String location= newCusLocation.getText().trim();
   
       if (name.isEmpty() || email.isEmpty() || phone.isEmpty()||location.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
       return;
    }
    customerController.addCustomer(name, email, phone, location);
    populateCustomerTable();
    JOptionPane.showMessageDialog(this, "Customer added successfully!");
    newCusName.setText("");
    newCusEmail.setText("");
    newCusPhone.setText("");
    newCusLocation.setText("");
 
    }//GEN-LAST:event_addCusBtnActionPerformed

    private void updateCusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCusBtnActionPerformed
        // TODO add your handling code here:
    int selectedRow = customersTable.getSelectedRow();
      if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a customer to update!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
    int customerId = (int) customersTable.getValueAt(selectedRow, 0);
    String name = newCusName.getText().trim();
    String email = newCusEmail.getText().trim();
    String phone = newCusPhone.getText().trim();
    String location = newCusLocation.getText().trim();
   
    if (name.isEmpty() || email.isEmpty() || phone.isEmpty()|| location.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
     boolean success = customerController.updateCustomer(customerId, name, email, phone,location);
    if (success) {
        populateCustomerTable(); 
        JOptionPane.showMessageDialog(this, "Customer updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update customer!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_updateCusBtnActionPerformed

    private void deleteCusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCusBtnActionPerformed
        // TODO add your handling code here:
    int selectedRow = customersTable.getSelectedRow();
if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a customer to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int customerId = (int) customersTable.getValueAt(selectedRow, 0);

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer?", "Confirm", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        boolean success = customerController.deleteCustomer(customerId);
        if (success) {
            populateCustomerTable(); 
            JOptionPane.showMessageDialog(this, "Customer deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete customer!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_deleteCusBtnActionPerformed

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        // TODO add your handling code here:
    int selectedRow = customersTable.getSelectedRow();
    String selectedName = (String)customersTable.getValueAt(selectedRow, 1);
    String selectedEmail = (String)customersTable.getValueAt(selectedRow, 2);
    String selectedPhone = (String)customersTable.getValueAt(selectedRow, 3);
    String selectedLocation= (String)customersTable.getValueAt(selectedRow,4);

    newCusName.setText(selectedName);
    newCusEmail.setText(selectedEmail);
    newCusPhone.setText(selectedPhone);
    newCusLocation.setText(selectedLocation);

    }//GEN-LAST:event_customersTableMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
     UserController userController= new UserController();
        new HomeView(userController).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void newCusLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCusLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCusLocationActionPerformed
//Method to add values to the table:
    private void populateCustomerTable() {
    DefaultTableModel model = (DefaultTableModel) customersTable.getModel();
    model.setRowCount(0); 

    for (Customer customer : customerController.getAllCustomer()) {
        model.addRow(new Object[]{
            customer.getCustomerId(),
            customer.getName(),
            customer.getEmail(),
            customer.getPhone(),
            customer.getLocation(),
        });
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TravelInfo("Admin").setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton TravelBtn;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton addCusBtn;
    private javax.swing.JTable customersTable;
    private javax.swing.JButton deleteCusBtn;
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField newCusEmail;
    private javax.swing.JTextField newCusLocation;
    private javax.swing.JTextField newCusName;
    private javax.swing.JTextField newCusPhone;
    private javax.swing.JButton updateCusBtn;
    // End of variables declaration//GEN-END:variables
}
