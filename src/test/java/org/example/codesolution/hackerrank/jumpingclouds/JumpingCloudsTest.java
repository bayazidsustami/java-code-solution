package org.example.codesolution.hackerrank.jumpingclouds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class JumpingCloudsTest {

    @Test
    void testJumpingCloudTrue() {
        var expected = 4;
        var result = JumpingClouds.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));

        Assertions.assertEquals(expected, result);
    }
}