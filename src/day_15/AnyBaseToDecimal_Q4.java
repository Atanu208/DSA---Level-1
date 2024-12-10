package day_15;

import java.util.Scanner;

public class AnyBaseToDecimal_Q4 {
    public static int anyBaseToDecimal(int digit,int base)
    {
        int res=0;
        int pow=1;
        while (digit>0)
        {
            int rem=digit%10;
            digit=digit/10;
            res= res + (rem*pow);
            pow=base*pow;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digit : ");
        int digit= sc.nextInt();
        System.out.println("Base : ");
        int base= sc.nextInt();
        int result=anyBaseToDecimal(digit,base);
        System.out.println(base + " => "+result );
    }
}
