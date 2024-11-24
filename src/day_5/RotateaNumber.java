package day_5;
import java.util.Scanner;

public class RotateaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        System.out.println("How many time you want to rotate your number : ");
        int k = sc.nextInt();

//        count the number of digit in n
        int temp = n; //copy of number
        int nod=0;
        while (temp!=0)
        {
            temp=temp/10;
            nod++;
        }
//        if k is higher like 103,231
        k=k%nod;
//        if k is negative
        if(k<0)
        {
            k=k+nod;
        }
//       for multiplyer and diviser
        int div = 1;
        int mult=1;
        for (int i = 0; i < nod ; i++) {
            if(k>i)
            {
                div= div*10;
            }
            else{
                mult = mult *10;
            }
        }
        int q=n/div;
        int r=n%div;
        int res= r * mult + q;
        System.out.println(res);
    }
}
