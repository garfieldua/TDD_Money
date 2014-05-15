package money12;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class MixedTest {

    public MixedTest() {
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