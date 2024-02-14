package org.example.codesolution.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void testIsPalindromeTrue() {
        var result = Palindrome.isPalindrome("radar");
        Assertions.assertTrue(result);
    }

    @Test
    void testIsPalindromeFalse() {
        var result = Palindrome.isPalindrome("talas");
        Assertions.assertFalse(result);
    }
}