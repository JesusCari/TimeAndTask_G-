package calculateaverage;

import java.util.Scanner;

/* @author diegolucas */

public class CalculateAverage {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter 3 numbers between spaces.");
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Average = "+avg);
    }

}
