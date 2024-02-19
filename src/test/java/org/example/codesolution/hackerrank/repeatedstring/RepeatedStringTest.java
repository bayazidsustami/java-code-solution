package org.example.codesolution.hackerrank.repeatedstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedStringTest {

    @Test
    void testRepeatedStringTrue() {
        var expected = 4;
        var result = RepeatedString.repeatedString("abcac", 10);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testRepeatedStringTrue1() {
        var expected = 7;
        var result = RepeatedString.repeatedString("aba", 10);

        Assertions.assertEquals(expected, result);
    }
}