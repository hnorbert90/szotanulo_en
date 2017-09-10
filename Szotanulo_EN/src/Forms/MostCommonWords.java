
package Forms;

import java.awt.Dimension;
import java.awt.Toolkit;



public class MostCommonWords extends javax.swing.JFrame {

    /**
     * Creates new form GyakoriSzavak
     */
    public MostCommonWords() {
        initComponents();
        setUI();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        answerTextField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        definitionBox = new javax.swing.JTextArea();
        definitonLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        wordList = new javax.swing.JComboBox<>();
        alreadyLearnedWordsLabel = new javax.swing.JLabel();
        alreadyLearnedWordsCounterLabel = new javax.swing.JLabel();
        remainingWordsLabel = new javax.swing.JLabel();
        remainingWordsCounterLabel = new javax.swing.JLabel();
        correctAnswerLabel = new javax.swing.JLabel();
        correctAnswerCounterLabel = new javax.swing.JLabel();
        badAnswerLabel = new javax.swing.JLabel();
        badAnswerCounterLabel = new javax.swing.JLabel();
        accuracyLabel = new javax.swing.JLabel();
        accuracyPercentageLabel = new javax.swing.JLabel();
        wordsLabel = new javax.swing.JLabel();
        solution = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        authorLabel = new javax.swing.JLabel();
        authorLabel2 = new javax.swing.JLabel();
        authorEmailLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        muteButton = new javax.swing.JToggleButton();
        playButton = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        toolsMenu = new javax.swing.JMenu();
        backMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        resetMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leggyakoribb szavak");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(550, 550));
        setResizable(false);

        answerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerTextField.setToolTipText("");
        answerTextField.setNextFocusableComponent(checkButton);
        answerTextField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                answerTextFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        answerTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerTextFieldFocusGained(evt);
            }
        });
        answerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTextFieldActionPerformed(evt);
            }
        });
        answerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerTextFieldKeyPressed(evt);
            }
        });

        checkButton.setText("Check");
        checkButton.setToolTipText("\"Válasz ellenőrzése!\"");
        checkButton.setNextFocusableComponent(nextButton);
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        checkButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkButtonKeyPressed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setToolTipText("\"Következő szó!\"");
        nextButton.setNextFocusableComponent(answerTextField);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        nextButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nextButtonKeyPressed(evt);
            }
        });

        definitionBox.setEditable(false);
        definitionBox.setColumns(20);
        definitionBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        definitionBox.setLineWrap(true);
        definitionBox.setRows(5);
        definitionBox.setText("-Jobb oldalt a \"Words\" nevű legördülő menüben\nválaszd ki a gyakorolni kívánt szó listát!\n-Kezdéshez írd be a felhasználónevet és nyomj entert, \nvagy kattints a start gombra!\n-válasz beírása után nyomj entert, vagy kattints\na Check gombra!\n-Az eredményeid elmenti a program automatikusan, \na következő belépésnél ott folytathatod ahol abbahagytad\na szótanulást!\n");
        definitionBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scrollPanel.setViewportView(definitionBox);

        definitonLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        definitonLabel.setText("Def:");

        usernameLabel.setText("User:");

        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField.setNextFocusableComponent(answerTextField);
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setNextFocusableComponent(answerTextField);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        startButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startButtonKeyPressed(evt);
            }
        });

        wordList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-150", "150-300", "300-450", "450-600" }));
        wordList.setToolTipText("\"Csak a 1-150 elérhető jelenleg!\"");
        wordList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordListActionPerformed(evt);
            }
        });

        alreadyLearnedWordsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alreadyLearnedWordsLabel.setText("Already learned words:");

        alreadyLearnedWordsCounterLabel.setText("0");
        alreadyLearnedWordsCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        remainingWordsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        remainingWordsLabel.setText("Remaining words:");

        remainingWordsCounterLabel.setText("150");
        remainingWordsCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        correctAnswerLabel.setText("Correct answers:");

        correctAnswerCounterLabel.setText("0");
        correctAnswerCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        badAnswerLabel.setText("Bad answers:");

        badAnswerCounterLabel.setText("0");
        badAnswerCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        accuracyLabel.setText("Accuracy:");

        accuracyPercentageLabel.setText("0.0%");
        accuracyPercentageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        wordsLabel.setText("Words:");

        solution.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        solution.setForeground(new java.awt.Color(255, 0, 51));
        solution.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        resetButton.setText("Reset");
        resetButton.setToolTipText("\"Mentés törlése\"");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        authorLabel.setText("Készítette:");

        authorLabel2.setText("Hollay Norbert");

        authorEmailLabel.setText("hnorbert90@gmail.com");

        versionLabel.setText("v1.1");

        muteButton.setText("Sound OFF");
        muteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteButtonActionPerformed(evt);
            }
        });

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images/play.png"))); // NOI18N

        toolsMenu.setText("Tools");

        backMenuItem.setText("Back");
        backMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(backMenuItem);

        menu.add(toolsMenu);

        editMenu.setText("Edit");

        resetMenuItem.setText("Eredmények törlése");
        resetMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(resetMenuItem);

        menu.add(editMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(versionLabel)
                                        .addComponent(authorLabel)
                                        .addComponent(authorLabel2)
                                        .addComponent(authorEmailLabel)))
                                .addGap(0, 71, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accuracyLabel)
                                    .addComponent(correctAnswerLabel)
                                    .addComponent(badAnswerLabel)
                                    .addComponent(remainingWordsLabel)
                                    .addComponent(alreadyLearnedWordsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(remainingWordsCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(correctAnswerCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(badAnswerCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accuracyPercentageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alreadyLearnedWordsCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(resetButton))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(definitonLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wordsLabel)
                                    .addComponent(usernameTextField)
                                    .addComponent(wordList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel)))
                            .addComponent(muteButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(definitonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wordsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wordList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startButton))
                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alreadyLearnedWordsLabel)
                            .addComponent(alreadyLearnedWordsCounterLabel))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remainingWordsLabel)
                            .addComponent(remainingWordsCounterLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctAnswerLabel)
                            .addComponent(correctAnswerCounterLabel))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(badAnswerLabel)
                            .addComponent(badAnswerCounterLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accuracyLabel)
                            .addComponent(accuracyPercentageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(authorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorEmailLabel)
                        .addGap(18, 18, 18)
                        .addComponent(versionLabel)
                        .addGap(18, 18, 18)))
                .addGap(95, 95, 95))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

     
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
           
    }//GEN-LAST:event_checkButtonActionPerformed

    private void wordListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordListActionPerformed

    }//GEN-LAST:event_wordListActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
       
    }//GEN-LAST:event_nextButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
    
    }//GEN-LAST:event_startButtonActionPerformed

    private void answerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTextFieldActionPerformed
        
    }//GEN-LAST:event_answerTextFieldActionPerformed

    private void answerTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerTextFieldKeyPressed
 
    }//GEN-LAST:event_answerTextFieldKeyPressed

    private void checkButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkButtonKeyPressed

    }//GEN-LAST:event_checkButtonKeyPressed

    private void nextButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nextButtonKeyPressed

    }//GEN-LAST:event_nextButtonKeyPressed

    private void startButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startButtonKeyPressed

    }//GEN-LAST:event_startButtonKeyPressed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed

    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
 
    }//GEN-LAST:event_resetButtonActionPerformed

    private void resetMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMenuItemActionPerformed

    }//GEN-LAST:event_resetMenuItemActionPerformed

    private void backMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuItemActionPerformed
    backToMainMenu();
    }//GEN-LAST:event_backMenuItemActionPerformed

    private void answerTextFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_answerTextFieldAncestorAdded

    }//GEN-LAST:event_answerTextFieldAncestorAdded

    private void muteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteButtonActionPerformed
        Settings.UserSettings.voice=!Settings.UserSettings.voice;
    }//GEN-LAST:event_muteButtonActionPerformed

    private void answerTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerTextFieldFocusGained
  
    }//GEN-LAST:event_answerTextFieldFocusGained


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
            java.util.logging.Logger.getLogger(MostCommonWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MostCommonWords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracyLabel;
    private javax.swing.JLabel accuracyPercentageLabel;
    private javax.swing.JLabel alreadyLearnedWordsCounterLabel;
    private javax.swing.JLabel alreadyLearnedWordsLabel;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JLabel authorEmailLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel authorLabel2;
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JLabel badAnswerCounterLabel;
    private javax.swing.JLabel badAnswerLabel;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel correctAnswerCounterLabel;
    private javax.swing.JLabel correctAnswerLabel;
    private javax.swing.JTextArea definitionBox;
    private javax.swing.JLabel definitonLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JToggleButton muteButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel remainingWordsCounterLabel;
    private javax.swing.JLabel remainingWordsLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JMenuItem resetMenuItem;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel solution;
    private javax.swing.JButton startButton;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JLabel usernameLabel;
    public javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JComboBox<String> wordList;
    private javax.swing.JLabel wordsLabel;
    // End of variables declaration//GEN-END:variables
      
    private void backToMainMenu(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }
    
    private void setUI() {
        setWindowToCenter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/images/icon.png")));
        usernameTextField.setText(Settings.UserSettings.username);
        muteButton.setSelected(Settings.UserSettings.voice);
        loadStats();
    }

    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    } 
    
    private void loadStats(){
        alreadyLearnedWordsCounterLabel.setText(""+MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.size());
        remainingWordsCounterLabel.setText(""+(150-MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.size()));
        correctAnswerCounterLabel.setText(""+MySQL.GameProgression.correctAnswersWordsInTheMostCommonWords);
        badAnswerCounterLabel.setText(""+MySQL.GameProgression.badAnswersWordsInTheMostCommonWords);
        MySQL.GameProgression.updateAccuracy();
        accuracyPercentageLabel.setText(""+MySQL.GameProgression.accuracyInTheMostCommonWords);
    }
    
}
