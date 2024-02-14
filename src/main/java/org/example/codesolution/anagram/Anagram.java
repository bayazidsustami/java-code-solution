package org.example.codesolution.anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String wordA, String wordB) {
        var sortedA = wordA.toCharArray();
        var sortedB = wordB.toCharArray();

        Arrays.sort(sortedA);
        Arrays.sort(sortedB);

        return Arrays.equals(sortedA, sortedB);
    }
}
