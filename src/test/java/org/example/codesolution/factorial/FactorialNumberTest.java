package org.example.codesolution.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialNumberTest {

    @Test
    void findFactorialNumberTest() {
        var expected = 120;
        var result = FactorialNumber.findFactorialNumber(5);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void findFactorialNumberWithRecursiveTest() {
        var expected = 120;
        var result = FactorialNumber.findFactorialNumberWithRecursive(5);

        Assertions.assertEquals(expected, result);
    }
}