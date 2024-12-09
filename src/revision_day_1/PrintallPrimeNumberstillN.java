package revision_day_1;

public class PrintallPrimeNumberstillN {
    public static void main(String[] args) {
        int low=2;
        int high=20;
        for (int i = low; i <= high ; i++) {
            for (int j = 2; j*j <i ; j++) {
                if(i%2==0) System.out.println("Not prime");
            }
        }
    }
}
