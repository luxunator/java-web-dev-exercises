package exercises;

import java.util.Scanner;

public class GasConsumed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of miles driven: ");
        double miles = input.nextDouble();

        System.out.print("Enter amount of gas consumed: ");
        double gasConsumed = input.nextDouble();

        double mpg = miles / gasConsumed;

        System.out.print("Miles per gallon is: " + mpg);
    }
}
