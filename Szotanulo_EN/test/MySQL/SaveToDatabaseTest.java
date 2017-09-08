/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Norbi
 */
public class SaveToDatabaseTest {
    
    public SaveToDatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        GameProgression.learnedWordNumbersInIrregularVerbs.add(123);
        GameProgression.learnedWordNumbersInIrregularVerbs.add(323);
        GameProgression.learnedWordNumbersInTheMostCommonWords.add(1235);
        GameProgression.learnedWordNumbersInTheMostCommonWords.add(3163);
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

    /**
     * Test of saveLearnedWordsToDatabase method, of class SaveToDatabase.
     */
    @Test
    public void testSaveLearnedWordsToDatabase() throws Exception {
        System.out.println("saveLearnedWordsToDatabase");
        String user = "Gyla3";
        SaveToDatabase.saveLearnedWordsToDatabase(user);
        
    }
    
}
