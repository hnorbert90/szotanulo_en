
package Tools;

import java.io.FileInputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class MP3Player extends ThreadControll  {
    FileInputStream fis = null;
    private String filename;
    private Player playMP3;

    public MP3Player(String _filename) {
        filename=_filename;
    }
 
    @Override
    public void run(){

        try {
            fis = new FileInputStream(filename);
            playMP3 = new Player(fis);  
            playMP3.play();
            fis.close();
            Thread.sleep(50);
        } catch (JavaLayerException|IOException | InterruptedException ex) {  
            }        
    }
}
