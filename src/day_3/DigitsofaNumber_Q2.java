package day_3;
import java.util.Scanner;

public class DigitsofaNumber_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        int copy_number=number;
        int count=0;
        while(copy_number!=0)
        {
            copy_number=copy_number/10;
            count++;
        }
        int div=(int) Math.pow(10,count-1);

        while(div!=0)
        {
            int q = number /div;
            System.out.println(q);
            number=number%div;
            div=div/10;
        }
    }
}
