package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rectangle length: ");
        int length = input.nextInt();

        System.out.print("Enter rectangle width: ");
        int width = input.nextInt();

        System.out.print("Area of rectangle is: " + (length * width));
    }
}
