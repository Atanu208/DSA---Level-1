package day_11;
import java.util.Scanner;

public class Pattern12_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N - > ");
        int n=sc.nextInt();
        int temp = 0;
        int nextNum=1;
        for(int i=1;i <=n; i ++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(temp +"\t"); //0 // 1// 1 // 2 //
                int add = temp + nextNum; //temp = 0+1 (1) //add= 1+1 // 1+2 //2+3
                temp= nextNum; //temp=1; // temp=1 // 2 // 3 //
                nextNum=add;// nextNum=1 // nextNum=2 //3 // 5
            }
            System.out.println();
        }
    }
}
