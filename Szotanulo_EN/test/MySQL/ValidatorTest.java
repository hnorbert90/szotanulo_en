/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import MySQL.Tools.Validator;
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
public class ValidatorTest {
    
    public ValidatorTest() {
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
     * Test of isEmail method, of class Validator.
     */
    @Test
    public void testIsEmail() {
        System.out.println("isEmail");
        String _email = "hhsdsd23e@hehe.hu";
        boolean expResult = true;
        boolean result = Validator.isEmail(_email);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isPasswordsEquals method, of class Validator.
     */
    @Test
    public void testIsPasswordsEquals() {
        System.out.println("isPasswordsEquals");
        String _password1 = "password1";
        String _password2 = "password1";
        boolean expResult = true;
        boolean result = Validator.isPasswordsEquals(_password1, _password2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isPasswordValid method, of class Validator.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String _password = "aS2@qqqq";
        boolean expResult = true;
        boolean result = Validator.isPasswordValid(_password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEmailsEquals method, of class Validator.
     */
    @Test
    public void testIsEmailsEquals() {
        System.out.println("isEmailsEquals");
        String _email1 = "hnorbert90@gmail.com";
        String _email2 = "hnorbert90@gmail.com";
        boolean expResult = true;
        boolean result = Validator.isEmailsEquals(_email1, _email2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isUsernameValid method, of class Validator.
     */
    @Test
    public void testIsUsernameValid() {
        System.out.println("isUsernameValid");
        String _username = "hnorbert90";
        boolean expResult = true;
        boolean result = Validator.isUsernameValid(_username);
        assertEquals(expResult, result);
       
    }

  
    
}
