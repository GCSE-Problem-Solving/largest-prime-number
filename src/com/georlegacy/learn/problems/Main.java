package com.georlegacy.learn.problems;

/*
 * Finding the highest prime factor of a number
 *
 *  @author James Conway
 */


public class Main {

    public static void main(String[] args) {
        // Declare the number to use
        long number = 600851475143L;

        // Create a new variable equal to the original number to be changed
        long n = number;

        // Declare a variable to store the largest prime factor
        int largestPrime = 0;
        // Loop through all possible factors
        for (int i = 2; i < n; i++) {
            // If number is divisible by said factor, check it against the current largest prime factor
            while (n % i == 0) {
                if (i > largestPrime) {
                    // Reassign largest prime
                    largestPrime = i;
                }
                // Divide current state of original number by said factor to continue process
                n = n / i;
            }
        }

        // If the remaining number is larger than two, it is another prime factor
        if (n > 2) {
            // Check against current largest prime factor
            if (n > largestPrime) {
                // If larger then reassign again
                largestPrime = (int) n;
            }
        }

        // Display answer to console
        System.out.printf("The largest prime factor of %s is %s", number, largestPrime);
    }

}
