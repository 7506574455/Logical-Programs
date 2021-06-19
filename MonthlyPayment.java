package logicalPrograms;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
    	
        System.out.print("Enter principle loan amount: ");
        float principleAmt = Utility.getUserSpecificInteger();
        System.out.print("Enter years to pay off the loan: ");
        int year = Utility.getUserSpecificInteger();
        System.out.print("Enter a rate of interest: ");
        float roi = Utility.getUserSpecificInteger();

        monthlyPayment(principleAmt, year, roi);
    }

    private static void monthlyPayment(float P, int Y, float R) {
        int n = Y * 12;     // number of months for 'y' years
        float r = R / (12*100);
        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
        System.out.printf("Monthly payment: %.2f", payment);
    }
}