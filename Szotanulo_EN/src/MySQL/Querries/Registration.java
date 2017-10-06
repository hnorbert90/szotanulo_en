
package MySQL.Querries;

import MySQL.MySQLDatabase;
import Tools.BCrypt;
import java.sql.SQLException;


public class Registration extends MySQLDatabase {
    
   
    
    public static void insertUser(String user,String pass, String email) throws Exception {
        connectToDatabase();
        pass=encryptPassword(pass);
           
        try {
 
            preparedStatement = connect.prepareStatement("insert into " +DATABASE+ "."+USERDATA_TABLE+" values (?, ?, ?)");
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            close();
        }
    }
    
    private static String encryptPassword(String pass) {
        return BCrypt.hashpw(pass,BCrypt.gensalt());
    }
}
