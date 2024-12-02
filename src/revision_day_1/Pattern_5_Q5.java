package revision_day_1;

import java.util.Scanner;

public class Pattern_5_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int space=line/2;
        int star=1;

        for (int i=1; i <= line ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            if (i <= line / 2) {
                star = star + 2;
                space--;
            } else {
                star = star - 2;
                space++;
            }
            System.out.println();
        }
    }
}
