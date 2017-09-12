
package Tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class SaveUsernameAndPassword {
    public SaveUsernameAndPassword(String _username, String _password) {

    BufferedWriter output = null;
        try {
           output = new BufferedWriter(new FileWriter("user.txt"));
           output.write(_username);
           output.newLine();
           output.write(_password);
        } catch (IOException ex) {
        } finally {
           try {
               output.close();
           } catch (IOException ex) {
            }
        }
   }
}
