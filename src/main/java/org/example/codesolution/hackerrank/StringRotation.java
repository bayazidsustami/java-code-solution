package org.example.codesolution.hackerrank;

import java.util.List;

public class StringRotation {

    public static String putarString(String s, List<Integer> putaran) {
        char[] chars = s.toCharArray();

        int i = 0;
        while (i < putaran.size()) {
            int j = 0;
            while (j < putaran.get(i)) {
                if (chars[j] == 'z') {
                    chars[j] = 'a';
                } else {
                    chars[j]++;
                }
                j++;
            }
            i++;
        }

        return new String(chars);
    }

    public static String shiftCharacters(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'z') {
                chars[i] = 'a';
            } else if (Character.isLowerCase(chars[i])) {
                chars[i]++;
            }
        }
        return new String(chars);
    }

    public static String shiftCharacters(String input, int length) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < length; i++) {
            if (chars[i] == 'z') {
                chars[i] = 'a';
            } else {
                chars[i]++;
            }
        }
        return new String(chars);
    }

}
