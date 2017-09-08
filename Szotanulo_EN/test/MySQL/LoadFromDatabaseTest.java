/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.util.ArrayList;
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
public class LoadFromDatabaseTest {
    
    public LoadFromDatabaseTest() {
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

    /**
     * Test of unPackSaveIntoList method, of class LoadFromDatabase.
     */
    @Test
    public void testUnPackSaveIntoList() throws Exception {
        System.out.println("unPackSaveIntoList");
        String _username = "Gyla3";
        LoadFromDatabase.unPackSaveIntoList(_username);
        ArrayList learnedWordNumbersInIrregularVerbsTest = new ArrayList();
        ArrayList learnedWordNumbersInTheMostCommonWordsTest = new ArrayList();
        learnedWordNumbersInIrregularVerbsTest.add(123);
        learnedWordNumbersInIrregularVerbsTest.add(323);
        learnedWordNumbersInTheMostCommonWordsTest.add(1235);
        learnedWordNumbersInTheMostCommonWordsTest.add(3163);
        assertEquals(learnedWordNumbersInIrregularVerbsTest, GameProgression.learnedWordNumbersInIrregularVerbs);
        assertEquals(learnedWordNumbersInTheMostCommonWordsTest, GameProgression.learnedWordNumbersInTheMostCommonWords);
    }
    
}
