package revision_day_1;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        float number1=sc.nextInt();
        System.out.println("Enter second number : ");
        float number2= sc.nextInt();
        System.out.println("Enter third number : ");
        float number3= sc.nextInt();
        float hypotenuse =number1;
        if(number2 == hypotenuse)
            hypotenuse=number2;
        if(number3>=hypotenuse)
            hypotenuse=number3;
        float side1,side2;
        if(number1==hypotenuse)
        {
            side1 =number2;
            side2 = number3;
        }
        else if(number2==hypotenuse)
        {
            side1=number1;
            side2=number2;
        }
        else{
            side1=number1;
            side2=number2;
        }
        hypotenuse = hypotenuse*hypotenuse;
        float side1Side2=(side1*side1)+(side2*side2);
        // Use a tolerance for floating-point comparison
        System.out.println((hypotenuse-side1Side2)<0.0001);

    }
}
