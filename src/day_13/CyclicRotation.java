package day_13;

import java.util.*;

class CyclicRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static int[] cyclicRotation(int n, int[] arr, int k) {
        if(k==0 || k==n)
        {
            return arr;
        }
        for (int i = 0; i < n-k-1 ; i++) {
            int temp=arr[i];
            arr[i]=arr[n-k-1-i];
            arr[n-k-1-i] = temp;
        }
        for (int j = n-k; j < n-1 ; j++) {
            int temp=arr[j];
            arr[j]= arr[j+1];
            arr[j+1]=temp;
        }
        for (int i = 0; i <n/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return arr;
    }
}
