package revision_day_1;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("How many time you want to rotate");
        int k= sc.nextInt();
        int temp=n;
        int nod=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        k=k%nod;

        if(k<0)
        {
            k=k+nod;
        }
        int div=1;
        int mult=1;
        for (int i = 1; i <= nod ; i++) {
            if(i<=k)
            {
                div= div*10;
            }
            else {
                mult=mult*10;
            }
        }
        int q=n/div;
        int rem=n%div;
        int rotate_num=(rem*mult)+q;
        System.out.println(rotate_num);
    }
}
