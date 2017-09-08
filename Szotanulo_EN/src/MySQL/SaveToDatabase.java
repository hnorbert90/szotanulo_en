/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import static MySQL.MySQLDatabase.connectToDatabase;
import static MySQL.MySQLDatabase.preparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Norbi
 */
public class SaveToDatabase extends MySQLDatabase {
    private static String learnedWordsInIrregularVerbs;
    private static String learnedWordsInTheMostCommonWords;
    
    public static void saveLearnedWordsToDatabase(String user) throws Exception {
            connectToDatabase();
            getLearnedWords();
            
            
        try {
           
            
            try {
                preparedStatement = connect.prepareStatement("insert into " +DATABASE+ "."+USERPROGRESSION_TABLE+" values (?, ?, ?)");
                preparedStatement.setString(1, user);
                preparedStatement.setString(2, learnedWordsInIrregularVerbs);
                preparedStatement.setString(3, learnedWordsInTheMostCommonWords); 
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                preparedStatement = connect.prepareStatement("UPDATE " +DATABASE+ "."+"`userprogression` SET `learnedwordsinirregularverbs` = ?, `learneadwordsinthemostcommonwords` = ? WHERE `userprogression`.`username` = ?;");
                preparedStatement.setString(1, learnedWordsInIrregularVerbs);
                preparedStatement.setString(2, learnedWordsInTheMostCommonWords); 
                preparedStatement.setString(3, user);
                preparedStatement.executeUpdate();
             }   
            
          
            

        } catch (SQLException e) {
            throw e;
        } finally {
            close();
        }

    }
    
    private static void getLearnedWords(){
    learnedWordsInIrregularVerbs="";
    GameProgression.learnedWordNumbersInIrregularVerbs.forEach((_number) -> {
        learnedWordsInIrregularVerbs+=_number+";";
        });
    learnedWordsInTheMostCommonWords="";
    GameProgression.learnedWordNumbersInTheMostCommonWords.forEach((_number) -> {
        learnedWordsInTheMostCommonWords+=_number+";";
        });
    }
}
