package day_13;

import java.util.Scanner;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }
        String result = checkMagicSquare(n, grid);
        System.out.println(result);
    }

    static String checkMagicSquare(int n, int[][] grid) {
        int sum = 0;
        int temp = 0;
        int count = 0;
        int diagonal=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + grid[i][j];
            }
            if (i != 0 && temp==sum) {
                count++;
            }
            diagonal = diagonal+grid[i][count];
            temp = sum;
            sum=0;

        }

        if((count+1) == n && diagonal==temp)
        {
            return "Yes";
        }
        return "No";
    }
}