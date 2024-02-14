package org.example.codesolution.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        var expected = "FizzBuzz";
        var result = FizzBuzz.fizzBuzz(15);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFizz() {
        var expected = "Fizz";
        var result = FizzBuzz.fizzBuzz(9);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testBuzz() {
        var expected = "Buzz";
        var result = FizzBuzz.fizzBuzz(25);
        Assertions.assertEquals(expected, result);
    }
}