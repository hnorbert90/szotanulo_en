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
public class CheckTest {

    public CheckTest() {
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
    public void testSomeMethod() throws IOException {
        Check.filename = "irregularverbs";
        Check.number = 15;
        ArrayList<String> _answer = new ArrayList<String>();

        _answer.add("burst");
        _answer.add("burst");
        _answer.add("burst");
        _answer.add("kitör");
        Check._answer = _answer;

        assertTrue(Check.checkAnswer());

    }

}
