package day_10;

import java.util.Scanner;

public class Pattern10_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int outerSpace=n/2;
        int innerSpace=-1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= outerSpace ; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= innerSpace ; j++) {
                System.out.print("\t");
            }
            if(i>1 && i<n)
            {
                System.out.print("*\t");
            }
            if(n/2 >= i)
            {
                outerSpace--;
                innerSpace = innerSpace+2;
            }else{
                outerSpace++;
                innerSpace = innerSpace-2;
            }
            System.out.println();
        }
    }
}
