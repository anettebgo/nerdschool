package no.nerdschool;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class FizzBuzzerTests {

    @Test
    public void testSmoke() {
        assertTrue(new FizzBuzzer() instanceof FizzBuzzer);
        assertEquals(1, 1);
    }
}
