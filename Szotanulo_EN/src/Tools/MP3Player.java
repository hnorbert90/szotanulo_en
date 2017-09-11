/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Norbi
 */
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
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
            
        

                
    }
}
