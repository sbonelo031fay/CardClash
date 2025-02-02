/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cardclash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mlondi
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
        initComponents();
        setFixedSize();
    }
      private void setFixedSize() { // this method fixes the size of the frame upon running the file(intro for glossary)
        setSize(900, 600);  // setSize
        setResizable(false);  // Prevent resizing by the user
        setLocationRelativeTo(null); // sets the 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        loginLb = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        usernameLb = new javax.swing.JLabel();
        passwordLb = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        copyrightLb = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 0, 153));

        loginLb.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        loginLb.setText("LOGIN");

        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        usernameLb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        usernameLb.setText("Username");

        passwordLb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        passwordLb.setText("Password");

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("<html><u>I don't have an account?</u></html>");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(username))
                            .addComponent(passwordLb)
                            .addComponent(usernameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(loginLb)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(loginLb)
                .addGap(73, 73, 73)
                .addComponent(usernameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(passwordLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        copyrightLb.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLb.setText("Copyright © Card Clash All are reserved ");

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mlondi\\Downloads\\Blank 1 Panel Landscape Comic Strip (1)_resized (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(120, Short.MAX_VALUE)
                        .addComponent(copyrightLb)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyrightLb)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
         try{
            String user = username.getText();
            String pass = password.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardgame?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Davis2247,8");
            String sql = "select * from userdata where username = ? and password = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = null;
            rs = (ResultSet) ps.executeQuery();
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Success");
                String enteredUsername = username.getText();
                String enteredPassword = password.getText();
                startGame jb = new startGame();
                int balance = (int) getUserBalance(enteredUsername);
                System.out.println("balance " + balance);
                jb.loggedinusername.setText(enteredUsername);
                jb.useramount.setText(String.valueOf(balance));

               setVisible(false);
               new preStart().setVisible(true); 
                

                
            }else{
                JOptionPane.showMessageDialog(null, "UnSuccessful");
                setVisible(true);
                  
            }     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_loginBtnActionPerformed

    
private double getUserBalance(String username) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/cardgame?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String dbUser = "root";
    String dbPassword = "Davis2247,8";

    try {
        Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

        String query = "SELECT balance FROM userdata WHERE username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        int balance = 0;

        if (resultSet.next()) {
            balance = resultSet.getInt("balance");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
   

        return balance;
    
    } catch (SQLException e) {
        e.printStackTrace();
        return 0; // Return 0 in case of an error
    }
}


    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        // TODO add your handling code here:
        lblRegister.setForeground(new java.awt.Color(0,0,0)); // Changes to the desired text color
        
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        // TODO add your handling code here:
        lblRegister.setForeground(new java.awt.Color(255,255,255)); // Changes to the desired text color
                                             
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        // TODO add your handling code here:
         setVisible(false);
        new registerFrame().setVisible(true);
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        // TODO add your handling code here:
        loginBtn.setBackground(new java.awt.Color(255,255,255));
        loginBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        // TODO add your handling code here:
        loginBtn.setBackground(new java.awt.Color(0,0,0));
        loginBtn.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_loginBtnMouseExited

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copyrightLb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLb;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLb;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLb;
    // End of variables declaration//GEN-END:variables
}
