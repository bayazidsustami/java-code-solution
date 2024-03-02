package org.example.codesolution.hackerrank.rotatingchar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotatingCharacterTest {

    @Test
    void testRotateCharacters() {
        String[] strings = {"sayqsps", "ytayayg", "suisvng", "armnubz", "rbcdefc"};
        char[][] charArray = new char[5][7];

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = 0; j < currentString.length(); j++) {
                charArray[i][j] = currentString.charAt(j);
            }
        }

        System.out.println(Arrays.deepToString(charArray));

        RotatingCharacter.rotate(charArray, 4, 3, "samsung");
        RotatingCharacter.rotate(charArray, 4, 5, "srinabc");
        RotatingCharacter.rotate(charArray, 4, 5, "abcdefg");
        RotatingCharacter.rotate(charArray, 4, 1, "zzzzzzz");
    }
}