package no.nerdschool.testeksempel;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class EksempelTest {
    @Test
    public void testReturnTwo() {
        int returnValue = Eksempel.returnTwo();
        assertEquals(2, returnValue);
    }
}
