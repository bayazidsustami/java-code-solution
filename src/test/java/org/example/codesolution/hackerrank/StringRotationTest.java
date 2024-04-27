package org.example.codesolution.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringRotationTest {

    @Test
    public void stringRotationTest1() {
        String result = StringRotation.putarString("abz", List.of(3, 2, 1));
        Assertions.assertEquals("dda", result);
    }

    @Test
    void shiftString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String shifted = StringRotation.shiftCharacters(input);
        System.out.println("Original: " + input);
        System.out.println("Shifted: " + shifted);
    }
}