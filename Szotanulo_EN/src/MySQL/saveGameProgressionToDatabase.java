
package MySQL;


public class saveGameProgressionToDatabase extends Tools.ThreadControll{
   
    @Override
    public void run() {
        
        try {
            MySQL.SaveToDatabase.saveLearnedWordsToDatabase(Settings.UserSettings.username);
            MySQL.SaveToDatabase.saveStatisticToDatabase(Settings.UserSettings.username);
        } catch (Exception ex) {
            }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            
            }
    }
    
    
}
