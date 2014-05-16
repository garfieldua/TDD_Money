package money11;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class Tests {

    public Tests() {
    }

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    /*
     * For now, times method is independent of currency.
     * So, we can safely delete this tests
     @Test
     public void testFrancMultiplication() {
     Money five = Money.franc(5);
     assertEquals(Money.franc(10), five.times(2));
     assertEquals(Money.franc(15), five.times(3));
     }
     */
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        /*
         * These tests are redundant now
         assertTrue(Money.franc(5).equals(Money.franc(5)));
         assertFalse(Money.franc(5).equals(Money.franc(6)));
         */
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    /*
     * We don't need this now, since we don't have Franc class anymore
     @Test
     public void testDifferentClassEquality() {
     //assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
     }
     */
}