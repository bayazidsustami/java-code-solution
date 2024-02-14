package org.example.codesolution.primenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {

    @Test
    void testPrimeNumberTrue() {
        var result = PrimeNumber.isPrimeNumber(13);
        Assertions.assertTrue(result);
    }

    @Test
    void testPrimeNumberFalse() {
        var result = PrimeNumber.isPrimeNumber(4);
        Assertions.assertFalse(result);
    }
}