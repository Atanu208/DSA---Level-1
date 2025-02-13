package day_16;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static int anyBaseSubtraction(int n1,int n2,int base)
    {
        int rv=0;
        int c=0;
        int p=1;
        while (n2>0)
        {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=0;
            d2=d2+c;
            if(d2>=d1)
            {
                c=0;
                d=d2-d1;
            }
            else{
                c=-1;
                d=d2+base-d1;
            }
            rv += d*p;
            p=p*10;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n1 : ");
        int n1= sc.nextInt();
        System.out.println("n2 : ");
        int n2= sc.nextInt();
        System.out.println("Base : ");
        int base= sc.nextInt();
        int result=anyBaseSubtraction(n1,n2,base);
        System.out.println("anyBaseSubtraction =>  "+result);
    }
}
