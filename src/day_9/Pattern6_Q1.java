package day_9;

import java.util.Scanner;

public class Pattern6_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int star=(n/2)+1;
        int space=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= star ; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star ; j++) {
                System.out.print("*\t");
            }
            if(n/2 >= i)
            {
                star --;
                space =space+2;
            }else {
                star++;
                space = space-2;
            }
            System.out.println();
        }
    }
}
