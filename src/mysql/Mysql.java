/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

/**
 *
 * @author admin
 */
public class Mysql {
    
   
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       insertUserToDatabase();
       
    }
       public static void insertUserToDatabase() throws Exception{
           mysqlConnector connect = new mysqlConnector();
             try{
                connect.insertUser("vili", "pass2", "vili@gmail.com");
             }catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e){
                  System.err.println("A felhasználónév, vagy az email már létezik!");
             }catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException e){
                  System.err.println("Nem sikerült kapcsolodni a szerverhez!");
             }
       
    }
    

    
    

}