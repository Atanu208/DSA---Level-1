package day_18;
//{25-*,19-**,30,28,35,10,21}//j=0 || 0<6
//{19,25-*,30-**,28,35,10,21}//j=1 || 1<6
//{19,25,30-*,28-**,35,10,21}//j=2 || 2<6
//{19,25,28,30-*,35-**,10,21}//j=3 || 3<6
//{19,25,28,30,35-*,10-**,21}//j=4 || 4<6
//{19,25,28,30,10,35-*,21-**}//j=5 || 5<6
//{19,25,28,30,10,21,35-*}//j=6 || 6<6
public class BubbleSort {
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={25,19,30,28,35,10,21};
        bubbleSort(arr);
        for (int num:arr) {
            System.out.print(num+" ");
        }
    }
}
