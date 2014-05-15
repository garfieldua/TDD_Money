package money11;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class DollarTest {

    public DollarTest() {
    }

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }
}