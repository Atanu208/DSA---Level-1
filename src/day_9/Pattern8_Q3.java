package day_9;

import java.util.Scanner;

public class Pattern8_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                    if(i==j) System.out.print("*");
                    else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
