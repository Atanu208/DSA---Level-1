package day_15;

import java.util.Scanner;

public class DecimaltoanyBase_Q3 {
    public static int decimaltoanyBase(int decimalNumber,int base)
    {
        int result=0;
        int pow=1;
        while (decimalNumber>0)
        {
            int rem=decimalNumber%base;
            decimalNumber=decimalNumber/base;
            result = result+(rem*pow);
            pow=pow*10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Decimal : ");
        int decimalNum= sc.nextInt();
        System.out.println("Base : ");
        int base= sc.nextInt();
        int result=decimaltoanyBase(decimalNum,base);
        System.out.println(base + " => "+result );
    }
}
