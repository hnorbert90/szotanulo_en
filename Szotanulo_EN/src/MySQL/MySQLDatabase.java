
package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySQLDatabase{
    
    private static final String HOST="jdbc:mysql://31.22.4.224";
    private static final int PORT=3306;
    private static final String URL=HOST+":"+PORT;
    
    private static final String USERNAME="gamedevs_norbi";
    private static final String PASSWORD="adminjelszo";
    
    static final String DATABASE="gamedevs_szotanulo_en";
    static final String USERDATA_TABLE="userdata";
    static final String USERPROGRESSION_TABLE="userprogression";
    static final String USERSTATISTIC_TABLE="userstatistic";
    
    private static Statement statement = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    static Connection connect = null;

    
    public static void connectToDatabase() throws ClassNotFoundException, SQLException{ 
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);      
    }
 
    public static void close() {
        try {
            if (resultSet != null)  resultSet.close();
            if (statement != null)  statement.close();
            if (connect != null)    connect.close(); 
        } catch (SQLException e) { 
        }
    }

}
