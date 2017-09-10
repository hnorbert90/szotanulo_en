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
public class SendPasswordRememberEmailTest {
    
    public SendPasswordRememberEmailTest() {
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
     * Test of main method, of class SendPasswordReminderEmail.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        SendPasswordReminderEmail.sendEmailTo("hnorbert90@gmail.com","Hello","sikeres email");
        
    }
    
}
