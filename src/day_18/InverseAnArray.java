package day_18;

public class InverseAnArray {
    public static void main(String[] args) {
        int[] arr={4,0,2,3,1};
        int n=arr.length;
        //encode the array
        for (int i = 0; i <n ; i++) {
            arr[arr[i]%n] += i*n;
        }
        for (int i = 0; i <n ; i++) {
            arr[i]=arr[i]/n;
        }
        for (int num: arr) {
            System.out.print(num+" ");
        }
    }
}
