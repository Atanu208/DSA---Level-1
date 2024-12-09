package day_11;
import java.util.Scanner;

public class Pattern16_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int space=((n*2)-1)-2;
        int star=1;
        int afterSpace=2;

        for (int i=1; i <=n ; i++)
        {
            for (int j=1; j<=star ; j++) {
                    System.out.print(j+"\t");
            }
            if(i==n) star--;

            for (int j=1; j<=space ;j++) {
                System.out.print("*\t");
            }
            for (int j=star; j >= 1 ; j--) {
                    System.out.print(j+"\t");
            }
            space=space-2;
            star++;
            System.out.println();
        }
    }
}
