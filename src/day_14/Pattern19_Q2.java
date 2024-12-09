package day_14;
import java.util.Scanner;
public class Pattern19_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=n/2;
        int space=1;
        for (int i = 0; i < n ; i++)
        {
            for (int j = 0; j <n ; j++) {
                if(i==0)
                {
                    if(j==n-1 || j<=n/2)
                        System.out.print("*\t");
                    else System.out.print("\t");
                }
                else if (i==n/2) {
                    System.out.print("*\t");
                }
                else if (i==n-1) {
                    if(j==0 || j>=n/2) System.out.print("*\t");
                    else System.out.print("\t");
                }
                else if (i<n/2 && i!=0) {
                    if(j==n/2 || j==n-1) System.out.print("*\t");
                    else System.out.print("\t");
                }
                else if(i>n/2 && i!=n-1)
                {
                    if(j==0 || j==n/2) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
