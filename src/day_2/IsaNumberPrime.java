package day_2;
import java.util.Scanner;
public class IsaNumberPrime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for (int i = 0; i < t; i++) {
            int count=0;
            int value=obj.nextInt();
            for (int j = 2; j*j <= value; j++) {
                if(value%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }
}
