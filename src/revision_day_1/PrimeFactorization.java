package revision_day_1;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while (n>1)
            {
                if(n%i==0)
                {
                    System.out.println(i);
                    n=n/i;
                }else i++;
            }
        if(n!=1) System.out.println(n);

    }
}