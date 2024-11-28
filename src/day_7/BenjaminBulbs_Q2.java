package day_7;

import java.util.Arrays;
import java.util.Scanner;

public class BenjaminBulbs_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many bulbs is there");
        int nBulbs=sc.nextInt();
//        System.out.println("Enter number of voltage fluctuation");
//        int nFluctuation = sc.nextInt();
//        if(nFluctuation==1)
//        {
//            System.out.println(nBulbs+" is on");
//            return;
//        }
//        boolean[] bulb_status=new boolean[nBulbs];
//        Arrays.fill(bulb_status,true);
//        for (int i = 2; i <= nFluctuation; i++) {
//            for (int j = i; j <= nBulbs; j =j+i) {
//                    bulb_status[j-1] = !bulb_status[j-1];
//            }
//        }
//        int count=1;
//        for (boolean i:bulb_status) {
//            if(i)
//            {
//                System.out.println(count+" number bulb is on");
//            }
//            count++;
//        }

////       ********** optimal approach ************
        for (int i = 1; i*i <= nBulbs ; i++) {
            System.out.println(i*i);
        }
    }
}
