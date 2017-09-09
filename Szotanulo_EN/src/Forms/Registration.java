/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import MySQL.Validator;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.swing.JPasswordField;

/**
 *
 * @author diak
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public Registration() {
        initComponents();
        setUI();
        MySQL.serverStatus status=new MySQL.serverStatus();
        status.start();
        UPDATE update = new UPDATE();
        update.start();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTextField = new javax.swing.JTextField();
        emailTextField1 = new javax.swing.JTextField();
        emailTextField2 = new javax.swing.JTextField();
        passwordTextField1 = new javax.swing.JPasswordField();
        passwordTextField2 = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        formNameLabel = new javax.swing.JLabel();
        alertLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorMessageBox = new javax.swing.JTextArea();
        serverOfflineAlertLabel = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        usernameTextField.setNextFocusableComponent(passwordTextField1);
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        emailTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextField1KeyPressed(evt);
            }
        });

        emailTextField2.setNextFocusableComponent(sendButton);
        emailTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextField2KeyPressed(evt);
            }
        });

        passwordTextField1.setNextFocusableComponent(passwordTextField2);
        passwordTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextField1MouseClicked(evt);
            }
        });
        passwordTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextField1KeyPressed(evt);
            }
        });

        passwordTextField2.setNextFocusableComponent(emailTextField1);
        passwordTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextField2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTextField2MouseEntered(evt);
            }
        });
        passwordTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextField2ActionPerformed(evt);
            }
        });
        passwordTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextField2KeyPressed(evt);
            }
        });

        usernameLabel.setText("Username:");

        passwordLabel1.setText("Password:");

        passwordLabel2.setText("Password again:");

        emailLabel1.setText("E-mail:");

        emailLabel2.setText("E-mail again:");

        formNameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        formNameLabel.setText("Registration");

        alertLabel.setForeground(new java.awt.Color(255, 0, 51));
        alertLabel.setText("All field must be fill in! ");

        errorMessageBox.setEditable(false);
        errorMessageBox.setBackground(new java.awt.Color(240, 240, 240));
        errorMessageBox.setColumns(20);
        errorMessageBox.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        errorMessageBox.setForeground(new java.awt.Color(255, 51, 102));
        errorMessageBox.setRows(6);
        errorMessageBox.setAutoscrolls(false);
        errorMessageBox.setBorder(null);
        errorMessageBox.setCaretColor(new java.awt.Color(240, 240, 240));
        errorMessageBox.setDisabledTextColor(new java.awt.Color(255, 51, 102));
        errorMessageBox.setEnabled(false);
        errorMessageBox.setFocusable(false);
        errorMessageBox.setOpaque(false);
        jScrollPane1.setViewportView(errorMessageBox);

        serverOfflineAlertLabel.setForeground(new java.awt.Color(204, 0, 51));
        serverOfflineAlertLabel.setText("Server not response please use the offline mode until the problem will be fixed!");

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        sendButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sendButtonKeyPressed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel1)
                                    .addComponent(passwordLabel2)
                                    .addComponent(emailLabel1)
                                    .addComponent(emailLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTextField2)
                                    .addComponent(passwordTextField2)
                                    .addComponent(passwordTextField1)
                                    .addComponent(usernameTextField)
                                    .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(alertLabel)
                            .addComponent(formNameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)))))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(serverOfflineAlertLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formNameLabel)
                .addGap(10, 10, 10)
                .addComponent(serverOfflineAlertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel1)
                    .addComponent(passwordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel1)
                    .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel2)
                    .addComponent(emailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextField1MouseClicked

    }//GEN-LAST:event_passwordTextField1MouseClicked

    private void passwordTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextField2MouseEntered

    }//GEN-LAST:event_passwordTextField2MouseEntered

    private void passwordTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextField2ActionPerformed
 
    }//GEN-LAST:event_passwordTextField2ActionPerformed

    private void passwordTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextField2MouseClicked
  
    }//GEN-LAST:event_passwordTextField2MouseClicked

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
    Registration();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void passwordTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextField1KeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_passwordTextField1KeyPressed

    private void passwordTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextField2KeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
 
    }//GEN-LAST:event_passwordTextField2KeyPressed

    private void emailTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextField1KeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_emailTextField1KeyPressed

    private void emailTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextField2KeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_emailTextField2KeyPressed

    private void sendButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sendButtonKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) Registration();
    }//GEN-LAST:event_sendButtonKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    backToLogin();
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backButtonKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) backToLogin();
    }//GEN-LAST:event_backButtonKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JTextField emailTextField2;
    private javax.swing.JTextArea errorMessageBox;
    private javax.swing.JLabel formNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JPasswordField passwordTextField1;
    private javax.swing.JPasswordField passwordTextField2;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel serverOfflineAlertLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
    private void setUI() {
        setWindowToCenter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/images/icon.png")));
       
    }

    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    private void backToLogin() {
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false); 
        
    }

    private void Registration() {
        try{
       MySQL.Registration.insertUser(usernameTextField.getText(), getPassword(passwordTextField1), emailTextField1.getText());
       backToLogin();
        }catch(Exception ex){
            alertLabel.setText("The email address or username you have entered is already registered!");
        }
    }
        private void focusNext() {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.focusNextComponent(); 
    }
public class UPDATE extends Tools.ThreadControll{

        private void update() {

        while(true){
            serverOfflineAlertLabel.setVisible(!MySQL.serverStatus.isServerUp);
            usernameTextField.setEnabled(MySQL.serverStatus.isServerUp);
            passwordTextField1.setEnabled(MySQL.serverStatus.isServerUp);
            passwordTextField2.setEnabled(MySQL.serverStatus.isServerUp);
            emailTextField1.setEnabled(MySQL.serverStatus.isServerUp);
            emailTextField2.setEnabled(MySQL.serverStatus.isServerUp);
            sendButton.setEnabled(MySQL.serverStatus.isServerUp);
            validateRegistrationFields();
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run(){
        System.out.println("lofasz");
      
        update();
    }

        private void validateRegistrationFields() {
            sendButton.setEnabled(isValidFields());
        }

        private boolean isValidFields() {
            return 
            Validator.isEmail(emailTextField1.getText()) &&
            Validator.isEmailsEquals(emailTextField1.getText(), emailTextField2.getText())&&
            Validator.isPasswordValid(getPassword(passwordTextField1))&&
            Validator.isPasswordsEquals(getPassword(passwordTextField1),getPassword(passwordTextField2))&&
            Validator.isUsernameValid(usernameTextField.getText());
            
        }
    
}
private String getPassword(JPasswordField _passwordField){
        String pass="";
            for(char ch:_passwordField.getPassword())
            {
                pass+=ch;
            }
            return pass;
    }
    }



   
    


