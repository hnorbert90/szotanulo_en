
package Forms;

import MySQL.model.GameProgression;
import Tools.ExcelReader;
import Tools.WordGenerate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



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
        resetButton = new javax.swing.JButton();
        authorLabel = new javax.swing.JLabel();
        authorLabel2 = new javax.swing.JLabel();
        authorEmailLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        muteButton = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        goodAnswerLabel = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        volumeSlider = new javax.swing.JSlider();
        voiceSpeedSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        toolsMenu = new javax.swing.JMenu();
        backMenuItem = new javax.swing.JMenuItem();

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
        setPreferredSize(new java.awt.Dimension(550, 600));
        setResizable(false);

        answerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerTextField.setToolTipText("");
        answerTextField.setEnabled(false);
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
        checkButton.setEnabled(false);
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
        nextButton.setEnabled(false);
        nextButton.setMaximumSize(new java.awt.Dimension(63, 23));
        nextButton.setMinimumSize(new java.awt.Dimension(63, 23));
        nextButton.setNextFocusableComponent(answerTextField);
        nextButton.setPreferredSize(new java.awt.Dimension(63, 23));
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
        definitionBox.setEnabled(false);
        scrollPanel.setViewportView(definitionBox);

        definitonLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        definitonLabel.setText("Def:");

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

        muteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images/soundON.png"))); // NOI18N
        muteButton.setBorder(null);
        muteButton.setBorderPainted(false);
        muteButton.setContentAreaFilled(false);
        muteButton.setDisabledIcon(null);
        muteButton.setDisabledSelectedIcon(null);
        muteButton.setFocusable(false);
        muteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteButtonActionPerformed(evt);
            }
        });

        goodAnswerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goodAnswerLabel.setForeground(new java.awt.Color(51, 204, 0));
        goodAnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goodAnswerLabel.setText("  ");

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images/play_off.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setEnabled(false);
        playButton.setFocusable(false);
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goodAnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(playButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goodAnswerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        volumeSlider.setMinorTickSpacing(10);
        volumeSlider.setPaintLabels(true);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setFocusable(false);
        volumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeSliderStateChanged(evt);
            }
        });

        voiceSpeedSlider.setMaximum(200);
        voiceSpeedSlider.setMinimum(100);
        voiceSpeedSlider.setMinorTickSpacing(15);
        voiceSpeedSlider.setPaintTicks(true);
        voiceSpeedSlider.setFocusable(false);
        voiceSpeedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                voiceSpeedSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Volume:");

        jLabel2.setText("Voice speed:");

        maxLabel.setText("Max");

        toolsMenu.setText("Tools");

        backMenuItem.setText("Back");
        backMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(backMenuItem);

        menu.add(toolsMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(versionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorEmailLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
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
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(definitonLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(muteButton)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(voiceSpeedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(wordsLabel)
                                        .addComponent(wordList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maxLabel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(muteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(definitonLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(voiceSpeedSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(maxLabel)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wordsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wordList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton))
                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alreadyLearnedWordsLabel)
                    .addComponent(alreadyLearnedWordsCounterLabel))
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
                .addGap(172, 172, 172))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

     
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        checkAnswer();    
        focusNext();
    }//GEN-LAST:event_checkButtonActionPerformed

    private void wordListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordListActionPerformed

    }//GEN-LAST:event_wordListActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        next();
        focusNext();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        startGame();
        focusNext();
    }//GEN-LAST:event_startButtonActionPerformed

    private void answerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTextFieldActionPerformed
        
    }//GEN-LAST:event_answerTextFieldActionPerformed

    private void answerTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkAnswer();
            focusNext();
        }
    }//GEN-LAST:event_answerTextFieldKeyPressed

    private void checkButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            checkAnswer();
            focusNext();
        }
    
    }//GEN-LAST:event_checkButtonKeyPressed

    private void nextButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nextButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            next();
            focusNext();
        }
    }//GEN-LAST:event_nextButtonKeyPressed

    private void startButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            startGame();
            focusNext();
        }
    }//GEN-LAST:event_startButtonKeyPressed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        deleteProgessionInTheMostCommonWords();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void backMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuItemActionPerformed
        backToMainMenu();
    }//GEN-LAST:event_backMenuItemActionPerformed

    private void answerTextFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_answerTextFieldAncestorAdded

    }//GEN-LAST:event_answerTextFieldAncestorAdded

    private void muteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteButtonActionPerformed
        Settings.UserSettings.voice=!Settings.UserSettings.voice;
        setMuteIcon();
        setSlidersDisabled();
        
    }//GEN-LAST:event_muteButtonActionPerformed

    private void answerTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerTextFieldFocusGained
  
    }//GEN-LAST:event_answerTextFieldFocusGained

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        read();
    }//GEN-LAST:event_playButtonActionPerformed

    private void volumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeSliderStateChanged
        setVolume();
    }//GEN-LAST:event_volumeSliderStateChanged

    private void voiceSpeedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_voiceSpeedSliderStateChanged
        setVoiceSpeed();
    }//GEN-LAST:event_voiceSpeedSliderStateChanged

    private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
      if (playButton.isEnabled()) {
            try {
                playButton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Resources/images/play.png"))));
            } catch (IOException ex) {
                Logger.getLogger(IrregularVerbs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_playButtonMouseEntered

    private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
     if (playButton.isEnabled()) {
            try {
                playButton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Resources/images/play_off.png"))));
            } catch (IOException ex) {
                Logger.getLogger(IrregularVerbs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_playButtonMouseExited


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
    private javax.swing.JLabel goodAnswerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JToggleButton muteButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel remainingWordsCounterLabel;
    private javax.swing.JLabel remainingWordsLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JSlider voiceSpeedSlider;
    private javax.swing.JSlider volumeSlider;
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
        muteButton.setSelected(Settings.UserSettings.voice);
        checkButton.setVisible(true);
        nextButton.setVisible(false);
        loadStats();
        setMuteIcon();
        setSlidersDisabled();
        setSliders();
    }
    
    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    } 
    
    private void loadStats(){
        alreadyLearnedWordsCounterLabel.setText(""+GameProgression.learnedWordNumbersInTheMostCommonWords.size());
        remainingWordsCounterLabel.setText(""+(GameProgression.THE_MOST_COMMON_WORDS_NUMBER-GameProgression.learnedWordNumbersInTheMostCommonWords.size()));
        correctAnswerCounterLabel.setText(""+GameProgression.correctAnswersWordsInTheMostCommonWords);
        badAnswerCounterLabel.setText(""+GameProgression.badAnswersWordsInTheMostCommonWords);
        GameProgression.updateAccuracy();
        accuracyPercentageLabel.setText(String.format("%.2f", GameProgression.accuracyInTheMostCommonWords)+"%");
    }
    
    private void setMuteIcon() {
       try {
            muteButton.setIcon(Settings.UserSettings.voice ? new ImageIcon(ImageIO.read(getClass().getResource("/Resources/images/soundON.png"))) : new ImageIcon(ImageIO.read(getClass().getResource("/Resources/images/soundOFF.png"))));
        } catch (IOException ex) {
            }
    }
    
    private void setSlidersDisabled() {
        voiceSpeedSlider.setEnabled(Settings.UserSettings.voice);
        volumeSlider.setEnabled(Settings.UserSettings.voice);
    }

    private void setSliders() {
        volumeSlider.setValue((int)Settings.UserSettings.voiceVolume*100);
        voiceSpeedSlider.setValue((int)Settings.UserSettings.voiceSpeed*100);
    }

    private void startGame(){
        Tools.Check.filename=wordList.getSelectedItem().toString();
        nextWord();
        setGameFuntionsEnabled();
    }
    
    private void nextWord(){
        Tools.WordGenerate.generateRandomTheMostCommonWord();
        Tools.Check.number=Tools.WordGenerate.generatedNumber;
        setDefinitionBox();
        readWord();
    }
    
    private void setGameFuntionsEnabled() {
        definitionBox.setEnabled(true);
        answerTextField.setEnabled(true);
        checkButton.setEnabled(true);
        nextButton.setEnabled(true);
        playButton.setEnabled(true);
    }
    
    private void setDefinitionBox() {      
        definitionBox.setText((String)ExcelReader.getWordByNumber(Tools.Check.number, wordList.getSelectedItem().toString()).get(1));
    }
    
    private void readWord(){
        if(voiceIsEnabled()){
            read();
        }
    }
    private void read(){
         new Tools.TextToSpeech((String)ExcelReader.getWordByNumber(Tools.Check.number, wordList.getSelectedItem().toString()).get(0)).start();
    }
    private void checkAnswer(){
        readAnswer();
            if(isGoodAnswer()){
                updateStatsGoodAnswer();
            }else {
                updateStatsBadAnswer();
                showGoodAnswer();
            }
        playSoundEffect(isGoodAnswer());
        saveProgessionToDatabase();
        loadStats();
        checkButton.setVisible(false);
        nextButton.setVisible(true); 
    }
    
    private void readAnswer() {
        Tools.Check._answer.clear();
        Tools.Check._answer.add(answerTextField.getText().toLowerCase().trim());
        Tools.Check._answer.add((String)ExcelReader.getWordByNumber(Tools.Check.number, wordList.getSelectedItem().toString()).get(1));
    }

    private void saveProgessionToDatabase() {
        if(Settings.UserSettings.isUserOnline){
           new MySQL.saveGameProgressionToDatabase().start();
        }
    }
    
    private void updateStatsGoodAnswer() {
        answerTextField.setBackground(Color.green);
        GameProgression.learnedWordNumbersInTheMostCommonWords.add(Tools.Check.number);
        GameProgression.correctAnswersWordsInTheMostCommonWords++;
        GameProgression.updateAccuracy();
        GameProgression.alreadyLearnedWordsInTheMostCommonWords=GameProgression.learnedWordNumbersInTheMostCommonWords.size();
    }

    private void updateStatsBadAnswer() {
        answerTextField.setBackground(Color.red);
        GameProgression.badAnswersWordsInTheMostCommonWords++;
        GameProgression.updateAccuracy();
    }
    
    private void showGoodAnswer() {
        goodAnswerLabel.setText((String)ExcelReader.getWordByNumber(Tools.Check.number, wordList.getSelectedItem().toString()).get(0));
    }
    
    private void playSoundEffect(boolean answer){
        if(voiceIsEnabled()){
            if(answer)
                new Tools.MP3Player("src//Resources/voices/succes.mp3").start();
            else 
                new Tools.MP3Player("src/Resources/voices/fail.mp3").start();
        }
    }
    
    private boolean voiceIsEnabled() {
        return Settings.UserSettings.voice;
    }
    
    private boolean isGoodAnswer() {
        try {    
            return Tools.Check.checkAnswer();
        } catch (IOException ex) {
            return false;
            }
    }

    private void next() {
        clearAnswerField();
        startGame();
        checkButton.setVisible(true);
        nextButton.setVisible(false);
    }

    private void clearAnswerField() {
        answerTextField.setText("");
        answerTextField.setBackground(Color.white);
        goodAnswerLabel.setText(" ");
    }
    
    private void focusNext() {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.focusNextComponent(); 
    }

    private void setVolume() {
        Settings.UserSettings.voiceVolume=((float)volumeSlider.getValue()/100);
    }

    private void setVoiceSpeed() {
        Settings.UserSettings.voiceSpeed=((float)(voiceSpeedSlider.getMaximum()+voiceSpeedSlider.getMinimum()-voiceSpeedSlider.getValue())/100);
    }
    
    private void deleteProgessionInTheMostCommonWords() {
        new MySQL.Querries.resetProgession("themostcommonwords");
        MySQL.model.GameProgression.resetClass();
        loadStats();
    }
}
