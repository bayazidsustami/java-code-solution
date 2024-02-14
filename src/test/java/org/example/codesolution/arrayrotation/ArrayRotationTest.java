package org.example.codesolution.arrayrotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayRotationTest {

    @Test
    void testArrayRotation() {
        var expected = new int[]{4, 5, 1, 2, 3};
        var result = ArrayRotation.rotateArray(new int[]{1, 2, 3, 4, 5}, 2);

        Assertions.assertEquals(expected[0], result[0]);
        Assertions.assertEquals(expected[1], result[1]);
        Assertions.assertEquals(expected[2], result[2]);
        Assertions.assertEquals(expected[3], result[3]);
        Assertions.assertEquals(expected[4], result[4]);
    }
}