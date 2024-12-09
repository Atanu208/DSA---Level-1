package day_14;
import java.util.Scanner;

public class Pattern18_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=n;
        int space=0;
        for (int i=1; i<=n ; i++) {
            for (int k = 0; k < space ; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=star ; j++) {
                if(i!=1 && i<=n/2)
                {
                    if(j==1 || j==star) System.out.print("*\t");
                    else System.out.print("\t");

                }else System.out.print("*\t");
            }

            if(i <= n/2)
            {
                star = star-2;
                space++;
            }
            else {
                star=star+2;
                space--;
            }
            System.out.println();
        }
    }
}
