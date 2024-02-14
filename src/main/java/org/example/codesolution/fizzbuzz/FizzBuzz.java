package org.example.codesolution.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        StringBuilder result = new StringBuilder();

        if (n % 3 == 0) {
            result.append("Fizz");
        }

        if (n % 5 == 0) {
            result.append("Buzz");
        }

        return !result.isEmpty() ? result.toString() : String.valueOf(n);
    }
}
