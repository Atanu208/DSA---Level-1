package revision_day_1;

import java.util.Scanner;

public class Pattern_3_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int space=line-1;
        int ster=1;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j=1; j <= ster; j++) {
                System.out.print("*\t");
            }
            space--;
            ster++;
            System.out.println();
        }
    }
}
