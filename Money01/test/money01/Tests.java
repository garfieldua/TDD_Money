package money01;

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
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}