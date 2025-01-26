package day_17;

import java.util.Scanner;

public class SumofTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element you want to store into your first array");
        int len1=sc.nextInt();
        int arr1[]=new int[len1];
        for (int i = 0; i <len1 ; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("How many element you want to store into your first array");
        int len2=sc.nextInt();
        int[] arr2=new int[len2];
        for (int i = 0; i <len2 ; i++) {
            arr2[i]=sc.nextInt();
        }


        int[] output=new int[len1>len2? len1+1 : len2+1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=output.length-1;
        int carry=0;
        while (i>=0 && j>=0)
        {
            int sum=arr1[i] + arr2[j]+carry;
            output[k]= sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0)
        {
            int sum=arr1[i] +carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while (j>=0)
        {
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }
    output[0]=carry;

        for (int l:output) {
            System.out.print(l+"\t");
        }
    }
}
