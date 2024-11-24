package day_5;
import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your length : ");
        double length=sc.nextDouble();
        System.out.println("Enter your width : ");
        double width=sc.nextDouble();
        double area=length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of a ractangle : "+perimeter);
    }
}
