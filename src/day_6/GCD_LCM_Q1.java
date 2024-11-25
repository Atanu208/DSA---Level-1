package day_6;

import java.util.Scanner;

public class GCD_LCM_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2=sc.nextInt();

        int num1_copy=num1;
        int num2_copy=num2;

        //gcd by division method
        while(num1%num2 !=0)
        {
            int rem=num1%num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println("GCD : "+num2);

        //lcm by (a*b)/gcd(num1,num2) formula
        int lcm = (num1_copy*num2_copy)/num2; //here num2 is gcd(num1,num2)
        System.out.println("LCM : "+lcm);
    }
}
