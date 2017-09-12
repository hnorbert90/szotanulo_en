/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class saveGameProgressionToDatabase extends Tools.ThreadControll{

    @Override
    public void run() {
        
        try {
            MySQL.SaveToDatabase.saveLearnedWordsToDatabase(Settings.UserSettings.username);
            MySQL.SaveToDatabase.saveStatisticToDatabase(Settings.UserSettings.username);
        } catch (Exception ex) {
            Logger.getLogger(saveGameProgressionToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(saveGameProgressionToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
