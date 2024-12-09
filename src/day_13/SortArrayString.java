package day_13;
import java.util.*;

class SortArrayString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        String sortedArr[] = sortArray(n,arr);
        for (String word: sortedArr) System.out.print(word + " ");
    }

// TODO: Implement this method
//abc a ab abc
    static String[] sortArray(int n, String[] arr) {
        int val=0;
        String[] res=new String[n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i].length() >= arr[j].length())
                {
                    res[n-i]= arr[i];
                }else {
                    res[i-1] = arr[i];
                }
            }
        }
        return res;
    }

}