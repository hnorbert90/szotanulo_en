/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Norbi
 */
public class MP3PlayerTest {
    
    public MP3PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {

    }

    /**
     * Test of run method, of class MP3Player.
     */
    @Test
    public void testRun() throws InterruptedException {
        String filename ="src//Resources//voices//eat_ate_eaten.mp3";
        
        MP3Player newPlay = new MP3Player(filename);
        newPlay.run();
      
    }
    
}
