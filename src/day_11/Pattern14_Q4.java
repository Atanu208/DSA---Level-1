package day_11;

import java.util.Scanner;

public class Pattern14_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"*"+i+ "="+n*i);

        }
    }
}
