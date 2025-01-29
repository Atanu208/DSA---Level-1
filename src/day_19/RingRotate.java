import java.util.*;
import java.lang.*;
import java.io.*;


class RingRotate {

    static void fillTheMainArray(int[][] arr,int s,int[] oneDArray)
    {
        int rowLen=arr.length;
        int colLen=arr[0].length;
        int rowBegin=s-1;
        int rowEnd=rowLen-s;
        int colBegin=s-1;
        int colEnd=colLen-s;
        int k=0;
        for (int i=rowBegin;i<=rowEnd;i++) {
             arr[i][colBegin]=oneDArray[k++];
        }
        colBegin++;
        for (int i=colBegin;i<=colEnd;i++) {
            arr[rowEnd][i]=oneDArray[k++];
         }
        rowEnd--;
        for(int i=rowEnd;i>=rowBegin;i--)
        {
           arr[i][colEnd]=oneDArray[k++];
        }
        colEnd--;
        for (int i=colEnd;i>=colBegin;i--) {
            arr[rowBegin][i]=oneDArray[k++];
        }
    }
    static void swap(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate1dArray(int[] arr,int r)
    {   //for anti clockwise
        if(r<0)
        {
            swap(arr,0,Math.abs(r)-1);
            swap(arr,Math.abs(r),arr.length-1);
            swap(arr,0,arr.length-1);
        }
        //for clockwise
        else{
            swap(arr,arr.length-r,arr.length-1);
            swap(arr,0,arr.length-r-1);
            swap(arr,0,arr.length-1);
        }
    }
    static int[] extract2d(int[][] arr,int s,int r)
    {
        int rowLen=arr.length;
        int colLen=arr[0].length;
        ArrayList<Integer> oneDList=new ArrayList<>();
        int rowBegin=s-1;
        int rowEnd=rowLen-s;
        int colBegin=s-1;
        int colEnd=colLen-s;
        for (int i=rowBegin;i<=rowEnd;i++) {
             oneDList.add(arr[i][colBegin]);
        }
        colBegin++;
        for (int i=colBegin;i<=colEnd;i++) {
            oneDList.add(arr[rowEnd][i]);
         }
        rowEnd--;
        for(int i=rowEnd;i>=rowBegin;i--)
        {
           oneDList.add(arr[i][colEnd]);
        }
        colEnd--;
        for (int i=colEnd;i>=colBegin;i--) {
            oneDList.add(arr[rowBegin][i]);
        }
        
        // Convert the list to an array and return it directly
        return oneDList.stream().mapToInt(Integer::intValue).toArray();
  
    }
    public static void main(String[] args) {
        int[][] arr={{1,   2,  3,  4,   5,  6},
                     {7,   8,  9,  10, 11, 12},
                     {13, 14, 15,  16, 17, 18},
                     {19, 20, 21,  22, 23, 24},
                     {25, 26, 27,  28, 29, 30},
                     {31, 32, 33,  34, 35, 36}};
        //fill a 1d array by the shell number
        int[] fillOneD=extract2d(arr,Math.abs(-2),1);
        // rotate the 1d array
        rotate1dArray(fillOneD,-2);
        fillTheMainArray(arr,Math.abs(-2),fillOneD);
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}