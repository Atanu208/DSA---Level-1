package day_8;
import java.util.Scanner;

public class Pattern_5_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line : ");
        int line=sc.nextInt();
        int space=line/2;
        int ster=1;
        for (int i=1; i <= line ; i++) {
            for (int j = 0; j<space ; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <ster ; j++) {
                System.out.print("*\t");
            }
            if(i<=line/2)
            {
                ster= ster+2;
                space--;
            }
            else{
                space++;
                ster =ster-2;
            }
            System.out.println();
        }
    }
}
