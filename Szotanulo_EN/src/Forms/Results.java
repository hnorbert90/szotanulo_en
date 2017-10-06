
package Forms;

import MySQL.model.GameProgression;
import static MySQL.Querries.LoadFromDatabase.unPackSaveIntoList;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;


public class Results extends javax.swing.JFrame {

    /**
     * Creates new form EredmenyTabla
     */
    public Results() {
        initComponents();
        setUI();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        playerNameLabel = new javax.swing.JLabel();
        resetTheMostCommonWords = new javax.swing.JButton();
        resetIrregularVerbs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Results");
        setResizable(false);

        formNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        formNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formNameLabel.setText("Results");

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Already learned words:", null, null},
                {"Words left:", null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "Irregular verbs", "The Most common words"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultsTable);
        if (resultsTable.getColumnModel().getColumnCount() > 0) {
            resultsTable.getColumnModel().getColumn(0).setResizable(false);
            resultsTable.getColumnModel().getColumn(1).setResizable(false);
            resultsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        playerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        playerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerNameLabel.setText("Player name");

        resetTheMostCommonWords.setText("Reset");
        resetTheMostCommonWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTheMostCommonWordsActionPerformed(evt);
            }
        });

        resetIrregularVerbs.setText("Reset");
        resetIrregularVerbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetIrregularVerbsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(resetIrregularVerbs)
                        .addGap(80, 80, 80)
                        .addComponent(resetTheMostCommonWords)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(formNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(playerNameLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetTheMostCommonWords)
                    .addComponent(resetIrregularVerbs))
                .addGap(65, 65, 65)
                .addComponent(backButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        backToMainMenu();
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetIrregularVerbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetIrregularVerbsActionPerformed
        deleteProgessionInIrregularVerbs();   
    }//GEN-LAST:event_resetIrregularVerbsActionPerformed

    private void resetTheMostCommonWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTheMostCommonWordsActionPerformed
        deleteProgessionInTheMostCommonWords();
    }//GEN-LAST:event_resetTheMostCommonWordsActionPerformed

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Results().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel formNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel playerNameLabel;
    private javax.swing.JButton resetIrregularVerbs;
    private javax.swing.JButton resetTheMostCommonWords;
    public javax.swing.JTable resultsTable;
    // End of variables declaration//GEN-END:variables
    
    private void backToMainMenu(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }
    
    private void setUI() {
        setWindowToCenter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/images/icon.png")));
        playerNameLabel.setText(Settings.UserSettings.username);
        loadResultTable();
    }

    private void setWindowToCenter() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    private void loadResultTable(){
        resultsTable.setValueAt("Words left", 0, 0);
        resultsTable.setValueAt(GameProgression.IRREGULAR_VERBS_NUMBER-GameProgression.learnedWordNumbersInIrregularVerbs.size(), 0, 1);
        resultsTable.setValueAt(GameProgression.THE_MOST_COMMON_WORDS_NUMBER-GameProgression.learnedWordNumbersInTheMostCommonWords.size(), 0, 2);
        resultsTable.setValueAt("Correct answers", 1, 0);
        resultsTable.setValueAt(GameProgression.correctAnswersInIrregularVerbs, 1, 1);
        resultsTable.setValueAt(GameProgression.correctAnswersWordsInTheMostCommonWords, 1, 2);
        resultsTable.setValueAt("Bad answers", 2, 0);
        resultsTable.setValueAt(GameProgression.badAnswersInIrregularVerbs, 2, 1);
        resultsTable.setValueAt(GameProgression.badAnswersWordsInTheMostCommonWords, 2, 2);
        resultsTable.setValueAt("Accuracy", 3, 0);
        resultsTable.setValueAt(String.format("%.2f", GameProgression.accuracyInIrregularVerbs)+"%", 3, 1);
        resultsTable.setValueAt(String.format("%.2f", GameProgression.accuracyInTheMostCommonWords)+"%", 3, 2);
        
        }
    
     private void deleteProgessionInTheMostCommonWords() {
        new MySQL.Querries.resetProgession("themostcommonwords");
        MySQL.model.GameProgression.resetClass();
        MySQL.model.GameProgression.accuracyInTheMostCommonWords=0;
        MySQL.model.GameProgression.badAnswersWordsInTheMostCommonWords=0;
        MySQL.model.GameProgression.remainsWordsInTheMostCommonWords.clear();
        MySQL.model.GameProgression.correctAnswersWordsInTheMostCommonWords=0;
        loadResultTable();
    }
     private void deleteProgessionInIrregularVerbs() {
        new MySQL.Querries.resetProgession("IrregularVerbs");
        MySQL.model.GameProgression.accuracyInIrregularVerbs=0;
        MySQL.model.GameProgression.badAnswersInIrregularVerbs=0;
        MySQL.model.GameProgression.remainsWordsInTheIrregularVerbs.clear();
        MySQL.model.GameProgression.correctAnswersInIrregularVerbs=0;
        loadResultTable();
    }
        
    }

