package org.example.codesolution.hackerrank.telportation;

import org.junit.jupiter.api.Test;

import java.util.List;

class TeleportationPortalTest {

    @Test
    void teleportationPortal() {
        var expected = List.of(3, 2, 2, 1, 2);
        var result = TeleportationPortal.calculateMinProtection(5, 2, 11, new int[]{8, 4, 14, 1, 13});

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    @Test
    void teleportationPortal2() {
        var expected = List.of(3, 2, 2, 1, 2);
        var result = TeleportationPortal.calculateMinProtection(5, 2, 11, new int[]{16, 18, 4, 9, 5, 10, 6, 13, 1, 0, 19, 1});

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}