/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class mysqlConnector{
    private final String HOST="jdbc:mysql://31.22.4.224";
    private final int PORT=3306;
    private final String URL=HOST+":"+PORT;
    private final String USERNAME="gamedevs_norbi";
    private final String PASSWORD="adminjelszo";
    private final String DATABASE="gamedevs_szotanulo_en";
    private  Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private  Connection connect = null;
   
    
    public void insertUser(String user,String pass, String email) throws Exception {
            connectToDatabase();
        try {
 
            preparedStatement = connect.prepareStatement("insert into " +DATABASE+ ".userdata values (?, ?, ?)");
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            

        } catch (SQLException e) {
            throw e;
        } finally {
            close();
            System.out.println("Bezártam a mysql kapcsolatot mivel sikeres volt a feltöltés");
        }
        
    
    }
    public void selectFromDatabase() throws ClassNotFoundException, SQLException{
            connectToDatabase();
            preparedStatement = connect.prepareStatement("SELECT username, password, email from "+DATABASE+".userdata");
            resultSet = preparedStatement.executeQuery();
    }
    public void connectToDatabase() throws ClassNotFoundException, SQLException{ 
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " +DATABASE+".userdata");
    }
    
    private void close() {
        try {
            if (resultSet != null)  resultSet.close();
            if (statement != null)  statement.close();
            if (connect != null)    connect.close();
           
        } catch (SQLException e) {
        }
    }

}
