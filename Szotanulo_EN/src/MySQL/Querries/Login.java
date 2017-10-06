
package MySQL.Querries;

import MySQL.MySQLDatabase;
import Tools.BCrypt;
import java.sql.SQLException;


public class Login extends MySQLDatabase {
    
 
    public static boolean login(String _username, String _password) throws ClassNotFoundException, SQLException{
        return checkPassword(_username,_password);
    }
    
    private static boolean checkPassword(String _username, String _password) throws ClassNotFoundException, SQLException{
        return BCrypt.checkpw(_password, selectUsernameFromDatabase(_username));
    }
      
    private static String selectUsernameFromDatabase(String _username) throws ClassNotFoundException, SQLException{
        connectToDatabase();
        settingUpMySQLQuery(_username);
        return executeQuery();
    }
    
    private static void settingUpMySQLQuery(String _username) throws SQLException {
        preparedStatement = connect.prepareStatement("SELECT * FROM `gamedevs_szotanulo_en`.`userdata` WHERE `username`=?;");
        preparedStatement.setString(1, _username);
    }
    
    private static String executeQuery() throws SQLException {
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String _result=resultSet.getString("password");
        close();
        return _result;
    }  
}

