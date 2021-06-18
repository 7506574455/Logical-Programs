package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = Utility.getUserSpecificInteger();
        int perfectNum = perfectNumber(num);
        if (perfectNum == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
    private static int perfectNumber(int num) {
        int i = 1;
        int sum = 0;
        for (i=1; i<num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}