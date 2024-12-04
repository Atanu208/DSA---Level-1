package day_11;
import java.util.Scanner;

public class Pattern15_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        int val=1;
        for (int i=1; i <=n ; i++) {
            int temp=val;
            for (int j=1; j<=space ; j++) {
                System.out.print("\t");
            }
            for (int j=1; j<=star; j++) {
                System.out.print(temp+"\t");
                if(j <= star/2)
                {
                    temp++;
                }
                else {
                    temp--;
                }
            }
            if(n/2 >= i)
            {
                star =star+2;
                space--;
                val++;
            }else {
                star =star-2;
                space++;
                val--;
            }
            System.out.println();
        }
    }
}
