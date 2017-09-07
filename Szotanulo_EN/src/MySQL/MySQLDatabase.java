
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
    
    private static final String DATABASE="gamedevs_szotanulo_en";
    private static final String TABLE="userdata";
    
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static Connection connect = null;
   
    
    public static void insertUser(String user,String pass, String email) throws Exception {
            connectToDatabase();
        try {
 
            preparedStatement = connect.prepareStatement("insert into " +DATABASE+ "."+TABLE+" values (?, ?, ?)");
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            

        } catch (SQLException e) {
            throw e;
        } finally {
            close();
        }
       // SELECT * FROM `userdata` WHERE `username`=bela;
    
    }
    public static String[] selectUsernameFromDatabase(String _username) throws ClassNotFoundException, SQLException{
            connectToDatabase();
            settingUpMySQLQuery(_username);
            return executeQuery();
    }
    private static void connectToDatabase() throws ClassNotFoundException, SQLException{ 
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
           // statement = connect.createStatement();
           // resultSet = statement.executeQuery("select * from " +DATABASE+"."+TABLE);
    }
    
     private static void settingUpMySQLQuery(String _username) throws SQLException {
        preparedStatement = connect.prepareStatement("SELECT * FROM `gamedevs_szotanulo_en`.`userdata` WHERE `username`=?;");
        preparedStatement.setString(1, _username);
    }
     
     private static String[] executeQuery() throws SQLException {
      resultSet = preparedStatement.executeQuery();
      resultSet.next();
      return new String[]{
          resultSet.getString("username"),
          resultSet.getString("password"),
          resultSet.getString("email")
        };
    }
    private static void close() {
        try {
            if (resultSet != null)  resultSet.close();
            if (statement != null)  statement.close();
            if (connect != null)    connect.close();
           
        } catch (SQLException e) {
        }
    }

    

    

   

}
