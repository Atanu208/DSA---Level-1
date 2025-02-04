public class SpanofanArray {
    public static void main(String[] args) {
        int[] arr={6,15,30,40,4,11,9};
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int span=max-min;
        System.out.println("Span of the array is :"+span);
    }
}
