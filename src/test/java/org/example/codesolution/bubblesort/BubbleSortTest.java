package org.example.codesolution.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testBubbleSortInt() {
        var expected = new int[]{1, 2, 3, 4, 5};
        var result = BubbleSort.bubbleSortInt(new int[]{5, 4, 3, 2, 1});

        Assertions.assertEquals(expected[0], result[0]);
        Assertions.assertEquals(expected[1], result[1]);
        Assertions.assertEquals(expected[2], result[2]);
        Assertions.assertEquals(expected[3], result[3]);
        Assertions.assertEquals(expected[4], result[4]);
    }

    @Test
    void testBubbleSortString() {
        var expected = new String[]{"A", "B", "C", "D", "E"};
        var result = BubbleSort.bubbleSortString(new String[]{"E", "D", "C", "B", "A"});

        Assertions.assertEquals(expected[0], result[0]);
        Assertions.assertEquals(expected[1], result[1]);
        Assertions.assertEquals(expected[2], result[2]);
        Assertions.assertEquals(expected[3], result[3]);
        Assertions.assertEquals(expected[4], result[4]);
    }
}