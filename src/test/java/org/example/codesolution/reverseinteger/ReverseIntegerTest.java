package org.example.codesolution.reverseinteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    @Test
    public void testReverseInteger() {
        var expected = 4321;
        var result = ReverseInteger.reverseInteger(1234);
        Assertions.assertEquals(expected, result);
    }

}