package day_17;

public class SpanofanArray {
    public static void main(String[] args) {
        int[] arr={6,15,30,40,4,11,9};
        int high=arr[0];
        int low=arr[0];
        for (int i = 1; i < arr.length; i++) {
                if(high<arr[i])
                {
                    high=arr[i];
                }
                else if (low>arr[i]){
                    low=arr[i];
                }
        }
        int difference=high-low;
        System.out.println("Span of array : "+difference);
    }
}
