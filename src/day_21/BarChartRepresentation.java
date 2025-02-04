public class BarChartRepresentation {
    public static void main(String[] args) {
        int[] arr={3, 1, 2, 7, 5};
        int max=arr[0];
        for (int i = 1; i<arr.length ; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for (int i = 0; i<max ; i++) {
            for (int j = 0; j<arr.length ; j++) {
                if(i==arr[j]);
                System.out.print("*\s");
            }
            System.out.println();
        }
    }
}
