package day_17;

import java.util.Scanner;

public class FindElementinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many element you want to enter into array : ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i <len ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Which element you want to find : ");
        int findElement=sc.nextInt();
        for (int i = 0; i <len ; i++) {
            if(findElement==arr[i])
            {
                System.out.println(findElement+" present in the index number "+i);
                return;
            }
        }
        System.out.println(-1);

    }
}
