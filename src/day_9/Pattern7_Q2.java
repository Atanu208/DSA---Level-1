package day_9;

import java.util.Scanner;
public class Pattern7_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if(j==i) System.out.print("*");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
