package org.example.codesolution.hackerrank.caesarcode;

public class CaesarCode {

    /*
     * Complete the 'readMessage' function below.
     *
     * The function is expected to return a String.
     * The function accepts String sandi as parameter.
     */

    public static String readMessage(String message) {
        int dots = countDots(message);

        return decrypt(message, dots).replace(".", "");
    }

    private static int countDots(String ciphertext) {
        int count = 0;
        for (char c : ciphertext.toCharArray()) {
            if (c == '.') {
                count++;
            }
        }
        return count;
    }

    private static String decrypt(String ciphertext, int k) {
        StringBuilder plaintext = new StringBuilder();

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char decryptedChar = (char) ((c - 'a' - k + 26) % 26 + 'a');
                plaintext.append(decryptedChar);
            } else {
                plaintext.append(c);
            }
        }

        return plaintext.toString();
    }

}
