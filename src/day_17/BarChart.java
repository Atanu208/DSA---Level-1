package day_17;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element you want to enter : ");
        int len=sc.nextInt();
        int[] arr=new int[len];

        for (int i = 0; i <len ; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 1; i <len ; i++) {
            if(max<arr[i]) max=arr[i];
        }

        for (int i = max; i>=1 ; i--) {
            for (int j = 0; j <len ; j++) {
                if(arr[j]>=i) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
