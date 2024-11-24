package day_5;

import java.util.Scanner;
public class GradeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) { // Check for invalid marks
            System.out.println("Invalid");
        } else if (marks < 25) { // Marks less than 25
            System.out.println("F");
        } else if (marks < 45) { // Marks from 25 to less than 45
            System.out.println("E");
        } else if (marks < 50) { // Marks from 45 to less than 50
            System.out.println("D");
        } else if (marks < 60) { // Marks from 50 to less than 60
            System.out.println("C");
        } else if (marks < 80) { // Marks from 60 to less than 80
            System.out.println("B");
        } else {                // Marks from 80 to 100
            System.out.println("A");
        }
    }
}
