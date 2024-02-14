package org.example.codesolution.maxnumb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumNumberTest {

    @Test
    public void findMaxNumberTest() {
        var expected1 = 10;
        var result1 = MaximumNumber.findMaxNumber(new int[]{1, 4, 6,10, 3, 4, 9});

        Assertions.assertEquals(expected1, result1);

        var expected2 = 12;
        var result2 = MaximumNumber.findMaxNumber(new int[]{1, 4, 6,10, 12, 4, 12});
        Assertions.assertEquals(expected2, result2);

    }

}