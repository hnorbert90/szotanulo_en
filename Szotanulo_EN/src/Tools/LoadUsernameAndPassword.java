package Tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadUsernameAndPassword {

    public static String username;
    public static String password;

    public LoadUsernameAndPassword() {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader("user.dat"));
            username = input.readLine();
            password = input.readLine();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally {
            try {
                input.close();
            } catch (IOException | NullPointerException ex) {
                new SaveUsernameAndPassword("", "");

            }
        }
    }
}
