package day_11;
import java.util.Scanner;

public class Pattern13_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();

        for (int i=0; i<n ; i++) {
            int number=1;
            for (int j = 0; j <=i; j++) {
                System.out.print(number+"\t");
                number = number * (i - j)/(j+1);
            }
            System.out.println();
        }
    }
}
