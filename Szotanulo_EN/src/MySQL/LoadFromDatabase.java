/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import static MySQL.MySQLDatabase.preparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Norbi
 */
public class LoadFromDatabase extends MySQLDatabase {
    private static String learnedWordsInIrregularVerbs;
    private static String learnedWordsInTheMostCommonWords;

    public static void unPackSaveIntoList(String _username) throws ClassNotFoundException, SQLException{
       loadSaveIntoVariables(_username);
       String cache="";
       for(char ch : learnedWordsInIrregularVerbs.toCharArray()){
           if(Character.isDigit(ch)){
            cache+=ch;
           }else if(ch==';'){
            GameProgression.learnedWordNumbersInIrregularVerbs.add(Integer.parseInt(cache));
            cache="";
           }else {
               System.err.println("error");
           }
       }
           for(char ch : learnedWordsInTheMostCommonWords.toCharArray()){
           if(Character.isDigit(ch)){
            cache+=ch;
           }else if(ch==';'){
            GameProgression.learnedWordNumbersInTheMostCommonWords.add(Integer.parseInt(cache));
            cache="";
           }else {
               System.err.println("error");
           }
       }    
               
       
        
    }
    
    private static void loadSaveIntoVariables(String _username) throws ClassNotFoundException, SQLException{
       learnedWordsInIrregularVerbs = loadLearnedWordsFromDatabase(_username,"learnedwordsinirregularverbs");
       learnedWordsInTheMostCommonWords = loadLearnedWordsFromDatabase(_username,"learneadwordsinthemostcommonwords");
    }
    
    private static String loadLearnedWordsFromDatabase(String _username, String _saveGame) throws ClassNotFoundException, SQLException{
        connectToDatabase();
        settingUpMySQLQuery(_username);
        
        return getResult(_saveGame);
    }
    private static void settingUpMySQLQuery(String _username) throws SQLException {
        preparedStatement = connect.prepareStatement("SELECT * FROM `gamedevs_szotanulo_en`.`userprogression` WHERE `username`=?;");
        preparedStatement.setString(1, _username);
    }
    
    private static String getResult(String _saveGame) throws SQLException {
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String _result=resultSet.getString(_saveGame);
        close();
        return _result;
    }
}
