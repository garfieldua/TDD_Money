/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money13;

import money13.Money;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class MixedTest {
    
    public MixedTest() {
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
    public void testEquality() {
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }
    
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    
    @Test
    public void testDifferentClassEquality() {
        //assertTrue(new Money(10, "CHF").equals(new Franc(10,"CHF")));
    }
}