package day_5;

import java.util.Scanner;
public class FindSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number_1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number_2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number_3 = sc.nextInt();
        if(number_1 < number_2 && number_1 < number_3)
        {
            System.out.println(number_1);
        }
        else if(number_2 < number_1 && number_2 < number_3)
        {
            System.out.println(number_2);
        }
        else {
            System.out.println(number_3);
        }
    }
}
