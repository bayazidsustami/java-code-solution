package org.example.codesolution.hackerrank.repeatedstring;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long stringLength = s.length();
        long repeated = n / stringLength;
        int remainder = (int) (n % stringLength);
        long countA = 0;

        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) == 'a') {
                countA += repeated;
                if (i < remainder) {
                    countA++;
                }
            }
        }

        return countA;
    }
}
