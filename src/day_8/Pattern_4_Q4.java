package day_8;
import java.util.Scanner;

public class Pattern_4_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line : ");
        int line=sc.nextInt();
        int space=0;
        int ster=line;
        for (int i=1; i<=line ; i++) {
            for (int j = 1; j <= space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= ster ; j++) {
                System.out.print("*\t");
            }
            ster--;
            space++;
            System.out.println();
        }
    }
}
