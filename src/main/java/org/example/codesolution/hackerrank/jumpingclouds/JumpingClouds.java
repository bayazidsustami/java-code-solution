package org.example.codesolution.hackerrank.jumpingclouds;

import java.util.List;

public class JumpingClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        var result = 0;
        var index = 0;
        while (index < c.size() -1 ){
            if (index + 2 < c.size() && c.get(index + 2) == 0) {
                result++;
                index += 2;
            } else {
                result++;
                index++;
            }
        }
        return result;
    }

}
