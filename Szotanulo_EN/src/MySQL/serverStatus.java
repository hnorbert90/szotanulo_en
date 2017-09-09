/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Norbi
 */
public class serverStatus extends Tools.ThreadControll{
 
 public static boolean isServerUp;

    @Override
    public void run() {
       while(true) { 
           try {
           
        Socket socket = new Socket("31.22.4.224", 3306);
        socket.close(); 
        isServerUp=true;
    }
    catch (IOException e)
    {
        isServerUp=false;
    }      try {
        Thread.sleep(200);
           } catch (InterruptedException ex) {
               Logger.getLogger(serverStatus.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
