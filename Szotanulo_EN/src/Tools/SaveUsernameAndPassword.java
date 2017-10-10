package Tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveUsernameAndPassword {

    private String username;
    private String password;

    public SaveUsernameAndPassword(String _username, String _password) {
        username = _username;
        password = _password;
    }

    public void save() {
        BufferedWriter output = null;
        try {
            String path = System.getProperty("user.home") + File.separator + "Documents";
            output = new BufferedWriter(new FileWriter(path + "\\user.dat"));
            output.write(username);
            output.newLine();
            output.write(password);
        } catch (IOException ex) {
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
            }
        }
    }
}
