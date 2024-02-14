package org.example.codesolution.anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void isAnagramTrue() {
        var result = Anagram.isAnagram("silent", "listen");
        Assertions.assertTrue(result);
    }

    @Test
    void isAnagramFalse() {
        var result = Anagram.isAnagram("abc", "def");
        Assertions.assertFalse(result);
    }
}