package revision_day_1;

import java.util.Scanner;

public class Pattern_2_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();

        for (int i = line; 1<= i ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
