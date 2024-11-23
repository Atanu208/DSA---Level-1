package day_3;
import java.util.Scanner;

public class CountDigitsInaNumber_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        int count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        System.out.println(count);
    }
}