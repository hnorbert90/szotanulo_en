
package MySQL.Querries;

import MySQL.model.GameProgression;
import MySQL.MySQLDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoadFromDatabase extends MySQLDatabase {
    private static String learnedWordsInIrregularVerbs;
    private static String learnedWordsInTheMostCommonWords;
    final private static String USERPROGRESSION_QUERY = "SELECT * FROM `gamedevs_szotanulo_en`.`userprogression` WHERE `username`=?;";
    final private static String USERSTATISTIC_QUERY = "SELECT * FROM `gamedevs_szotanulo_en`.`userstatistic` WHERE `username`=?;";
    final private static String USERDATA_QUERY = "SELECT * FROM `gamedevs_szotanulo_en`.`userdata` WHERE `username`=?; ";
    
    public static void unPackSaveIntoList(String _username) throws ClassNotFoundException, SQLException{
        loadSaveIntoVariables(_username);
        String cache="";
        GameProgression.learnedWordNumbersInIrregularVerbs.clear();
        GameProgression.learnedWordNumbersInTheMostCommonWords.clear();
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
        learnedWordsInTheMostCommonWords = loadLearnedWordsFromDatabase(_username,"learnedwordsinthemostcommonwords");
    }
    
    private static String loadLearnedWordsFromDatabase(String _username, String _saveGame) throws ClassNotFoundException, SQLException{
        connectToDatabase();
        settingUpMySQLQuery(_username,USERPROGRESSION_QUERY);
        return getResult(_saveGame);
    }
    private static void settingUpMySQLQuery(String _username,String _query) throws SQLException {
        preparedStatement = connect.prepareStatement(_query);
        preparedStatement.setString(1, _username);
    }
    
    private static String getResult(String _saveGame) throws SQLException {
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String _result=resultSet.getString(_saveGame);
        close();
        return _result;
    }
    
    public static void getStatisticFromDatabase(String _username) {
        try{    
            connectToDatabase();
            settingUpMySQLQuery(_username,USERSTATISTIC_QUERY);

            GameProgression.alreadyLearnedWordsInIrregularVerbs=Integer.parseInt(getResult().getString("alreadyLearnedWordsInIrregularVerbs"));
            GameProgression.correctAnswersInIrregularVerbs=Integer.parseInt(getResult().getString("correctAnswersInIrregularVerbs"));
            GameProgression.badAnswersInIrregularVerbs=Integer.parseInt(getResult().getString("badAnswersInIrregularVerbs"));
            
            GameProgression.alreadyLearnedWordsInTheMostCommonWords=Integer.parseInt(getResult().getString("alreadyLearnedWordsInTheMostCommonWords"));
            GameProgression.correctAnswersWordsInTheMostCommonWords=Integer.parseInt(getResult().getString("correctAnswersInTheMostCommonWords"));
            GameProgression.badAnswersWordsInTheMostCommonWords=Integer.parseInt(getResult().getString("badAnswersInTheMostCommonWords"));
            close();
        }catch(Exception ex) {
            System.out.println(ex);
            }  
    }
    
    public static String getEmail(String _username) throws ClassNotFoundException, SQLException{
        connectToDatabase();
        settingUpMySQLQuery(_username,USERDATA_QUERY);
        return getResult().getString("email");
    }
    
    private static ResultSet getResult() throws SQLException{
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet;
    }
}
