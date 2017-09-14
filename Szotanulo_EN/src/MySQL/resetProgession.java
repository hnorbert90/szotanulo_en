
package MySQL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class resetProgession extends MySQLDatabase{
    
    private String username;
    private String game;
    private static String DELETE_STATISTIC;
    private static String DELETE_PROGRESSION;
    
    public resetProgession(String _gameName) {
        
        this.username=Settings.UserSettings.username;
        this.game=_gameName.equalsIgnoreCase("IrregularVerbs")?"inirregularverbs":"InTheMostCommonWords";
        
        DELETE_PROGRESSION = "UPDATE " +DATABASE+ "."+"`userprogression` SET `learnedwords"+game+"` = ? WHERE `userprogression`.`username` = ?;";
        DELETE_STATISTIC = "UPDATE " +DATABASE+ "."+"`userstatistic` SET `correctanswers"+game+"` = ?, `accuracy"+game+"`= ?, `badanswers"+game+"`= ? , `alreadylearnedwords"+game+"`= ? WHERE `userstatistic`.`username` = ?;";
        
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
            preparedStatement.setString(1, "0");
            preparedStatement.setString(2, "0");
            preparedStatement.setString(3, "0");
            preparedStatement.setString(4, "0");
            preparedStatement.setString(5, this.username);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(resetProgession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteProgression() {
        try {
            preparedStatement = connect.prepareStatement(DELETE_PROGRESSION);
            preparedStatement.setString(1, "0");
            preparedStatement.setString(2, this.username);
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
