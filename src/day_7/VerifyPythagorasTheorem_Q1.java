package day_7;

import java.util.Scanner;

public class VerifyPythagorasTheorem_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base : ");
        float number1=sc.nextFloat();
        System.out.println("Enter Perpendicular : ");
        float number2=sc.nextFloat();
        System.out.println("Enter Hypotenuse : ");
        float number3=sc.nextFloat();

        float hypotenuse=number1;
        if(hypotenuse <= number2)
        {
            hypotenuse=number2;
        }
        if(hypotenuse <= number3)
        {
            hypotenuse = number3;
        }
        // Identify the other two sides

        float side1, side2;
        if (hypotenuse == number1) {
            side1 = number2;
            side2 = number3;
        } else if (hypotenuse == number2) {
            side1 = number1;
            side2 = number3;
        } else {
            side1 = number1;
            side2 = number2;
        }

        // Use the Pythagorean theorem to verify
        float hypotenuseSquare = hypotenuse * hypotenuse;
        float sidesSquareSum = (side1 * side1) + (side2 * side2);

        // Use a tolerance for floating-point comparison
        boolean res=Math.abs(hypotenuseSquare - sidesSquareSum) < 0.0001;
        System.out.println(res);
    }
}
