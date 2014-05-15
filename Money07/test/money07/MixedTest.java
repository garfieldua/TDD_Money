package money07;

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
        assertFalse(new Dollar(5).equals(new Franc(5)));
    }
}