package org.example.codesolution.reverseinteger;

public class ReverseInteger {

    public static int reverseInteger(int number) {
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        return result;
    }

}
