package day_8;
import java.util.Scanner;

public class Pattern_3_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line : ");
        int line=sc.nextInt();
        int space=line-1;
        int star=1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space ; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <star ; j++) {
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
