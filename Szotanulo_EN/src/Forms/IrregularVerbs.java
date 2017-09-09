/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.io.IOException;



/**
 *Irregular verbs application.
 * @author Norbi
 */
public class IrregularVerbs extends javax.swing.JFrame {
  
 
  
    /**
     * Creates new form Ablak2
     */
    public IrregularVerbs() {
        initComponents();   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        checkButton = new javax.swing.JButton();
        infinitiveTextField = new javax.swing.JTextField();
        simplePastTextField = new javax.swing.JTextField();
        pastPerfectTextField = new javax.swing.JTextField();
        infinitiveLabel = new javax.swing.JLabel();
        simplePastLabel = new javax.swing.JLabel();
        pastPerfectLabel = new javax.swing.JLabel();
        alreadyLearnedWordsLabel = new javax.swing.JLabel();
        remainingWordsLabel = new javax.swing.JLabel();
        formNameLabel = new javax.swing.JLabel();
        meansLabel = new javax.swing.JLabel();
        definitonLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        infinitiveCorrectAnswerLabel = new javax.swing.JLabel();
        simplePerfectCorrectAnswerLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        pastPerfectCorrectAnswerLabel = new javax.swing.JLabel();
        correctAnswersLabel = new javax.swing.JLabel();
        correctAnswersCounterLabel = new javax.swing.JLabel();
        remainingWordsCounterLabel = new javax.swing.JLabel();
        alreadyLearnedWordsCounterLabel = new javax.swing.JLabel();
        badAnswersLabel = new javax.swing.JLabel();
        badAnswersCounterLabel = new javax.swing.JLabel();
        accuracyLabel = new javax.swing.JLabel();
        accuracyPercentageLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        versionLabel = new javax.swing.JLabel();
        authorEmailLabel = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        muteButton = new javax.swing.JToggleButton();
        menu = new javax.swing.JMenuBar();
        toolsMenu = new javax.swing.JMenu();
        backMenuItem = new javax.swing.JMenuItem();
        resetMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        jFrame1.setResizable(false);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Irregular verbs");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        checkButton.setText("Check");
        checkButton.setNextFocusableComponent(nextButton);
        checkButton.setPreferredSize(new java.awt.Dimension(65, 25));
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

        infinitiveTextField.setNextFocusableComponent(simplePastTextField);
        infinitiveTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infinitiveTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infinitiveTextFieldFocusLost(evt);
            }
        });
        infinitiveTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infinitiveTextFieldActionPerformed(evt);
            }
        });
        infinitiveTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                infinitiveTextFieldKeyPressed(evt);
            }
        });

        simplePastTextField.setNextFocusableComponent(pastPerfectTextField);
        simplePastTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplePastTextFieldActionPerformed(evt);
            }
        });
        simplePastTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                simplePastTextFieldKeyPressed(evt);
            }
        });

        pastPerfectTextField.setNextFocusableComponent(checkButton);
        pastPerfectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastPerfectTextFieldActionPerformed(evt);
            }
        });
        pastPerfectTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pastPerfectTextFieldKeyPressed(evt);
            }
        });

        infinitiveLabel.setText(" Infinitive");

        simplePastLabel.setText("Simple Past");

        pastPerfectLabel.setText("Past Perfect");

        alreadyLearnedWordsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alreadyLearnedWordsLabel.setText("Already learned words:");

        remainingWordsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        remainingWordsLabel.setText("Remaining words:");

        formNameLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        formNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formNameLabel.setText("Irregular verbs");
        formNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        meansLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        meansLabel.setText("Means:");

        definitonLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        definitonLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        definitonLabel.setText("To start please click on start button!");
        definitonLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                definitonLabelInputMethodTextChanged(evt);
            }
        });
        definitonLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                definitonLabelPropertyChange(evt);
            }
        });

        startButton.setText("Start");
        startButton.setNextFocusableComponent(infinitiveTextField);
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });
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

        infinitiveCorrectAnswerLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        infinitiveCorrectAnswerLabel.setForeground(new java.awt.Color(180, 0, 0));

        simplePerfectCorrectAnswerLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        simplePerfectCorrectAnswerLabel.setForeground(new java.awt.Color(180, 0, 0));

        nextButton.setText("Next");
        nextButton.setNextFocusableComponent(infinitiveTextField);
        nextButton.setPreferredSize(new java.awt.Dimension(65, 25));
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

        pastPerfectCorrectAnswerLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pastPerfectCorrectAnswerLabel.setForeground(new java.awt.Color(180, 0, 0));

        correctAnswersLabel.setText("Correct answers:");

        correctAnswersCounterLabel.setText("0");
        correctAnswersCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        remainingWordsCounterLabel.setText("127");
        remainingWordsCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        alreadyLearnedWordsCounterLabel.setText("0");
        alreadyLearnedWordsCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        badAnswersLabel.setText("Bad answers:");

        badAnswersCounterLabel.setText("0");
        badAnswersCounterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        accuracyLabel.setText("Accuracy:");

        accuracyPercentageLabel.setText("0");
        accuracyPercentageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        usernameLabel.setText("User:");

        usernameTextField.setNextFocusableComponent(infinitiveTextField);
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

        versionLabel.setText("v1.1");

        authorEmailLabel.setText("hnorbert90@gmail.com");

        authorNameLabel.setText("Hollay Norbert");

        authorLabel.setText("Készítette:");

        muteButton.setText("Sound OFF");
        muteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteButtonActionPerformed(evt);
            }
        });

        toolsMenu.setText("Tools");

        backMenuItem.setText("Back");
        backMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(backMenuItem);

        resetMenuItem.setText("Reset");
        resetMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(resetMenuItem);

        menu.add(toolsMenu);

        editMenu.setText("Edit");
        menu.add(editMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(formNameLabel)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(meansLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(definitonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infinitiveLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(infinitiveCorrectAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(infinitiveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(simplePastLabel)
                                    .addComponent(simplePerfectCorrectAnswerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(simplePastTextField))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pastPerfectLabel)
                                    .addComponent(pastPerfectTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(pastPerfectCorrectAnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorEmailLabel)
                                    .addComponent(authorLabel))
                                .addGap(133, 133, 133))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(versionLabel)
                                    .addComponent(authorNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accuracyLabel)
                            .addComponent(badAnswersLabel)
                            .addComponent(remainingWordsLabel)
                            .addComponent(correctAnswersLabel)
                            .addComponent(alreadyLearnedWordsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(remainingWordsCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(correctAnswersCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(badAnswersCounterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accuracyPercentageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alreadyLearnedWordsCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formNameLabel)
                            .addComponent(startButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(muteButton)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definitonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meansLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infinitiveLabel)
                    .addComponent(simplePastLabel)
                    .addComponent(pastPerfectLabel))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infinitiveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simplePastTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastPerfectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infinitiveCorrectAnswerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(simplePerfectCorrectAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pastPerfectCorrectAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(authorLabel)
                        .addGap(5, 5, 5)
                        .addComponent(authorEmailLabel)
                        .addGap(10, 10, 10)
                        .addComponent(authorNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(versionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alreadyLearnedWordsLabel)
                            .addComponent(alreadyLearnedWordsCounterLabel))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remainingWordsLabel)
                            .addComponent(remainingWordsCounterLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctAnswersLabel)
                            .addComponent(correctAnswersCounterLabel))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(badAnswersLabel)
                            .addComponent(badAnswersCounterLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accuracyLabel)
                            .addComponent(accuracyPercentageLabel))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

    }//GEN-LAST:event_checkButtonActionPerformed

    private void infinitiveTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infinitiveTextFieldActionPerformed
 
    }//GEN-LAST:event_infinitiveTextFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

    }//GEN-LAST:event_startButtonActionPerformed

    private void simplePastTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplePastTextFieldActionPerformed

    }//GEN-LAST:event_simplePastTextFieldActionPerformed

    private void pastPerfectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastPerfectTextFieldActionPerformed
  
    }//GEN-LAST:event_pastPerfectTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
      
    }//GEN-LAST:event_nextButtonActionPerformed

    private void infinitiveTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infinitiveTextFieldKeyPressed

     
    }//GEN-LAST:event_infinitiveTextFieldKeyPressed

    private void checkButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkButtonKeyPressed
     
    }//GEN-LAST:event_checkButtonKeyPressed

    private void nextButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nextButtonKeyPressed
    
    }//GEN-LAST:event_nextButtonKeyPressed

    private void startButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startButtonKeyPressed
     
    }//GEN-LAST:event_startButtonKeyPressed

    private void pastPerfectTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pastPerfectTextFieldKeyPressed
     

    }//GEN-LAST:event_pastPerfectTextFieldKeyPressed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed

     
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
  
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void backMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuItemActionPerformed

    }//GEN-LAST:event_backMenuItemActionPerformed

    private void infinitiveTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infinitiveTextFieldFocusGained

    }//GEN-LAST:event_infinitiveTextFieldFocusGained

    private void infinitiveTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infinitiveTextFieldFocusLost
   
    }//GEN-LAST:event_infinitiveTextFieldFocusLost

    private void definitonLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_definitonLabelPropertyChange
 
    }//GEN-LAST:event_definitonLabelPropertyChange

    private void definitonLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_definitonLabelInputMethodTextChanged

    }//GEN-LAST:event_definitonLabelInputMethodTextChanged

    private void simplePastTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simplePastTextFieldKeyPressed
   
    
    }//GEN-LAST:event_simplePastTextFieldKeyPressed

    private void resetMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMenuItemActionPerformed
     
    }//GEN-LAST:event_resetMenuItemActionPerformed

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
      
    }//GEN-LAST:event_startButtonMouseClicked

    private void muteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteButtonActionPerformed
        
    }//GEN-LAST:event_muteButtonActionPerformed

    
    public static void main(String args[]) throws IOException {
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      //  try {
        //    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
          //      if ("Nimbus".equals(info.getName())) {
            //        javax.swing.UIManager.setLookAndFeel(info.getClassName());
              //      break;
                //}
           // }
        //} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
         //   java.util.logging.Logger.getLogger(irregularVerbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IrregularVerbs().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracyLabel;
    private javax.swing.JLabel accuracyPercentageLabel;
    private javax.swing.JLabel alreadyLearnedWordsCounterLabel;
    private javax.swing.JLabel alreadyLearnedWordsLabel;
    private javax.swing.JLabel authorEmailLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JLabel badAnswersCounterLabel;
    private javax.swing.JLabel badAnswersLabel;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel correctAnswersCounterLabel;
    private javax.swing.JLabel correctAnswersLabel;
    private javax.swing.JLabel definitonLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel formNameLabel;
    private javax.swing.JLabel infinitiveCorrectAnswerLabel;
    private javax.swing.JLabel infinitiveLabel;
    private javax.swing.JTextField infinitiveTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel meansLabel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JToggleButton muteButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pastPerfectCorrectAnswerLabel;
    private javax.swing.JLabel pastPerfectLabel;
    private javax.swing.JTextField pastPerfectTextField;
    private javax.swing.JLabel remainingWordsCounterLabel;
    private javax.swing.JLabel remainingWordsLabel;
    private javax.swing.JMenuItem resetMenuItem;
    private javax.swing.JLabel simplePastLabel;
    private javax.swing.JTextField simplePastTextField;
    private javax.swing.JLabel simplePerfectCorrectAnswerLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JLabel usernameLabel;
    public javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}