package day_2;

import java.util.Scanner;

public class PrintAllPrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Low :");
        int low=sc.nextInt();
        System.out.println("High :");
        int high=sc.nextInt();
        for (int i = low+1; i < high; i++) {
            int count=0;
            for (int j = 2; j*j < i; j++) {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i+" Prime");
            }
            else{
                System.out.println(i+" Not Prime");
            }
        }
    }
}
