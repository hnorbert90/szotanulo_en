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
import static org.junit.Assert.*;

/**
 *
 * @author Norbi
 */
public class WordGenerateTest {
    
    public WordGenerateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        MySQL.model.GameProgression.resetClass();
        MySQL.model.GameProgression.getLeftWordNumbers();
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
     * Test of generateRandomIrregularVerb method, of class WordGenerate.
     */
    @Test
    public void testGenerateRandomIrregularVerb() {
        System.out.println("generateRandomIrregularVerb");
        WordGenerate.generateRandomIrregularVerb();
        assertTrue(WordGenerate.generatedNumber>=0 && WordGenerate.generatedNumber<=MySQL.model.GameProgression.IRREGULAR_VERBS_NUMBER);
    }

    /**
     * Test of generateRandomTheMostCommonWord method, of class WordGenerate.
     */
    @Test
    public void testGenerateRandomTheMostCommonWord() {
        System.out.println("generateRandomTheMostCommonWord");
        WordGenerate.generateRandomTheMostCommonWord();
        assertTrue(WordGenerate.generatedNumber>=0 && WordGenerate.generatedNumber<=MySQL.model.GameProgression.THE_MOST_COMMON_WORDS_NUMBER);
    }
    
}
