package day_2;
import java.util.Scanner;

public class PrintallFibonacciNumberstillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=0;
        int b=1;
        for (int i = 0; i < N; i++) {
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
//            0           1               1             2 3 5
//        first_digit  second_digit   next_digit