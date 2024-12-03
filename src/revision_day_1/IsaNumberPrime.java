package revision_day_1;
import java.util.Scanner;

public class IsaNumberPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0) {
                System.out.println("Not Prime");
                break;
            }
            else {
                System.out.println("Prime");
                break;
            }

        }
    }
}
