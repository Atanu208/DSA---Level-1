package revision_day_1;
import java.util.Scanner;

public class GCD_LCM {

    public static int GCD(int num1, int num2)
    {
        int rem=1;
        while(num1%num2 != 0)
        {
            rem = num1%num2;
            num1=num2;
            num2=rem;
        }
        return num2;
    }
    public static int LCM(int num1,int num2)
    {
        int gcd=GCD(num1,num2);
        System.out.println("GCD : "+gcd);
        int lcm=(num1 * num2)/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int n1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int n2=sc.nextInt();
        System.out.println("LCM : "+LCM(n1,n2));
    }
}
