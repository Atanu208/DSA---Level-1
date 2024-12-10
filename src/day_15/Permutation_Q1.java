package day_15;

import java.util.Scanner;

public class Permutation_Q1 {
    public static int factorial(int n)
    {
        int res=1;
        for (int i = 1; i <=n ; i++) {
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Total letters (n) = 3 (A, B, C)
        System.out.println("n: ");
        int n= sc.nextInt();
        //Letters to arrange (r) = 2
        System.out.println("r: ");
        int r= sc.nextInt();
        int nFact=factorial(n);
        int nFactRfact=factorial(n-r);
        int res=nFact/nFactRfact; //(6)AB,AC,BA,BC,CA,CB
        System.out.println(res+ " possible arrangements");
    }
}
