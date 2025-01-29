package day_16;

import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int anyBaseAddition(int n1, int n2, int base) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + c;
            c = d / base;
            d = d % base;
            rv = rv + (d * p);
            p = p * 10;
        }
        return rv;
    }

    public static int getProductWithSingleDigit(int n1, int d2, int base) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / base;
            d = d % base;
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }

    public static int anyBaseMultiplication(int n1, int n2, int base) {
        int rv = 0;
        int p = 1; // Corrected multiplier placement
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sprd = getProductWithSingleDigit(n1, d2, base);
            rv = anyBaseAddition(rv, sprd * p, base);
            p = p * 10; // Update p for next place value
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1 : ");
        int n1 = sc.nextInt();
        System.out.println("n2 : ");
        int n2 = sc.nextInt();
        System.out.println("Base : ");
        int base = sc.nextInt();
        int result = anyBaseMultiplication(n1, n2, base);
        System.out.println("anyBaseMultiplication => " + result);
        sc.close();
    }
}
