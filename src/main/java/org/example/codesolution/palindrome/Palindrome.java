package org.example.codesolution.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        char[] chars = word.toCharArray();
        int length = chars.length;

        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        var reversedWord = reversed.toString();

        return word.equals(reversedWord);
    }

}
