package day_11;

import java.util.Scanner;

public class Pattern11_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int k=1;
        for (int i =1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }
}
