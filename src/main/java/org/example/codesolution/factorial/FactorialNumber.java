package org.example.codesolution.factorial;

public class FactorialNumber {

    public static int findFactorialNumber(int n) {
        var result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static int findFactorialNumberWithRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorialNumberWithRecursive(n - 1);
    }
}
