
package Forms;

import static MySQL.LoadFromDatabase.unPackSaveIntoList;
import Tools.LoadUsernameAndPassword;
import Tools.SaveUsernameAndPassword;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {

   MySQL.serverStatus status=new MySQL.serverStatus();
   UPDATE update = new UPDATE();
    public Login() {
        initComponents();
        setUI();
        
        status.start();
        update.start();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        forgotPasswordLabel = new javax.swing.JLabel();
        serverOfflineAlertLabel = new javax.swing.JLabel();
        AlertLabel = new javax.swing.JLabel();
        registrationButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        offlineModeButton = new javax.swing.JButton();
        rememberCheckBox = new javax.swing.JCheckBox();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImages(null);
        setResizable(false);

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        usernameTextField.setNextFocusableComponent(passwordTextField);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        passwordTextField.setNextFocusableComponent(loginButton);
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyPressed(evt);
            }
        });

        forgotPasswordLabel.setForeground(new java.awt.Color(0, 51, 255));
        forgotPasswordLabel.setText("Do you forgot  your password?");
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMouseExited(evt);
            }
        });

        serverOfflineAlertLabel.setForeground(new java.awt.Color(204, 0, 51));
        serverOfflineAlertLabel.setText("Server not response please use the offline mode until the problem will be fixed!");

        AlertLabel.setForeground(new java.awt.Color(255, 0, 51));
        AlertLabel.setText("Must be filled!");

        registrationButton.setText("Registration");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        offlineModeButton.setText("Offline mode");
        offlineModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineModeButtonActionPerformed(evt);
            }
        });
        offlineModeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                offlineModeButtonKeyPressed(evt);
            }
        });

        rememberCheckBox.setText("Remember");
        rememberCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rememberCheckBoxStateChanged(evt);
            }
        });
        rememberCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serverOfflineAlertLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(forgotPasswordLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AlertLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordLabel)
                                        .addComponent(usernameLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(passwordTextField)))
                                .addComponent(registrationButton)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(loginButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(offlineModeButton)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rememberCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(serverOfflineAlertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(AlertLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rememberCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordLabel)
                .addGap(38, 38, 38)
                .addComponent(offlineModeButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed

    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void forgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseClicked
        sendEmail();
    }//GEN-LAST:event_forgotPasswordLabelMouseClicked

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed

    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        openRegistration();
    }//GEN-LAST:event_registrationButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
     login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) login();
       
    }//GEN-LAST:event_loginButtonKeyPressed

    private void offlineModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineModeButtonActionPerformed
        openMainMenu();
    }//GEN-LAST:event_offlineModeButtonActionPerformed

    private void offlineModeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_offlineModeButtonKeyPressed
     
    }//GEN-LAST:event_offlineModeButtonKeyPressed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void passwordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) focusNext();
    }//GEN-LAST:event_passwordTextFieldKeyPressed

    private void forgotPasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseEntered
        forgotPasswordLabel.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_forgotPasswordLabelMouseEntered

    private void forgotPasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseExited
        forgotPasswordLabel.setForeground(new Color(0,51,255));
    }//GEN-LAST:event_forgotPasswordLabelMouseExited

    private void rememberCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberCheckBoxActionPerformed

    private void rememberCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rememberCheckBoxStateChanged
        saveUsername();
    }//GEN-LAST:event_rememberCheckBoxStateChanged

   
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlertLabel;
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton offlineModeButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registrationButton;
    private javax.swing.JCheckBox rememberCheckBox;
    private javax.swing.JLabel serverOfflineAlertLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
    
    private void setUI() {
        setWindowToCenter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/images/icon.png")));
        AlertLabel.setVisible(false);
        loadUsername();
    }
    
    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    private void loadUsername(){
        new LoadUsernameAndPassword();
        passwordTextField.setText(LoadUsernameAndPassword.password);
        usernameTextField.setText(LoadUsernameAndPassword.username);
    }
    
    private void login() {
        
        if(checkPasswod()) {
            Settings.UserSettings.username=usernameTextField.getText();
            Settings.UserSettings.isUserOnline=true;
            loadStatistic();
            openMainMenu();
            if(rememberCheckBox.isSelected()) saveUsername();
        }else{
            AlertLabel.setText("Hibás felhasználónév, vagy jelszó!");
            AlertLabel.setVisible(true);
            AlertLabel.setForeground(java.awt.Color.red);
        }
    }
    
    private boolean checkPasswod() {
        if(validateLoginParameters()){
            try {
                return  MySQL.Login.login(usernameTextField.getText(), getPassword());
            } catch (ClassNotFoundException | SQLException ex) {
                return false;
            }
        }else return false;
    }
    
    private boolean validateLoginParameters() {
        return MySQL.Validator.isPasswordValid(getPassword())&&MySQL.Validator.isUsernameValid(usernameTextField.getText());
    }
    
    private String getPassword(){
        String pass="";
            for(char ch:passwordTextField.getPassword())
            {
                pass+=ch;
            }
            return pass;
    }
    
    private void loadStatistic() {
      
        MySQL.LoadFromDatabase.getStatisticFromDatabase(usernameTextField.getText());
        try {
           unPackSaveIntoList(usernameTextField.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            }
       
    }
    
    private void openMainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        welcomeUser();
        update.closeUpdate();
        status.closeUpdate();
        update=null;
        status=null;
        this.dispose();
    }
    
    private void welcomeUser() {
        new Tools.TextToSpeech("Welcome "+Settings.UserSettings.username+" Let's Play! Have fun!").start();
    }
    
    private void openRegistration() {
        Registration registration = new Registration();
        registration.setVisible(true);
        update.closeUpdate();
        status.closeUpdate();
        update=null;
        status=null;
        this.dispose();
    }

    private void sendEmail() {
        String text="We are sent reminder e-mail to your mailbox!";
        try {
            if(usernameTextField.getText()!="" && forgotPasswordLabel.getText()!=(text)){ 
                Tools.SendPasswordReminderEmail.sendEmailTo(MySQL.LoadFromDatabase.getEmail(usernameTextField.getText()), "password reminder", "Hi "+usernameTextField.getText()+",\n \n"+"Your requested password cannot be retrieved!\n\n Your sincerely");
                forgotPasswordLabel.setText(text);
                forgotPasswordLabel.setForeground(Color.RED);

            }
        } catch (Exception e) {
        }
    }
    
    private void saveUsername() {
        new SaveUsernameAndPassword(usernameTextField.getText(),getPassword());
    }
    
    private void focusNext() {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.focusNextComponent(); 
    }

    public class UPDATE extends Tools.ThreadControll{
        private boolean  running = true;
        
        public void closeUpdate() {
        running=false;
        }
        
        private void update() {
            while(running){
                serverOfflineAlertLabel.setVisible(!MySQL.serverStatus.isServerUp);
                passwordTextField.setEnabled(MySQL.serverStatus.isServerUp);
                loginButton.setEnabled(MySQL.serverStatus.isServerUp);
                registrationButton.setEnabled(MySQL.serverStatus.isServerUp);
                forgotPasswordLabel.setEnabled(MySQL.serverStatus.isServerUp);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                }
            }
        }
        
        @Override
        public void run(){
            update();
        }
    }
}