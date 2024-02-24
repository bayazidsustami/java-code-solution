package org.example.codesolution.hackerrank.telportation;

//TODO : unsolved
public class TeleportationPortal {

    public static int[] calculateMinProtection(int N, int P1, int P2, int[] powerLevels) {
        int[] protectionLevels = new int[powerLevels.length];

        // Calculate minimum and maximum reachable portals from P1
        int minReachableFromP1 = Math.min(P1 - 2, powerLevels[0]);
        int maxReachableFromP1 = Math.max(P1 + 2, powerLevels[N - 1]);

        // Calculate minimum and maximum reachable portals from P2
        int minReachableFromP2 = Math.min(P2 - 2, powerLevels[0]);
        int maxReachableFromP2 = Math.max(P2 + 2, powerLevels[N - 1]);

        for (int i = 0; i < powerLevels.length; i++) {
            int portal = powerLevels[i];

            // Check if portal is reachable from P1
            if (portal >= minReachableFromP1 && portal <= maxReachableFromP1) {
                protectionLevels[i] = Math.abs(portal - P1);
            } else {
                // Check if portal is reachable from P2
                if (portal >= minReachableFromP2 && portal <= maxReachableFromP2) {
                    protectionLevels[i] = Math.abs(portal - P2);
                } else {
                    // Not reachable from either P1 or P2, require max protection
                    protectionLevels[i] = Math.min(Math.abs(portal - P1), Math.abs(portal - P2));
                }
            }
        }

        return protectionLevels;
    }
}
