package day_4;

import java.util.Scanner;

public class InverseofaNumber_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // Input number
        int inverseNumber = 0;
        int position = 1; // Start position from 1

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            number = number / 10;   // Remove the last digit

            // Place the current position at the place of the digit in the inverse
            inverseNumber += position * Math.pow(10, digit - 1);

            position++; // Increment the position
        }

        System.out.println("Inverse of the number: " + inverseNumber);
    }
}
