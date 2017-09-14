
package MySQL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class resetProgession extends MySQLDatabase{
    
    private String username;
    private String game;
    private static String DELETE_STATISTIC;
    private static String DELETE_PROGRESSION;
    
    public resetProgession(String _game) {
        
        this.username=Settings.UserSettings.username;
        this.game=_game;
        
        DELETE_STATISTIC = "UPDATE " +DATABASE+ "."+"`userprogression` SET `learnedwordsinirregularverbs` = ?, `learneadwordsinthemostcommonwords` = ? WHERE `userprogression`.`username` = ?;";
        DELETE_PROGRESSION = "UPDATE " +DATABASE+ "."+"`userstatistic` SET `correctanswersinirregularverbs` = ?, `correctanswersinthemostcommonwords`= ?, `accuracyinirregularverbs`= ?, `accuracyinthemostcommonwords`= ?, `badanswersinirregularverbs`= ? , `badanswersinthemostcommonwords`= ?, `alreadylearnedwordsinirregularverbs`= ?, `alreadylearnedwordsinthemostcommonwords` = ? WHERE `userstatistic`.`username` = ?;";
        
        new resetOnNewThread().start();
    }
  
    private void reset(){
        try {
            connectToDatabase();
            deleteStatistic();
            deleteProgression();
            close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(resetProgession.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void deleteStatistic() {
        try {
            preparedStatement = connect.prepareStatement(DELETE_STATISTIC);
            preparedStatement.setString(1, this.username);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(resetProgession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteProgression() {
        try {
            preparedStatement = connect.prepareStatement(DELETE_PROGRESSION);
            preparedStatement.setString(1, this.username);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(resetProgession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class resetOnNewThread extends Tools.ThreadControll {

        @Override
        public void run() {
            reset();
        }
    
    
}
    
}
