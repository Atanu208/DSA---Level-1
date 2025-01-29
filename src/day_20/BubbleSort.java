class BubbleSort {
    public static void main(String[] args) {
        // Bubble sort
        int[] arr={12,34,46,38,59,6};
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++) 
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}