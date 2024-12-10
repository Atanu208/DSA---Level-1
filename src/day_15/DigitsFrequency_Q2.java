package day_15;

import java.util.Scanner;

public class DigitsFrequency_Q2 {
    public static int digitsFrequency(int n,int d)
    {
        int count=0;
        while(n>0)
        {
            int result=n%10;
            if(result==d)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n: ");
        int n= sc.nextInt();
        System.out.println("d: ");
        int d= sc.nextInt();
        int digitsFrequencyRet=digitsFrequency(n,d);
        System.out.println("Digits Frequency : "+digitsFrequencyRet);
    }
}
