
package Forms;

import MySQL.model.GameProgression;
import java.awt.Dimension;
import java.awt.Toolkit;


public class MainMenu extends javax.swing.JFrame {

  
    public MainMenu() {
        initComponents();
        setUI();
        
    }
 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        irregularVerbsButton = new javax.swing.JButton();
        theMostCommonWordsButton = new javax.swing.JButton();
        welcomeMessageLabel = new javax.swing.JLabel();
        playerNameLabel = new javax.swing.JLabel();
        letsPlayLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        toolsMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        resultsMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(150, 300));
        setResizable(false);

        irregularVerbsButton.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        irregularVerbsButton.setText("Irregular verbs");
        irregularVerbsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irregularVerbsButtonActionPerformed(evt);
            }
        });

        theMostCommonWordsButton.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        theMostCommonWordsButton.setText("Most common words");
        theMostCommonWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theMostCommonWordsButtonActionPerformed(evt);
            }
        });

        welcomeMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMessageLabel.setText("Welcome");
        welcomeMessageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        playerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerNameLabel.setText("Player name");

        letsPlayLabel.setText("Lets play:");

        toolsMenu.setText("Tools");

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(logoutMenuItem);

        resultsMenuItem.setText("Results");
        resultsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(resultsMenuItem);

        menuBar.add(toolsMenu);
        menuBar.add(jMenu4);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letsPlayLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(irregularVerbsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(theMostCommonWordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerNameLabel)
                .addGap(18, 18, 18)
                .addComponent(letsPlayLabel)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(irregularVerbsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(theMostCommonWordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        logout();
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void theMostCommonWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theMostCommonWordsButtonActionPerformed
        openTheMostCommonWords();
    }//GEN-LAST:event_theMostCommonWordsButtonActionPerformed

    private void irregularVerbsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irregularVerbsButtonActionPerformed
        openIrregularVerbs();        
    
    }//GEN-LAST:event_irregularVerbsButtonActionPerformed

    private void resultsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsMenuItemActionPerformed
        openResults();
    }//GEN-LAST:event_resultsMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
      
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton irregularVerbsButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JLabel letsPlayLabel;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JLabel playerNameLabel;
    private javax.swing.JMenuItem resultsMenuItem;
    private javax.swing.JButton theMostCommonWordsButton;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JLabel welcomeMessageLabel;
    // End of variables declaration//GEN-END:variables

    private void openIrregularVerbs() {
        IrregularVerbs irregularVerbs = new IrregularVerbs();
        irregularVerbs.setVisible(true);
        this.dispose();
    }
    
    private void openTheMostCommonWords() {
        MostCommonWords theMostCommonWords = new MostCommonWords();
        theMostCommonWords.setVisible(true);
        this.dispose();
    }
    
    private void openResults() {
        Results results = new Results();
        results.setVisible(true);
        this.dispose();
    }
    
    private void logout(){
        Login login = new Login();
        Settings.UserSettings.isUserOnline=false;
        GameProgression.resetClass();
        login.setVisible(true);
        this.dispose();
    }
    
    private void setUI() {
        setWindowToCenter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/images/icon.png")));
        playerNameLabel.setText(Settings.UserSettings.username);
    }

    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

}
