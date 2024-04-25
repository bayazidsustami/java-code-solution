package org.example.codesolution.hackerrank;

import java.util.List;

public class StringRotation {

    public static String putarString(String s, List<Integer> putaran) {
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < putaran.size(); i++) {
            for (int j = 0; j < putaran.get(i); j++) {
                chars[j] = (char) ((chars[j] - 'a' + 1) % 26 + 'a');
            }
        }

        return new String(chars);
    }

}
