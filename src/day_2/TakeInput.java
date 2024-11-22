package day_2;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number=Integer.parseInt(obj.nextLine());
        String name=obj.nextLine();
        System.out.println("Welcome "+name+" Thanks for choosing number "+number);
    }
}
