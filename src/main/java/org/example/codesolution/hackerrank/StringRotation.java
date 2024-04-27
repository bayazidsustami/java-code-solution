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
                if (chars[j] == 'z') {
                    chars[j] = 'a';
                } else if (Character.isLowerCase(chars[j])) {
                    chars[j]++;
                }
            }
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

}
