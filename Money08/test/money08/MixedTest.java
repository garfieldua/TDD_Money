package money08;

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
}