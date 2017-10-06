/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.io.IOException;
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
public class ExcelReaderTest {

    public ExcelReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        ExcelReader.getWordByNumber(15, "irregularverbs");
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
    public void testSomeMethod() throws IOException {

    }

    /**
     * Test of getWordByNumber method, of class ExcelReader.
     */
    @Test
    public void testGetWordByNumber() {
        assertEquals(ExcelReader.actualWord.get(1), "burst");

    }

}
