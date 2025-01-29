package day_15;
import java.util.Scanner;

public class AnyBaseToanyBase_Q5 {
    public static int anyBaseToDecimal(int digit, int base) {
        int res = 0;
        int pow = 1;
        while (digit > 0) {
            int rem = digit % 10;
            digit = digit / 10;
            res = res + (rem * pow);
            pow = base * pow;
        }
        return res;
    }

    public static int decimaltoanyBase(int decimalNumber, int base) {
        int result = 0;
        int pow = 1;
        while (decimalNumber > 0) {
            int rem = decimalNumber % base;
            decimalNumber = decimalNumber / base;
            result += rem * pow;
            pow = pow * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digit : ");
        int digit = sc.nextInt();
        System.out.println("Base 1 : ");
        int b1 = sc.nextInt();
        System.out.println("Base 2 : ");
        int b2 = sc.nextInt();
        int anyBaseToDecimalRes = anyBaseToDecimal(digit, b1);
        int decimalToAnyBaseRes = decimaltoanyBase(anyBaseToDecimalRes, b2);
        System.out.println("=>" + decimalToAnyBaseRes);
    }
}
