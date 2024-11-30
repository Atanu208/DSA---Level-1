package day_8;

import java.util.Scanner;

public class Pattern_1_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line : ");
        int line=sc.nextInt();

        for (int i = 1; i <= line ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
